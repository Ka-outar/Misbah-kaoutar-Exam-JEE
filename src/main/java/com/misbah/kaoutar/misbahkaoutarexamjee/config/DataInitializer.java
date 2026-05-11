package com.misbah.kaoutar.misbahkaoutarexamjee.config;

import com.misbah.kaoutar.misbahkaoutarexamjee.entities.Agence;
import com.misbah.kaoutar.misbahkaoutarexamjee.entities.Moto;
import com.misbah.kaoutar.misbahkaoutarexamjee.entities.Voiture;
import com.misbah.kaoutar.misbahkaoutarexamjee.enums.*;
import com.misbah.kaoutar.misbahkaoutarexamjee.repositories.AgenceRepository;
import com.misbah.kaoutar.misbahkaoutarexamjee.repositories.MotoRepository;
import com.misbah.kaoutar.misbahkaoutarexamjee.repositories.VoitureRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.Date;

public class DataInitializer {
    @Component
    public class DataInitializer implements CommandLineRunner {

        @Autowired
        private AgenceRepository agenceRepository;

        @Autowired
        private VoitureRepository voitureRepository;

        @Autowired
        private MotoRepository motoRepository;

        @Override
        public void run(String... args) throws Exception {

            // Créer une agence
            Agence agence = new Agence();
            agence.setNom("Agence Centrale");
            agence.setAdresse("123 Avenue Hassan II");
            agence.setVille("Casablanca");
            agence.setTelephone("0522123456");
            agenceRepository.save(agence);

            // Créer une voiture
            Voiture voiture = new Voiture();
            voiture.setMarque("Renault");
            voiture.setModele("Clio");
            voiture.setMatricule("AB-123-CD");
            voiture.setPrixParJour(300.0);
            voiture.setDateMiseEnService(new Date());
            voiture.setStatut(StatutVehicule.DISPONIBLE);
            voiture.setAgenceId(agence.getId());
            voiture.setNombrePortes(5);
            voiture.setTypeCarburant(TypeCarburant.ESSENCE);
            voiture.setBoiteVitesse(BoiteVitesse.MANUELLE);
            voitureRepository.save(voiture);

            // Créer une moto
            Moto moto = new Moto();
            moto.setMarque("Yamaha");
            moto.setModele("MT-07");
            moto.setMatricule("EF-456-GH");
            moto.setPrixParJour(200.0);
            moto.setDateMiseEnService(new Date());
            moto.setStatut(StatutVehicule.DISPONIBLE);
            moto.setAgenceId(agence.getId());
            moto.setCylindree(689);
            moto.setTypeMoto(TypeMoto.ROADSTER);
            moto.setCasqueInclus(OuiNon.OUI);
            motoRepository.save(moto);

            System.out.println("=== Données de test insérées ===");
            System.out.println("Agence : " + agence.getNom());
            System.out.println("Voiture : " + voiture.getMarque() + " " + voiture.getModele());
            System.out.println("Moto : " + moto.getMarque() + " " + moto.getModele());
        }

}
