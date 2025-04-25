import java.util.ArrayList;
import java.util.List;

public class Panier {
    private List<Produit> produits;
    private double montantTotal;

    // Constructeur
    public Panier() {
        this.produits = new ArrayList<>();
        this.montantTotal = 0.0;
    }

    // Ajouter un produit au panier
    public void ajouterProduit(Produit produit, int quantite) {
        produits.add(produit);
        montantTotal += produit.getPrix() * quantite;
    }

    public void afficherPanier() {
        System.out.println("Produits dans le panier : ");
        for (Produit produit : produits) {
            System.out.println(produit);
        }
        System.out.println("Montant total : " + montantTotal + "DT");
    }

    @Override
    public String toString() {
        return "Panier{" +
                "produits=" + produits +
                ", montantTotal=" + montantTotal +
                '}';
    }
}
