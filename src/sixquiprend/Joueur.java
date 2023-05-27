

package sixquiprend;

        import java.util.ArrayList;
        import java.util.List;

public class Joueur {
    private String nom;
    private Tas tas;
    private List<Carte> main;

    public Joueur(String nom) {
        this.nom = nom;
        this.tas = new Tas();
        this.main = new ArrayList<>();
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
}