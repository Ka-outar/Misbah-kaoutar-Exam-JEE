package com.misbah.kaoutar.misbahkaoutarexamjee.dtos;

import com.misbah.kaoutar.misbahkaoutarexamjee.enums.StatutVehicule;
import lombok.Data;

import java.util.Date;

@Data
public class VehiculeDTO {
    private Long id;
    private String marque;
    private String modele;
    private String matricule;
    private Double prixParJour;
    private Date dateMiseEnService;
    private StatutVehicule statut;
    private Long agenceId;
}
