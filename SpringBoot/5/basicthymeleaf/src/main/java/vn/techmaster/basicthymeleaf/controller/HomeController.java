package vn.techmaster.basicthymeleaf.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import vn.techmaster.basicthymeleaf.repository.InMemoryRepository;
import vn.techmaster.basicthymeleaf.model.Person;

@Controller
public class HomeController {
    @Autowired private InMemoryRepository repo;

    @GetMapping("/")
    public String getHome() {
        return "index";
    }
    
    @GetMapping("/people1")
    public String listPeople(Model model) {
        model.addAttribute("people", repo.getPeople());
        return "people1";
    }

    @GetMapping("/people2")
    public String listPeopleTwoCollumns(Model model) {
        model.addAttribute("people", repo.getPeople());
        return "people2";
    }
}
