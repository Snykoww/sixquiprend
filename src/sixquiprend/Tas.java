


package sixquiprend;

        import java.util.ArrayList;
        import java.util.List;

public class Tas {
    private List<Carte> cartes;

    public Tas() {
        this.cartes = new ArrayList<>();
    }

    public void ajouterCarte(Carte carte) {
        this.cartes.add(carte);
    }

    public int getNombreTetesDeBoeuf() {
        int total = 0;
        for (Carte carte : this.cartes) {
            total += carte.getTeteDeBoeuf();
        }
        return total;
    }

    public int getNombreDeCartes() {
        return this.cartes.size();
    }

    public Carte getCarte(int index) {
        return this.cartes.get(index);
    }

    public void vider() {
        this.cartes.clear();
    }

    @Override
    public String toString() {
        return "Tas{" +
                "cartes=" + cartes +
                '}';
    }
}
