package org.example.exercice2;

import java.io.*;

public class CompteurDeLettres {

    /**
     * Compte le nombre d'occurrences d'une lettre dans un fichier texte.
     *
     * @param cheminFichier Le chemin vers le fichier texte.
     * @param lettreCible   La lettre à compter (insensible à la casse).
     * @return Le nombre d'occurrences trouvées.
     * @throws IOException Si une erreur de lecture survient.
     */
    public static int compterOccurrences(String cheminFichier, char lettreCible) throws IOException {
        int compteur = 0;
        lettreCible = Character.toLowerCase(lettreCible);

        try (BufferedReader lecteur = new BufferedReader(new FileReader(cheminFichier))) {
            int caractere;
            while ((caractere = lecteur.read()) != -1) {
                if (Character.toLowerCase(caractere) == lettreCible) {
                    compteur++;
                }
            }
        }

        return compteur;
    }
}
