package com.misbah.kaoutar.misbahkaoutarexamjee.dtos;

import lombok.Data;

import java.util.Date;

@Data
public class LocationDTO {
    private Long id;
    private Date dateDebut;
    private Date dateFin;
    private Double montantTotal;
    private String clientNom;
    private String clientEmail;
    private Long vehiculeId;
}
