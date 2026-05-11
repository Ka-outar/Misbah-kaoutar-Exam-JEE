package com.misbah.kaoutar.misbahkaoutarexamjee.entities;

import com.misbah.kaoutar.misbahkaoutarexamjee.enums.Vehicule_Status;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
import java.util.List;

@Entity
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@Data
@NoArgsConstructor
@AllArgsConstructor

public abstract class Vehicule {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String marque;
    private String modele;
    private String matricule;
    private double prixParJour;
    private LocalDate dateMiseEnService;

    @Enumerated(EnumType.STRING)
    private Vehicule_Status statut;

    @ManyToOne
    private Agence agence;

    @OneToMany(mappedBy = "vehicule")
    private List<Location> locations;
}