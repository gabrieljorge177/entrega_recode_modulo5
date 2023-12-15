package br.org.com.recode.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import br.org.com.recode.model.PassagemModel;
import br.org.com.recode.repository.PassagemRepository;

@Controller
@RequestMapping("/passagem")
public class PassagemController {
	
	
	@Autowired
	private PassagemRepository passagemRepository;
	
	@GetMapping
	public ModelAndView passagem() {
		ModelAndView modelAndView = new ModelAndView ("views/passagem/index.html");
		modelAndView.addObject("passagens",passagemRepository.findAll());
		
		modelAndView.addObject("passagem", new PassagemModel());

		return modelAndView;
		
	}
	
	@PostMapping("/cadastrar")
	public String cadastrar(PassagemModel passagem) {
		passagemRepository.save(passagem);

		return "redirect:/passagem";
	}
	
	@GetMapping("/{id_passagem}/excluir")
	public String excluir(@PathVariable Long id_passagem) {
		passagemRepository.deleteById(id_passagem);

		return "redirect:/passagem";
	}
	

	}

