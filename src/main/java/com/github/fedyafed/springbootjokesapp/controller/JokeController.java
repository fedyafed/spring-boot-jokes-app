package com.github.fedyafed.springbootjokesapp.controller;

import com.github.fedyafed.springbootjokesapp.service.QuoteService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class JokeController {
    private final QuoteService quoteService;

    public JokeController(QuoteService quoteService) {
        this.quoteService = quoteService;
    }

    @RequestMapping("/")
    public String getRoot(ModelMap map) {
        map.addAttribute("joke", quoteService.getQuote());
        return "chucknorris";
    }
}
