package com.misbah.kaoutar.misbahkaoutarexamjee.entities;

import com.misbah.kaoutar.misbahkaoutarexamjee.enums.BoiteVitesse;
import com.misbah.kaoutar.misbahkaoutarexamjee.enums.TypeCarburant;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import lombok.Data;

@Data
@Entity

public class Voiture extends Vehicule {
    private Integer nombrePortes;

    @Enumerated(EnumType.STRING)
    private TypeCarburant typeCarburant;

    @Enumerated(EnumType.STRING)
    private BoiteVitesse boiteVitesse;
}
