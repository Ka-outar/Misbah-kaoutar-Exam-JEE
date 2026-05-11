package com.misbah.kaoutar.misbahkaoutarexamjee.services;

import com.misbah.kaoutar.misbahkaoutarexamjee.dtos.MotoDTO;
import com.misbah.kaoutar.misbahkaoutarexamjee.dtos.VoitureDTO;
import com.misbah.kaoutar.misbahkaoutarexamjee.entities.Moto;
import com.misbah.kaoutar.misbahkaoutarexamjee.entities.Voiture;
import com.misbah.kaoutar.misbahkaoutarexamjee.mappers.MotoMapper;
import com.misbah.kaoutar.misbahkaoutarexamjee.mappers.VoitureMapper;
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

    @Autowired
    private VoitureMapper voitureMapper;

    @Autowired
    private MotoMapper motoMapper;

    @Override
    public VoitureDTO createVoiture(VoitureDTO dto) {
        Voiture voiture = voitureMapper.toEntity(dto);
        Voiture saved = voitureRepository.save(voiture);
        return voitureMapper.toDTO(saved);
    }

    @Override
    public List<VoitureDTO> getAllVoitures() {
        List<VoitureDTO> result = new ArrayList<>();
        for (Voiture v : voitureRepository.findAll()) {
            result.add(voitureMapper.toDTO(v));
        }
        return result;
    }

    @Override
    public VoitureDTO getVoitureById(Long id) {
        Voiture voiture = voitureRepository.findById(id).orElse(null);
        return voitureMapper.toDTO(voiture);
    }

    @Override
    public MotoDTO createMoto(MotoDTO dto) {
        Moto moto = motoMapper.toEntity(dto);
        Moto saved = motoRepository.save(moto);
        return motoMapper.toDTO(saved);
    }

    @Override
    public List<MotoDTO> getAllMotos() {
        List<MotoDTO> result = new ArrayList<>();
        for (Moto m : motoRepository.findAll()) {
            result.add(motoMapper.toDTO(m));
        }
        return result;
    }

    @Override
    public MotoDTO getMotoById(Long id) {
        Moto moto = motoRepository.findById(id).orElse(null);
        return motoMapper.toDTO(moto);
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