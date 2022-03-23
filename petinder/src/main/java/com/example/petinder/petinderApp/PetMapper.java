package com.example.petinder.petinderApp;



import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class PetMapper {

    public PetDTO toDTO(Pet pet) {
        return new PetDTO(pet.getId(), pet.getName(), pet.getKind(), pet.getProfileText());
    }

    public List<PetDTO> toDTO(List<Pet> pets) {
        return pets.stream()
                .map(this::toDTO)
                .toList();
    }


}
