package com.example.enkelmotorvognregister;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.ArrayList;
import java.util.List;

public class MotorvognController {
    private final List<Motorvogn> motorvognList = new ArrayList<>();

    @GetMapping("/motorvogn")
    public String visMotorvognSide(Model model) {
        model.addAttribute("motorvognList", motorvognList);
        return "motorvogn";
    }

    @PostMapping("/leggtillmotorvogn")
    public String leggTilMotorvogn(@ModelAttribute Motorvogn motorvogn) {
        motorvognList.add(motorvogn);
        return "redirect:/motorvogn";
    }
}