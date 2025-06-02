package org.example;

import org.example.exercice2.CompteurDeLettres;
import org.example.exercice3.EnregistreurHeure;
import org.example.exercice3.LecteurHeure;

import java.io.File;
import java.io.IOException;
import java.time.LocalTime;

import static org.example.exercice1.FileCopyTest.copyFileUnbuffered;
import static org.example.exercice1.FileCopyTest.testPerformance;

public class Main {
    public static void main(String[] args) {
/*
        String baseDir = System.getProperty("user.dir");
        String fileName = "image.jpg";

        String sourcePath = baseDir + File.separator + fileName;

        copyFileUnbuffered(sourcePath, baseDir + File.separator + "image-v2.jpg");

        String autreSource = "C:" + File.separator + "Users" + File.separator + "VotreNom" +
                File.separator + "Documents" + File.separator + "grosfichier.pdf";
        String autreDest = "C:" + File.separator + "Users" + File.separator + "VotreNom" +
                File.separator + "Documents" + File.separator + "grosfichier-copie.pdf";

        testPerformance(sourcePath);
*/
        /*
        try {
            int nb = CompteurDeLettres.compterOccurrences("montexte.txt", 'e');
            System.out.println("Nombre d'occurrences de 'e' : " + nb);
        } catch (IOException e) {
            System.err.println("Erreur : " + e.getMessage());
        }*/
        try {
            EnregistreurHeure.enregistrerHeure();
            System.out.println("Heure enregistrée avec succès.");

            LocalTime heureLue = LecteurHeure.lireHeure();
            System.out.println("Heure lue depuis le fichier : " + heureLue);

        } catch (IOException | ClassNotFoundException e) {
            System.err.println("Erreur : " + e.getMessage());
        }
    }
}