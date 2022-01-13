import java.util.Scanner;

import database.ASCIIArtGenerator;
import database.ASCIIArtGenerator.ASCIIArtFont;

public class Store {

    public static int choixUser(){
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Taper le chiffre de votre choix:\n");
        int choice = keyboard.nextInt();
        return choice;
    }
    
    public static void main(String[] args) throws Exception {
        DataBase db = new DataBase();

        ASCIIArtGenerator artGen = new ASCIIArtGenerator();
        artGen.printTextArt("BIENVENUE DANS", ASCIIArtGenerator.ART_SIZE_SMALL, ASCIIArtFont.ART_FONT_SANS_SERIF,"*");
        System.out.println();
        System.out.println();
        artGen.printTextArt("NOTRE B O U T I Q U E !", ASCIIArtGenerator.ART_SIZE_SMALL, ASCIIArtFont.ART_FONT_SANS_SERIF,"*");
        System.out.println();

        System.out.println("Voulez vous executer le programme en tant que:");
        System.out.println("1- Magasiner");
        System.out.println("2- Agent Commercial");
        System.out.println("3- Client");
        // Take user input
        int choice;
        do {
            choice = choixUser();
        } while (choice != 1 && choice!=2 && choice !=3);

        switch (choice) {




            case 1: //Start executing Magasinier stuff: say Hello... option: Ajouter un produit au stock 
                
                System.out.println("Salutations cher magasinier!");
                System.out.println("Que voulez vous faire aujourd'hui");
                System.out.println("1- Ajouter un produit au stock");
                int c1;
                do {
                    c1 = choixUser();
                } while (c1 != 1);
                System.out.println("Dans quelle categories voudrier vous l'ajouter");
                System.out.println("1 - Mobiles \n2- Informatique \n3- Electronique \n4- Electromenager \n5- Kit Scolaire");
                do {
                    c1 = choixUser();
                } while (c1 != 1 && c1 != 2 && c1 != 3 && c1 != 4 && c1 != 5);
                Product product = new Product();
                product = product.ajoutProduct();

                switch (c1) {
                    case 1:
                        Categories categorie = db.DB_stock.categories.get(0);    
                        db.addProduct(product, categorie);
                        break;
                    
                    case 2:
                        Categories categorie1 = db.DB_stock.categories.get(1);    
                        db.addProduct(product, categorie1);
                        break;

                    case 3:
                        Categories categorie2 = db.DB_stock.categories.get(2);    
                        db.addProduct(product, categorie2);
                        break;

                    case 4:
                        Categories categorie3 = db.DB_stock.categories.get(3);    
                        db.addProduct(product, categorie3);
                        break;

                    case 5:
                        Categories categorie4 = db.DB_stock.categories.get(4);    
                        db.addProduct(product, categorie4);
                        break;
                    
                }
                if(db.search_In_DB(product.ref).ref == product.ref){
                    System.out.println("Voici le produit que vous avez entré au stock:");
                    product.affiche_produit();
                }

                break;









            case 2://start executing Agent Commercial stuff: say Hello.. options: - Vendre un produit   - Retourner un produit   -Creer une compte fidélité à un client    - Checker la caisse

                break;










            case 3://Client part: options: -Checker tout le stock (via categories) 
                                                // peut reserver un produit (ajouté au panier)
                                                // peut acheter un produit
                                                // recherche
                                                // Checker le panier
                                    //Faire le login    ->   Checker son compte
                                    //- Beneficier d'une remise

                break;
        }
            

    }

}
