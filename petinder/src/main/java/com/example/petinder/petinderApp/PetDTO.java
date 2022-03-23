package com.example.petinder.petinderApp;

public class PetDTO {
    private final long id;
    private final String name;
    private final PetKind kind;
    private final String profileText;

    public PetDTO(long id, String name, PetKind kind, String profileText) {
        this.id = id;
        this.name = name;
        this.kind = kind;
        this.profileText = profileText;
    }
}
