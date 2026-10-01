package br.com.limas.twtodo.controllers;

import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.bind.annotation.GetMapping;

import br.com.limas.twtodo.repositories.ServicosRepository;

@Controller 
public class ServicoController {

  final ServicosRepository servicosRepository;

  public ServicoController(ServicosRepository servicosRepository) {
    this.servicosRepository = servicosRepository;
  }

  @GetMapping ("/servicos")
  public ModelAndView list() {
    return new ModelAndView(
      "servicos", 
      Map.of("servicos", servicosRepository.findAll())
    );

   
   

   
  }
  
}
