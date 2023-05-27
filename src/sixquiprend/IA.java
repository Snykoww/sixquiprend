package sixquiprend;

import java.util.Random;

public class IA extends Joueur {
    private Random random;

    public IA(String nom) {
        super(nom);
        this.random = new Random();
    }

    @Override
    public Carte choisirCarte() {
        // Choisir une carte au hasard
        int index = this.random.nextInt(this.getMain().size());
        return this.jouerCarte(index);
    }

    public void choisirRangee(Jeu jeu) {
        // Choisir une rangée au hasard pour prendre les cartes
        int index = this.random.nextInt(jeu.getRangees().size());
        this.ajouterCartesAuTas(jeu.getRangees().get(index).prendreCartes());
    }
}