package com.misbah.kaoutar.misbahkaoutarexamjee.entities;

import com.misbah.kaoutar.misbahkaoutarexamjee.enums.TypeMoto;
import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;

@Entity
@DiscriminatorValue("MOTO")
public class Moto extends Vehicule {
    private double cylindree;

    @Enumerated(EnumType.STRING)
    private TypeMoto typeMoto;

    private boolean casqueInclus;
}
