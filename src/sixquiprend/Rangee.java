package sixquiprend;

import java.util.ArrayList;
import java.util.List;

public class Rangee {
    private List<Carte> cartes;

    public Rangee() {
        this.cartes = new ArrayList<>();
    }

    public List<Carte> getCartes() {
        return this.cartes;
    }

    public void ajouterCarte(Carte carte) {
        this.cartes.add(carte);
    }

    public List<Carte> prendreCartes() {
        List<Carte> cartesPrises = new ArrayList<>(this.cartes);
        this.cartes.clear();
        return cartesPrises;
    }
}