package com.example.petinder.petinderApp;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "pets", produces = "application/json")
public class PetController {

    private PetService petService;

    public PetController(PetService petService) {
        this.petService = petService;
    }

    //    @GetMapping
//    public String helloPets() {
//        return "Hello Pets!";
//    }

    @GetMapping
    public List<PetDTO> getAllPets() {
        return petService.getAllPets();
    }
}
