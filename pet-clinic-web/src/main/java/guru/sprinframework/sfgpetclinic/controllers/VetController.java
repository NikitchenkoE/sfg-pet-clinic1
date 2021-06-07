package guru.sprinframework.sfgpetclinic.controllers;

import guru.sprinframework.sfgpetclinic.services.VetService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class VetController {

    private final VetService vetService;

    public VetController(VetService vetService) {
        this.vetService = vetService;
    }

    @RequestMapping({"/vets","/vets/vetIndex","vets/vetIndex.html" })
public String listVets (Model model) {
        model.addAttribute("vets", vetService.findAll());
    return "vets/vetIndex";
}



}
