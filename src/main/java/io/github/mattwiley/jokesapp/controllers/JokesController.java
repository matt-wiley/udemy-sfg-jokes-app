package io.github.mattwiley.jokesapp.controllers;

import io.github.mattwiley.jokesapp.services.JokesService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class JokesController {

  private final JokesService jokesService;

  public JokesController(JokesService jokesService) {
    this.jokesService = jokesService;
  }

  @RequestMapping("/")
  public String getRandomJoke(Model model) {
    model.addAttribute("joke", jokesService.getRandomJoke());
    return "index";
  }

}
