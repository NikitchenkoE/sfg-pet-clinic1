package guru.sprinframework.sfgpetclinic.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("/owners")
@Controller
public class OwnerController {


    @RequestMapping({"","/","/ownerIndex","/ownerIndex.html"})
    public String listOwners(){
        return "owners/ownerIndex";
    }
}
