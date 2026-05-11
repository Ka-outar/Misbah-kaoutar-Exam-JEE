package com.misbah.kaoutar.misbahkaoutarexamjee.services;

import com.misbah.kaoutar.misbahkaoutarexamjee.dtos.MotoDTO;
import com.misbah.kaoutar.misbahkaoutarexamjee.dtos.VoitureDTO;

import java.util.List;

public interface VehiculeService {

    VoitureDTO createVoiture(VoitureDTO voitureDTO);
    List<VoitureDTO> getAllVoitures();      // ← nom correct
    VoitureDTO getVoitureById(Long id);

    MotoDTO createMoto(MotoDTO motoDTO);
    List<MotoDTO> getAllMotos();            // ← nom correct
    MotoDTO getMotoById(Long id);

    void deleteVehicule(Long id);
}