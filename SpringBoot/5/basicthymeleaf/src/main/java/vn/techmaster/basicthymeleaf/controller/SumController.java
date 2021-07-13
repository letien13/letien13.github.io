package vn.techmaster.basicthymeleaf.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import vn.techmaster.basicthymeleaf.request.SumRequest;
import vn.techmaster.basicthymeleaf.response.SumResult;

@Controller
@RequestMapping("/sum")

public class SumController {
    @GetMapping
    public String getNumsForm(Model model) {
        model.addAttribute("sumRequest", new SumRequest());
        model.addAttribute("sumResult", null);
        return "sum";
    }

    @PostMapping()
    public String sumNums(@ModelAttribute SumRequest request, BindingResult bindingResult, Model model) {
        if (!bindingResult.hasErrors()) {
            int result = request.getNumberA() + request.getNumberB();

            SumResult sumResult = new SumResult(result);

            model.addAttribute("sumRequest", request);
            model.addAttribute("sumResult", sumResult);
        }
        return "sum";
    }

}
