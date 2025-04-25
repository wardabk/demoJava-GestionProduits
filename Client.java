public class Client {
    private String nom;
    private Panier panier;

    // Constructeur
    public Client(String nom) {
        this.nom = nom;
        this.panier = new Panier();
    }

    // Ajouter un produit au panier
    public void ajouterAuPanier(Produit produit, int quantite) {
        panier.ajouterProduit(produit, quantite);
    }

    // Afficher l'état du panier du client
    public void afficherPanier() {
        System.out.println("Panier du client " + nom + " :");
        panier.afficherPanier();
    }

    @Override
    public String toString() {
        return "Client{" +
                "nom='" + nom + '\'' +
                ", panier=" + panier +
                '}';
    }
}
