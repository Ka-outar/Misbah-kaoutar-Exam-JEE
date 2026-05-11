package com.misbah.kaoutar.misbahkaoutarexamjee.web;

import com.misbah.kaoutar.misbahkaoutarexamjee.dtos.MotoDTO;
import com.misbah.kaoutar.misbahkaoutarexamjee.dtos.VoitureDTO;
import com.misbah.kaoutar.misbahkaoutarexamjee.services.VehiculeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/vehicules")
public class VehiculeController {

    @Autowired
    private VehiculeService vehiculeService;

    // ========== VOITURES ==========

    @PostMapping("/voiture")
    public ResponseEntity<VoitureDTO> createVoiture(@RequestBody VoitureDTO voitureDTO) {
        VoitureDTO created = vehiculeService.createVoiture(voitureDTO);
        return new ResponseEntity<>(created, HttpStatus.CREATED);
    }

    @GetMapping("/voitures")
    public ResponseEntity<List<VoitureDTO>> getAllVoitures() {
        return ResponseEntity.ok(vehiculeService.getAllVoitures());
    }

    @GetMapping("/voiture/{id}")
    public ResponseEntity<VoitureDTO> getVoitureById(@PathVariable Long id) {
        VoitureDTO voiture = vehiculeService.getVoitureById(id);
        if (voiture == null) {
            return ResponseEntity.notFound().build();
        }
        return ResponseEntity.ok(voiture);
    }

    // ========== MOTOS ==========

    @PostMapping("/moto")
    public ResponseEntity<MotoDTO> createMoto(@RequestBody MotoDTO motoDTO) {
        MotoDTO created = vehiculeService.createMoto(motoDTO);
        return new ResponseEntity<>(created, HttpStatus.CREATED);
    }

    @GetMapping("/motos")
    public ResponseEntity<List<MotoDTO>> getAllMotos() {
        return ResponseEntity.ok(vehiculeService.getAllMotos());
    }

    @GetMapping("/moto/{id}")
    public ResponseEntity<MotoDTO> getMotoById(@PathVariable Long id) {
        MotoDTO moto = vehiculeService.getMotoById(id);
        if (moto == null) {
            return ResponseEntity.notFound().build();
        }
        return ResponseEntity.ok(moto);
    }

    // ========== DELETE ==========

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteVehicule(@PathVariable Long id) {
        vehiculeService.deleteVehicule(id);
        return ResponseEntity.noContent().build();
    }
}
