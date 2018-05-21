package com.arjaycodes.codejokes.controller;

import com.arjaycodes.codejokes.service.ChuckNorrisJokesServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ChuckNorrisController {

    private ChuckNorrisJokesServiceImpl quoteService;

    @Autowired
    public ChuckNorrisController(ChuckNorrisJokesServiceImpl quoteService) {
        this.quoteService = quoteService;
    }

    @RequestMapping("/chuck")
    public String getRandomChuckQuote(Model model) {

        model.addAttribute("randoJoke", quoteService.getJoke());

        return "chuck";
    }
}
