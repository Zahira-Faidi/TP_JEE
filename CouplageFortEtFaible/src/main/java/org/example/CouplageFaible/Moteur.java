package org.example.CouplageFaible;

public class Moteur implements IMoteur{
    @Override
    public void demarrer() {
        System.out.println("Démarrer le moteur!");
    }
}