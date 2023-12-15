package br.org.com.recode.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import br.org.com.recode.model.CompraModel;
import br.org.com.recode.repository.ClienteRepository;
import br.org.com.recode.repository.CompraRepository;
import br.org.com.recode.repository.PassagemRepository;

@Controller
@RequestMapping("/compra")
public class CompraController {
	
	
	@Autowired
	private CompraRepository compraRepository;
	
	 @Autowired
	    private PassagemRepository passagemRepository; 
	    @Autowired
	    private ClienteRepository clienteRepository; 
	
	@GetMapping
	public ModelAndView compra() {
		ModelAndView modelAndView = new ModelAndView ("views/compra/index.html");
		modelAndView.addObject("compras",compraRepository.findAll());
		modelAndView.addObject("passagens", passagemRepository.findAll()); 
        modelAndView.addObject("clientes", clienteRepository.findAll()); 
		
		modelAndView.addObject("compra", new CompraModel());

		return modelAndView;
		
	}
	
	
	@PostMapping("/cadastrar")
	
	public String cadastrar(@ModelAttribute("compra") CompraModel compra) {

		double preco = passagemRepository.findById(compra.getP1().getId_passagem()).get().getPreco();
		compra.setTotal_compra(preco);
       
        compraRepository.save(compra);

        
		return "redirect:/compra";
	}
	
	
	@GetMapping("/{id_compra}/excluir")
	public String excluir(@PathVariable Long id_compra) {
		compraRepository.deleteById(id_compra);

		return "redirect:/compra";
	}
	

	}