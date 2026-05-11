package com.misbah.kaoutar.misbahkaoutarexamjee.entities;

import jakarta.persistence.*;

import java.time.LocalDate;

@Entity
public class Location {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private LocalDate dateDebut;
    private LocalDate dateFin;
    private double prixTotal;

    @ManyToOne
    private Vehicule vehicule;
}
