package com.example.demo.service;

import com.example.demo.data.Voiture;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class StatistiqueTests {

    @Test
    public void testAjoutEtPrixMoyenSimple() {
        Statistique statistique = new StatistiqueImpl();

        statistique.ajouter(new Voiture("Toyota", 10000));
        statistique.ajouter(new Voiture("Renault", 20000));
        statistique.ajouter(new Voiture("Peugeot", 30000));

        Echantillon resultat = statistique.prixMoyen();

        assertEquals(3, resultat.getNombreDeVoitures());
        assertEquals(20000, resultat.getPrixMoyen()); 
    }

    @Test
    public void testPrixMoyenAvecUneSeuleVoiture() {
        Statistique statistique = new StatistiqueImpl();
        statistique.ajouter(new Voiture("Fiat", 15000));

        Echantillon resultat = statistique.prixMoyen();

        assertEquals(1, resultat.getNombreDeVoitures());
        assertEquals(15000, resultat.getPrixMoyen());
    }

    @Test
    public void testPrixMoyenVide() {
        Statistique statistique = new StatistiqueImpl();

        assertThrows(ArithmeticException.class, () -> {
            statistique.prixMoyen();
        });
    }
}
