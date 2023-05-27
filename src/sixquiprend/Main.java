package sixquiprend;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // Créer une instance du jeu
        Jeu jeu = new Jeu();

        // Créer quelques joueurs
        Joueur joueur1 = new Joueur("Alice");
        Joueur joueur2 = new Joueur("Bob");

        // Ajouter les joueurs au jeu
        jeu.ajouterJoueur(joueur1);
        jeu.ajouterJoueur(joueur2);

        // Créer la pioche
        List<Carte> pioche = new ArrayList<>();
        for (int i = 1; i <= 104; i++) {
            int teteDeBoeuf = 1;
            if (i % 5 == 0) teteDeBoeuf += 2;
            if (i % 10 == 0) teteDeBoeuf += 3;
            if (i % 11 == 0) teteDeBoeuf += 5;
            pioche.add(new Carte(i, teteDeBoeuf));
        }

        // Mélanger la pioche
        Collections.shuffle(pioche);

        // Distribuer les cartes aux joueurs
        for (Joueur joueur : jeu.getJoueurs()) {
            for (int i = 0; i < 10; i++) {
                joueur.getTas().ajouterCarte(pioche.remove(pioche.size() - 1));
            }
        }

        // Commencer le jeu
        while (!pioche.isEmpty()) {
            // Chaque joueur choisit une carte
            for (Joueur joueur : jeu.getJoueurs()) {
                Carte carteChoisie = joueur.choisirCarte();
                jeu.jouerTour(carteChoisie);
            }

            // Vérifier si un joueur a atteint 66 têtes de boeuf
            for (Joueur joueur : jeu.getJoueurs()) {
                if (joueur.getTas().getNombreTetesDeBoeuf() >= 66) {
                    System.out.println(joueur.getNom() + " a perdu!");
                    return;
                }
            }
        }

        System.out.println("Le jeu est terminé!");
    }
}