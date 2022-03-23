package com.example.petinder.petinderApp;

public class Pet {
    private final long id;
    private final String name;
    private final PetKind kind;
    private final String profileText;

    public Pet(long id, String name, PetKind kind, String profileText) {
        this.id = id;
        this.name = name;
        this.kind = kind;
        this.profileText = profileText;
    }

    public long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public PetKind getKind() {
        return kind;
    }

    public String getProfileText() {
        return profileText;
    }
}
