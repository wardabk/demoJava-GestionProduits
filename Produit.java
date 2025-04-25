public class Produit {
    private int id;
    private String nom;
    private double prix;
    private int stock;

    // Constructeur
    public Produit(int id, String nom, double prix, int stock) {
        this.id = id;
        this.nom = nom;
        this.prix = prix;
        this.stock = stock;
    }

    // Getters et setters
    public double getPrix() {
        return prix;
    }


    public void setPrix(double prix) {
        this.prix = prix;
    }

    @Override
    public String toString() {
        return "Produit{" +
                "id=" + id +
                ", nom='" + nom + '\'' +
                ", prix=" + prix +
                ", stock=" + stock +
                '}';
    }
}

