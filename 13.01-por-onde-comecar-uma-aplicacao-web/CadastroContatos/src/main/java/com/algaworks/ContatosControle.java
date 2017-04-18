package com.algaworks;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.UUID;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class ContatosControle {
	
	private static final ArrayList<Contato> LISTA_CONTATOS = new ArrayList<Contato>();
	
	static {
		LISTA_CONTATOS.addAll(Arrays.asList(
				new Contato("1", "Maria", "+55 11 00000 0000"),
				new Contato("2", "João",  "+55 11 00000 0000"),
				new Contato("3", "Normandes", "+55 34 00000 0000"),
				new Contato("4", "Thiago", "+55 34 00000 0000"),
				new Contato("5", "Alexandre", "+55 34 00000 0000")
			));
	}
	
	@GetMapping("/")
	public String index() {
		return "index";
	}
	
	@GetMapping("/contatos")
	public ModelAndView listar() {
		ModelAndView modelAndView = new ModelAndView("listar");
		
		modelAndView.addObject("contatos", LISTA_CONTATOS);
		
		return modelAndView;
	}
	
	@GetMapping("/contatos/novo")
	public ModelAndView novo() {
		ModelAndView modelAndView = new ModelAndView("formulario");
		
		modelAndView.addObject("contato", new Contato());
		
		return modelAndView;
	}
	
	@PostMapping("/contatos")
	public String cadastrar(Contato contato) {
		contato.setId(UUID.randomUUID().toString());
		
		LISTA_CONTATOS.add(contato);
		
		return "redirect:/contatos";
	}

	@GetMapping("/contatos/{id}/editar")
	public ModelAndView editar(@PathVariable String id) {
		ModelAndView modelAndView = new ModelAndView("formulario");
		
		Contato contato = procurarContato(id);
		
		modelAndView.addObject("contato", contato);
		
		return modelAndView;
	}
	
	@PutMapping("/contatos/{id}")
	public String atualizar(Contato contato) {
		Integer indiceContato = procurarIndiceContato(contato.getId());
		
		remover(contato.getId());
		
		LISTA_CONTATOS.add(indiceContato, contato);
		
		return "redirect:/contatos";
	}
	
	@DeleteMapping("/contatos/{id}")
	public String remover(@PathVariable String id) {
		Contato contato = procurarContato(id);
		
		if (contato != null) {
			LISTA_CONTATOS.remove(contato);
		}
		
		return "redirect:/contatos";
	}
	
	public Contato procurarContato(String id) {
		Integer indiceContato = procurarIndiceContato(id);
		
		if (indiceContato == null) {
			return null;
		}
		
		return LISTA_CONTATOS.get(indiceContato);
	}
	
	public Integer procurarIndiceContato(String id) {
		for (int i = 0; i < LISTA_CONTATOS.size(); i++) {
			Contato contato = LISTA_CONTATOS.get(i);
			
			if (contato.getId().equals(id)) {
				return i;
			}
		}
		
		return null;
	}
}