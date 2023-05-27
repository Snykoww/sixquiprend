package sixquiprend;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Joueur {
    private String nom;
    private Tas tas;
    private List<Carte> main;
    private Random random;

    public Joueur(String nom) {
        this.nom = nom;
        this.tas = new Tas();
        this.main = new ArrayList<>();
        this.random = new Random();
    }

    public String getNom() {
        return this.nom;
    }

    public Tas getTas() {
        return this.tas;
    }

    public List<Carte> getMain() {
        return this.main;
    }

    public void recevoirCarte(Carte carte) {
        this.main.add(carte);
    }

    public Carte jouerCarte(int index) {
        return this.main.remove(index);
    }

    public void ajouterCarteAuTas(Carte carte) {
        this.tas.ajouterCarte(carte);
    }

    public void ajouterCartesAuTas(List<Carte> cartes) {
        for (Carte carte : cartes) {
            this.tas.ajouterCarte(carte);
        }
    }

    public Carte choisirCarte() {
        if (this.main.isEmpty()) {
            throw new IllegalStateException("Cannot choose a card from an empty hand.");
        }
        int index = this.random.nextInt(this.main.size());
        return this.jouerCarte(index);
    }
}