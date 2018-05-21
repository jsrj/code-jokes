package com.arjaycodes.codejokes.service;

import guru.springframework.norris.chuck.ChuckNorrisQuotes;
import org.springframework.stereotype.Service;

@Service
public class ChuckNorrisJokesServiceImpl implements ChuckNorrisJokesService {

    private final ChuckNorrisQuotes quotes;
    public ChuckNorrisJokesServiceImpl() {
        this.quotes = new ChuckNorrisQuotes();
    }

    @Override
    public String getJoke() {
        return quotes.getRandomQuote();
    }
}
