package com.misbah.kaoutar.misbahkaoutarexamjee.dtos;

import com.misbah.kaoutar.misbahkaoutarexamjee.enums.BoiteVitesse;
import com.misbah.kaoutar.misbahkaoutarexamjee.enums.StatutVehicule;
import com.misbah.kaoutar.misbahkaoutarexamjee.enums.TypeCarburant;
import lombok.Data;

import java.util.Date;

@Data
public class VoitureDTO extends VehiculeDTO {
        private Long id;
        private String marque;
        private String modele;
        private String matricule;
        private Double prixParJour;
        private Date dateMiseEnService;
        private StatutVehicule statut;
        private Long agenceId;
        private Integer nombrePortes;
        private TypeCarburant typeCarburant;
        private BoiteVitesse boiteVitesse;
}
