package com.misbah.kaoutar.misbahkaoutarexamjee.entities;

import com.misbah.kaoutar.misbahkaoutarexamjee.enums.OuiNon;
import com.misbah.kaoutar.misbahkaoutarexamjee.enums.TypeMoto;
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

public class Moto extends Vehicule {
    private Integer cylindree;

    @Enumerated(EnumType.STRING)
    private TypeMoto typeMoto;

    private OuiNon casqueInclus;
}
