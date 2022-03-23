package com.example.petinder.petinderApp;

import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class PetRepository {
    public List<Pet> getAllPets() {
        return List.of(
                new Pet(111222333, "Tom", PetKind.CAT, "0 truths 2 lies: 1. I'm a real cat 2. I'm good at chasing mice"),
                new Pet(333111222, "Doge", PetKind.DOG, "Much pet, such Spring, wow"),
                new Pet(999666999, "HotChick", PetKind.CHICKEN, "What am I doing on that app roflmao")
        );

    }
}
