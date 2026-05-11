package com.misbah.kaoutar.misbahkaoutarexamjee.services;

import com.misbah.kaoutar.misbahkaoutarexamjee.dtos.MotoDTO;
import com.misbah.kaoutar.misbahkaoutarexamjee.dtos.VoitureDTO;
import com.misbah.kaoutar.misbahkaoutarexamjee.entities.Agence;
import com.misbah.kaoutar.misbahkaoutarexamjee.entities.Moto;
import com.misbah.kaoutar.misbahkaoutarexamjee.entities.Voiture;
import com.misbah.kaoutar.misbahkaoutarexamjee.repositories.AgenceRepository;
import com.misbah.kaoutar.misbahkaoutarexamjee.repositories.MotoRepository;
import com.misbah.kaoutar.misbahkaoutarexamjee.repositories.VoitureRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class VehiculeServiceImpl implements VehiculeService {

    @Autowired
    private VoitureRepository voitureRepository;

    @Autowired
    private MotoRepository motoRepository;

    @Autowired
    private AgenceRepository agenceRepository;

    @Override
    public VoitureDTO createVoiture(VoitureDTO dto) {
        Voiture voiture = new Voiture();
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

        Voiture saved = voitureRepository.save(voiture);
        dto.setId(saved.getId());
        return dto;
    }

    @Override
    public List<VoitureDTO> getAllVoitures() {
        List<VoitureDTO> result = new ArrayList<>();
        for (Voiture v : voitureRepository.findAll()) {
            VoitureDTO dto = new VoitureDTO();
            dto.setId(v.getId());
            dto.setMarque(v.getMarque());
            dto.setModele(v.getModele());
            dto.setMatricule(v.getMatricule());
            dto.setPrixParJour(v.getPrixParJour());
            dto.setDateMiseEnService(v.getDateMiseEnService());
            dto.setStatut(v.getStatut());
            dto.setNombrePortes(v.getNombrePortes());
            dto.setTypeCarburant(v.getTypeCarburant());
            dto.setBoiteVitesse(v.getBoiteVitesse());
            dto.setAgenceId(v.getAgence() != null ? v.getAgence().getId() : null);
            result.add(dto);
        }
        return result;
    }

    @Override
    public VoitureDTO getVoitureById(Long id) {
        Voiture v = voitureRepository.findById(id).orElse(null);
        if (v == null) return null;
        VoitureDTO dto = new VoitureDTO();
        dto.setId(v.getId());
        dto.setMarque(v.getMarque());
        dto.setModele(v.getModele());
        dto.setMatricule(v.getMatricule());
        dto.setPrixParJour(v.getPrixParJour());
        dto.setDateMiseEnService(v.getDateMiseEnService());
        dto.setStatut(v.getStatut());
        dto.setNombrePortes(v.getNombrePortes());
        dto.setTypeCarburant(v.getTypeCarburant());
        dto.setBoiteVitesse(v.getBoiteVitesse());
        dto.setAgenceId(v.getAgence() != null ? v.getAgence().getId() : null);
        return dto;
    }

    @Override
    public MotoDTO createMoto(MotoDTO dto) {
        Moto moto = new Moto();
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

        Moto saved = motoRepository.save(moto);
        dto.setId(saved.getId());
        return dto;
    }

    @Override
    public List<MotoDTO> getAllMotos() {
        List<MotoDTO> result = new ArrayList<>();
        for (Moto m : motoRepository.findAll()) {
            MotoDTO dto = new MotoDTO();
            dto.setId(m.getId());
            dto.setMarque(m.getMarque());
            dto.setModele(m.getModele());
            dto.setMatricule(m.getMatricule());
            dto.setPrixParJour(m.getPrixParJour());
            dto.setDateMiseEnService(m.getDateMiseEnService());
            dto.setStatut(m.getStatut());
            dto.setCylindree(m.getCylindree());
            dto.setTypeMoto(m.getTypeMoto());
            dto.setCasqueInclus(m.getCasqueInclus());
            dto.setAgenceId(m.getAgence() != null ? m.getAgence().getId() : null);
            result.add(dto);
        }
        return result;
    }

    @Override
    public MotoDTO getMotoById(Long id) {
        Moto m = motoRepository.findById(id).orElse(null);
        if (m == null) return null;
        MotoDTO dto = new MotoDTO();
        dto.setId(m.getId());
        dto.setMarque(m.getMarque());
        dto.setModele(m.getModele());
        dto.setMatricule(m.getMatricule());
        dto.setPrixParJour(m.getPrixParJour());
        dto.setDateMiseEnService(m.getDateMiseEnService());
        dto.setStatut(m.getStatut());
        dto.setCylindree(m.getCylindree());
        dto.setTypeMoto(m.getTypeMoto());
        dto.setCasqueInclus(m.getCasqueInclus());
        dto.setAgenceId(m.getAgence() != null ? m.getAgence().getId() : null);
        return dto;
    }

    @Override
    public void deleteVehicule(Long id) {
        if (voitureRepository.existsById(id)) {
            voitureRepository.deleteById(id);
        } else if (motoRepository.existsById(id)) {
            motoRepository.deleteById(id);
        }
    }
}