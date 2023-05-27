

package sixquiprend;

public class Carte {
    private int numero;
    private int teteDeBoeuf;

    public Carte(int numero, int teteDeBoeuf) {
        this.numero = numero;
        this.teteDeBoeuf = teteDeBoeuf;
    }

    public int getNumero() {
        return this.numero;
    }

    public int getTeteDeBoeuf() {
        return this.teteDeBoeuf;
    }

    @Override
    public String toString() {
        return "Carte{" +
                "numero=" + numero +
                ", teteDeBoeuf=" + teteDeBoeuf +
                '}';
    }
}