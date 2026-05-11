package com.misbah.kaoutar.misbahkaoutarexamjee.entities;

import com.misbah.kaoutar.misbahkaoutarexamjee.enums.BoiteVitesse;
import com.misbah.kaoutar.misbahkaoutarexamjee.enums.TypeCarburant;
import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Voiture extends Vehicule {
    private int nombrePortes;

    @Enumerated(EnumType.STRING)
    private TypeCarburant typeCarburant;

    @Enumerated(EnumType.STRING)
    private BoiteVitesse boiteVitesse;
}
