package com.example.film.controller;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.film.model.Film;

@Controller
@RequestMapping(value = "/")

public class HomeController {
    @GetMapping("/")
    public String showHomePage(Model model) {
        model.addAttribute("name", "");
        return "index";
    }

    @GetMapping("/film")
    public String listFilm(Model model) {
        List<Film> films = List.of(
            new Film("F9: The Fast Saga","Cipher enlists the help of Jakob, Dom's younger brother to take revenge on Dom and his team","Justin Lin", 2021),
            new Film("Zack Snyder's Justice League", "Determined to ensure Superman's ultimate sacrifice was not in vain, Bruce Wayne aligns forces with Diana Prince with plans to recruit a team of metahumans to protect the world from an approaching threat of catastrophic proportions", "Zack Snyder", 2021),
            new Film("The Conjuring: The Devil Made Me Do It","The Warrens investigate a murder that may be linked to a demonic possession", "Michael Chaves",2021),
            new Film("John Wick: Chapter 3 - Parabellum", "John Wick is on the run after killing a member of the international assassins' guild, and with a $14 million price tag on his head, he is the target of hit men and women everywhere", "Chad Stahelski", 2019),
            new Film("Cruella", "Cruella, which is set in 1970s London amidst the punk rock revolution, follows a young grifter named Estella, a clever and creative girl determined to make a name for herself with her designs", "Craig Gillespie", 2021));
        model.addAttribute("film", films);
        return "film";
    }
}
