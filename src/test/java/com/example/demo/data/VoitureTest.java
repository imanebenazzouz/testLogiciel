package com.example.demo.data;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;


public class VoitureTest {

    @Test
    public void creerVoiture (){
        Voiture voiture = new Voiture("Ferrari", 8000.00);
        assertTrue(voiture.getMarque().equals("Ferrari"), "Doit etre Ferrari");
        assertTrue(voiture.getPrix() == 8000.00, "Doit etre 8000.00");
        assertTrue (voiture.getId() == 0, "Doit etre 0");
    }


}