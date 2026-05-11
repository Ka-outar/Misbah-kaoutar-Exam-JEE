package com.misbah.kaoutar.misbahkaoutarexamjee.mappers;

import com.misbah.kaoutar.misbahkaoutarexamjee.dtos.VoitureDTO;
import com.misbah.kaoutar.misbahkaoutarexamjee.entities.Agence;
import com.misbah.kaoutar.misbahkaoutarexamjee.entities.Voiture;
import com.misbah.kaoutar.misbahkaoutarexamjee.repositories.AgenceRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class VoitureMapper {

    @Autowired
    private AgenceRepository agenceRepository;

    public VoitureDTO toDTO(Voiture voiture) {
        if (voiture == null) return null;
        VoitureDTO dto = new VoitureDTO();
        dto.setId(voiture.getId());
        dto.setMarque(voiture.getMarque());
        dto.setModele(voiture.getModele());
        dto.setMatricule(voiture.getMatricule());
        dto.setPrixParJour(voiture.getPrixParJour());
        dto.setDateMiseEnService(voiture.getDateMiseEnService());
        dto.setStatut(voiture.getStatut());
        dto.setNombrePortes(voiture.getNombrePortes());
        dto.setTypeCarburant(voiture.getTypeCarburant());
        dto.setBoiteVitesse(voiture.getBoiteVitesse());
        dto.setAgenceId(voiture.getAgence() != null ? voiture.getAgence().getId() : null);
        return dto;
    }

    public Voiture toEntity(VoitureDTO dto) {
        if (dto == null) return null;
        Voiture voiture = new Voiture();
        voiture.setId(dto.getId());
        voiture.setMarque(dto.getMarque());
        voiture.setModele(dto.getModele());
        voiture.setMatricule(dto.getMatricule());
        voiture.setPrixParJour(dto.getPrixParJour());
        voiture.setDateMiseEnService(dto.getDateMiseEnService());
        voiture.setStatut(dto.getStatut());
        voiture.setNombrePortes(dto.getNombrePortes());
        voiture.setTypeCarburant(dto.getTypeCarburant());
        voiture.setBoiteVitesse(dto.getBoiteVitesse());

        if (dto.getAgenceId() != null) {
            Agence agence = agenceRepository.findById(dto.getAgenceId()).orElse(null);
            voiture.setAgence(agence);
        }
        return voiture;
    }
}