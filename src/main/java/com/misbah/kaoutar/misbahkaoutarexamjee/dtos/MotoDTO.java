package com.misbah.kaoutar.misbahkaoutarexamjee.dtos;

import com.misbah.kaoutar.misbahkaoutarexamjee.enums.OuiNon;
import com.misbah.kaoutar.misbahkaoutarexamjee.enums.TypeMoto;
import lombok.Data;

@Data
public class MotoDTO extends VehiculeDTO {
    private Integer cylindree;
    private TypeMoto typeMoto;
    private OuiNon casqueInclus;
}
