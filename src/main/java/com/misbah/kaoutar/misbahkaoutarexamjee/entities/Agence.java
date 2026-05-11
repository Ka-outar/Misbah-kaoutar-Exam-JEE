package com.misbah.kaoutar.misbahkaoutarexamjee.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.OneToMany;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor

public class Agence {

    private Long id;
    private String nom;
    private String adresse;
    private String telephone;
    @OneToMany(mappedBy = "agence")
    private List<Vehicule> vehicules;
}
