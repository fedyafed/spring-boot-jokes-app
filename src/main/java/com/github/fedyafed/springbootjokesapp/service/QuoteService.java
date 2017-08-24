package com.github.fedyafed.springbootjokesapp.service;

import guru.springframework.norris.chuck.ChuckNorrisQuotes;
import org.springframework.stereotype.Service;

@Service
public class QuoteService {
    private final ChuckNorrisQuotes chuckNorrisQuotes;

    public QuoteService(ChuckNorrisQuotes chuckNorrisQuotes) {
        this.chuckNorrisQuotes = chuckNorrisQuotes;
    }

    public String getQuote() {
        return chuckNorrisQuotes.getRandomQuote();
    }
}
