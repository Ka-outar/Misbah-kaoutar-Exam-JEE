package com.misbah.kaoutar.misbahkaoutarexamjee.dtos;

import com.misbah.kaoutar.misbahkaoutarexamjee.enums.BoiteVitesse;
import com.misbah.kaoutar.misbahkaoutarexamjee.enums.TypeCarburant;
import lombok.Data;

@Data
public class VoitureDTO extends VehiculeDTO {
    private Integer nombrePortes;
    private TypeCarburant typeCarburant;
    private BoiteVitesse boiteVitesse;
}
