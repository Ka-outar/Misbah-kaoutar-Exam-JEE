package com.misbah.kaoutar.misbahkaoutarexamjee.mappers;

import com.misbah.kaoutar.misbahkaoutarexamjee.dtos.AgenceDTO;
import com.misbah.kaoutar.misbahkaoutarexamjee.entities.Agence;
import org.springframework.stereotype.Component;

@Component
public class AgenceMapper {

    public AgenceDTO toDTO(Agence agence) {
        if (agence == null) return null;
        AgenceDTO dto = new AgenceDTO();
        dto.setId(agence.getId());
        dto.setNom(agence.getNom());
        dto.setAdresse(agence.getAdresse());
        dto.setVille(agence.getVille());
        dto.setTelephone(agence.getTelephone());
        return dto;
    }

    public Agence toEntity(AgenceDTO dto) {
        if (dto == null) return null;
        Agence agence = new Agence();
        agence.setId(dto.getId());
        agence.setNom(dto.getNom());
        agence.setAdresse(dto.getAdresse());
        agence.setVille(dto.getVille());
        agence.setTelephone(dto.getTelephone());
        return agence;
    }
}