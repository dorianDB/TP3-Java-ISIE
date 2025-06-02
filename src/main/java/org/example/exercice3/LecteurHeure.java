package org.example.exercice3;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.time.LocalTime;

public class LecteurHeure {

    /**
     * Lit et retourne l'heure sérialisée depuis "theTime.dat".
     *
     * @return l'heure désérialisée
     * @throws IOException            en cas d'erreur d'entrée
     * @throws ClassNotFoundException si l'objet lu n'est pas une LocalTime
     */
    public static LocalTime lireHeure() throws IOException, ClassNotFoundException {
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream("theTime.dat"))) {
            return (LocalTime) ois.readObject();
        }
    }
}
