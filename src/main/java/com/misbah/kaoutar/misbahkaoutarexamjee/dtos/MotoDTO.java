package com.misbah.kaoutar.misbahkaoutarexamjee.dtos;

import com.misbah.kaoutar.misbahkaoutarexamjee.enums.OuiNon;
import com.misbah.kaoutar.misbahkaoutarexamjee.enums.StatutVehicule;
import com.misbah.kaoutar.misbahkaoutarexamjee.enums.TypeMoto;
import lombok.Data;

import java.util.Date;

@Data
public class MotoDTO {
    private Long id;
    private String marque;
    private String modele;
    private String matricule;
    private Double prixParJour;
    private Date dateMiseEnService;
    private StatutVehicule statut;
    private Long agenceId;
    private Integer cylindree;        // ← cylindree (pas cylindre)
    private TypeMoto typeMoto;
    private OuiNon casqueInclus;
}
