package com.example.enkelmotorvognregister;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class MotorvognController {

    public final List<Motorvogn> alleBiler = new ArrayList<>();

    @GetMapping("/lagre")
    public void lagreBiller(Motorvogn innBiler){
        alleBiler.add(innBiler);
    }
    @GetMapping("/hentAlle")
    public List<Motorvogn> hentAlle(){
        return alleBiler;
    }

    @GetMapping("/slettAlle")
    public void slettAlle(){
        alleBiler.clear();
    }



   /* private final List<Motorvogn> motorvognList = new ArrayList<>();

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

    */
}