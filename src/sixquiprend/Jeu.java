package sixquiprend;

import java.util.ArrayList;
import java.util.List;

public class Jeu {
    private List<Joueur> joueurs;
    private List<Carte> pioche;
    private List<Rangee> rangees;  // Added field for 'rangees'

    public Jeu() {
        this.joueurs = new ArrayList<>();
        this.pioche = new ArrayList<>();
        this.rangees = new ArrayList<>();  // Initialize 'rangees'
    }

    public void ajouterJoueur(Joueur joueur) {
        this.joueurs.add(joueur);
    }

    public void ajouterCarteAPioche(Carte carte) {
        this.pioche.add(carte);
    }

    public List<Joueur> getJoueurs() {
        return this.joueurs;
    }

    public List<Rangee> getRangees() {  // Added getter for 'rangees'
        return this.rangees;
    }

    public void commencer() {
        // Distribuer les cartes aux joueurs
        for (Joueur joueur : this.joueurs) {
            for (int i = 0; i < 10; i++) {
                joueur.getTas().ajouterCarte(this.pioche.remove(this.pioche.size() - 1));
            }
        }

        // Jouer le jeu jusqu'à ce qu'un joueur atteigne 66 têtes de boeuf
        while (!this.pioche.isEmpty()) {
            // Chaque joueur choisit une carte
            for (Joueur joueur : this.joueurs) {
                Carte carteChoisie = joueur.choisirCarte();
                this.jouerTour(carteChoisie);
            }

            // Vérifier si un joueur a atteint 66 têtes de boeuf
            for (Joueur joueur : this.joueurs) {
                if (joueur.getTas().getNombreTetesDeBoeuf() >= 66) {
                    System.out.println(joueur.getNom() + " a perdu!");
                    return;
                }
            }
        }

        System.out.println("Le jeu est terminé!");
    }

    public void jouerTour(Carte carteChoisie) {
        // Logique pour jouer un tour du jeu
    }
}