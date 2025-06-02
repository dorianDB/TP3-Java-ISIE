package org.example.exercice3;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.time.LocalTime;

public class EnregistreurHeure {

    /**
     * Sérialise l'heure actuelle dans un fichier "theTime.dat".
     *
     * @throws IOException en cas d'erreur d'écriture
     */
    public static void enregistrerHeure() throws IOException {
        LocalTime heureActuelle = LocalTime.now();

        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("theTime.dat"))) {
            oos.writeObject(heureActuelle);
        }
    }
}
