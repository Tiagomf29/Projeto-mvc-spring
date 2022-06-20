package br.com.projetomvc.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

import br.com.projetomvc.entity.Cliente;
import br.com.projetomvc.service.ClienteService;

@Controller
public class ClienteController {
	
	@Autowired
	private ClienteService clienteService;
	
	@GetMapping("/home")
	public String home() {
		return "home";
	}
	
	@PostMapping("/cadastrar")
	public String cadastrar(@Valid Cliente cliente) {
		clienteService.cadastrar(cliente);
		return "redirect:/lista";
	}
	
	@GetMapping("/lista")
	public ModelAndView lista() {
		ModelAndView mv = new ModelAndView("lista"); // lista é o nome do arquivo html
		mv.addObject("lista",clienteService.listar());
		return mv;
	}
}
