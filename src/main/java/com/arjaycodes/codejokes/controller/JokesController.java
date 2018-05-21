package com.arjaycodes.codejokes.controller;

import com.arjaycodes.codejokes.entity.Joke;
import com.arjaycodes.codejokes.repository.JokeRepository;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

@Controller
public class JokesController {

    private JokeRepository jokeRepository;
    public JokesController(JokeRepository jokeRepository) {
        this.jokeRepository = jokeRepository;
    }

    @RequestMapping({"/", ""})
    public String getJokes(Model model) {
        String viewName = "jokes";

        List<Joke> allJokes = new ArrayList<>((ArrayList<Joke>) jokeRepository.findAll());

        model.addAttribute(viewName, allJokes.get(new Random().nextInt(allJokes.size())));

        return viewName;
    }
}
