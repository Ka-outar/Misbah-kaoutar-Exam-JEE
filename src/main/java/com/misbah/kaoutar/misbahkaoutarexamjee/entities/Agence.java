package com.misbah.kaoutar.misbahkaoutarexamjee.entities;

import jakarta.persistence.OneToMany;

import java.util.List;

public class Agence {

    private Long id;
    private String nom;
    private String adresse;
    private String telephone;
    @OneToMany(mappedBy = "agence")
    private List<Vehicule> vehicules;
}
