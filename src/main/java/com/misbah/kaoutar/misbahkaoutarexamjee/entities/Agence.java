package com.misbah.kaoutar.misbahkaoutarexamjee.entities;

import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.AllArgsConstructor;
import java.util.List;

@Data
@Entity
@Table(name = "agences")
@NoArgsConstructor
@AllArgsConstructor
public class Agence {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nom;
    private String adresse;
    private String ville;
    private String telephone;

    @OneToMany(mappedBy = "agence")
    private List<Vehicule> vehicules;
}