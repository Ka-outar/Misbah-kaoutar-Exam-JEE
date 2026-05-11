package com.misbah.kaoutar.misbahkaoutarexamjee.mappers;

import com.misbah.kaoutar.misbahkaoutarexamjee.dtos.MotoDTO;
import com.misbah.kaoutar.misbahkaoutarexamjee.entities.Agence;
import com.misbah.kaoutar.misbahkaoutarexamjee.entities.Moto;
import com.misbah.kaoutar.misbahkaoutarexamjee.repositories.AgenceRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class MotoMapper {

    @Autowired
    private AgenceRepository agenceRepository;

    public MotoDTO toDTO(Moto moto) {
        if (moto == null) return null;
        MotoDTO dto = new MotoDTO();
        dto.setId(moto.getId());
        dto.setMarque(moto.getMarque());
        dto.setModele(moto.getModele());
        dto.setMatricule(moto.getMatricule());
        dto.setPrixParJour(moto.getPrixParJour());
        dto.setDateMiseEnService(moto.getDateMiseEnService());
        dto.setStatut(moto.getStatut());
        dto.setCylindree(moto.getCylindree());
        dto.setTypeMoto(moto.getTypeMoto());
        dto.setCasqueInclus(moto.getCasqueInclus());
        dto.setAgenceId(moto.getAgence() != null ? moto.getAgence().getId() : null);
        return dto;
    }

    public Moto toEntity(MotoDTO dto) {
        if (dto == null) return null;
        Moto moto = new Moto();
        moto.setId(dto.getId());
        moto.setMarque(dto.getMarque());
        moto.setModele(dto.getModele());
        moto.setMatricule(dto.getMatricule());
        moto.setPrixParJour(dto.getPrixParJour());
        moto.setDateMiseEnService(dto.getDateMiseEnService());
        moto.setStatut(dto.getStatut());
        moto.setCylindree(dto.getCylindree());
        moto.setTypeMoto(dto.getTypeMoto());
        moto.setCasqueInclus(dto.getCasqueInclus());

        if (dto.getAgenceId() != null) {
            Agence agence = agenceRepository.findById(dto.getAgenceId()).orElse(null);
            moto.setAgence(agence);
        }
        return moto;
    }
}