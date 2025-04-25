public class Main {
    public static void main(String[] args) {
        // Création de produits
        Produit produit1 = new Produit(1, "Dattes Deglet Nour", 15.0, 100);
        Produit produit2 = new Produit(2, "Dattes Alig", 10.0, 250);

        // Création d'un client
        Client client1 = new Client("Ahmed");
        Client client2 = new Client("Ali");


        // Ajout de produits au panier du client
        System.out.println("\nAjout de produits au panier :");
        client1.ajouterAuPanier(produit1, 2);
        client1.ajouterAuPanier(produit2, 3);

        client2.ajouterAuPanier(produit1, 1);
        client2.ajouterAuPanier(produit2, 2);


        client1.afficherPanier();
        client2.afficherPanier();

    }
}
