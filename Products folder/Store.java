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

    public static String userinput(){
        Scanner keyboard = new Scanner(System.in);
        String userInput = keyboard.next();
        return userInput;
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










            case 3:
            System.out.println("Bienvenue chere client");
            System.out.println("Que voulais vous faire ?");
            System.out.println("1-Checker tout le stock");
            System.out.println("2-Recherche d'un produit");
            System.out.println("3-Login");
            System.out.println("4-Reserver");
            System.out.println("5-Acheter");
            System.out.println("6-Checker le panier");
            //Client part: options: -Checker tout le stock (via categories) 
                int c3;

                do{
                    c3=choixUser();
                }while(c3!=1 && c3 != 2 && c3 != 3 && c3!= 4 && c3 != 5 && c3!= 6);

                switch(c3){

                    case 1://on va afficher les produits dans le stock pour le client 
                        System.out.println("Choisissez une categorie ");
                        System.out.println("1 - Mobiles \n2- Informatique \n3- Electronique \n4- Electromenager \n5- Kit Scolaire");
                        
                        int cat;

                        do{
                            cat=choixUser();
                        }while(cat != 1 && cat != 2 && cat != 3 && cat != 4 && cat != 5);

                        switch(cat) {
                            case 1:
                                Categories categorie = db.DB_stock.categories.get(0);
                                for(Product produit : categorie.products){
                                    System.out.println("les noms des produits : " + produit.getName());
                                }

                                System.out.println("voulez vous d'autre informations sur les produits ?");
                                System.out.println("tapez 1 pour oui 0 sinon .");

                                String info ;//take the value of yes or no 
                                do{
                                    info = userinput();
                                }while(info != "yes" && info != "no");

                                switch(info){
                                    case "yes":
                                    for(Product produit : categorie.products){
                                        produit.affiche_produit();
                                    }
                                    break;

                                    case "no":
                                    System.out.println("merci pour la visite ");
                                    break;
                                }
                                break;
                                
                            
                                case 2 : 
                                Categories categorie1 = db.DB_stock.categories.get(1);
                                for(Product produit : categorie1.products){
                                    System.out.println("le nom du produit : " + produit.getName());
                                }

                                System.out.println("voulez vous d'autre informations sur les produits ?");
                                System.out.println("tapez 1 pour oui 0 sinon .");

                                String info1 ;//take the value of yes or no 
                                do{
                                    info1 = userinput();
                                }while(info1 != "yes" && info1!= "no");

                                switch(info1){
                                    case "yes":
                                    for(Product produit : categorie1.products){
                                        produit.affiche_produit();

                                    }
                                    break;
                                    
                                    case "no":
                                    System.out.println("merci pour la visite ");
                                    break;
                                }
                                break;
                                

                                case 3 :
                                Categories categorie2 = db.DB_stock.categories.get(2);
                                for(Product produit : categorie2.products){
                                    System.out.println("le nom du produit : " + produit.getName());
                                }

                                System.out.println("voulez vous d'autre informations sur les produits ?");
                                System.out.println("tapez 1 pour oui 0 sinon .");

                                String info2 ;//take the value of yes or no 
                                do{
                                    info2 = userinput();
                                }while(info2 != "yes" && info2 != "yes");

                                switch(info2){
                                    case "yes":
                                    for(Product produit : categorie2.products){
                                        produit.affiche_produit();

                                    }
                                    break;
                                    
                                    case "no":
                                    System.out.println("merci pour la visite ");
                                    break;
                                }
                                break;
                                

                                case 4 :
                                Categories categorie3 = db.DB_stock.categories.get(3);
                                for(Product produit : categorie3.products){
                                    System.out.println("le nom du produit : " + produit.getName());
                                }

                                System.out.println("voulez vous d'autre informations sur les produits ?");
                                System.out.println("tapez 1 pour oui 0 sinon .");

                                String info3 ;//take the value of yes or no 
                                do{
                                    info3 = userinput();
                                }while(info3 != "yes" && info3 != "no");

                                switch(info3){
                                    case "yes":
                                    for(Product produit : categorie3.products){
                                        produit.affiche_produit();

                                    }
                                    break;
                                    
                                    case "no":
                                    System.out.println("merci pour la visite ");
                                    break;
                                }
                                break;
                                

                                case 5 :
                                Categories categorie4 = db.DB_stock.categories.get(4);
                                for(Product produit : categorie4.products){
                                    System.out.println("le nom du produit : " + produit.getName());
                                }

                                System.out.println("voulez vous d'autre informations sur les produits ?");
                                System.out.println("tapez 1 pour oui, 0 sinon .");

                                String info4 ;//take the value of yes or no 
                                do{
                                    info4 = userinput();
                                }while(info4 != "yes" && info4 != "no");

                                switch(info4){
                                    case "yes":
                                    for(Product produit : categorie4.products){
                                        produit.affiche_produit();

                                    }
                                    break;
                                    
                                    case "no":
                                    System.out.println("merci pour la visite ");
                                    break;
                                }
                                break;
                        }
                        break;


                        case 2 :// Recherche de produit par reference (verifier la disponibilite)
                            System.out.println("Recherche de produit par reference");
                            System.out.println("Veuillez donner la reference du produit que vous chercher");
                            DataBase data = new DataBase();
                            Product produit = new Product();
                            int reference=choixUser();
                            produit=data.search_In_DB(reference);
                            if(produit.verifier_Produit_Dispo()){
                                System.out.println("Ce produit est disponible chez nous");
                                produit.affiche_produit();
                            }else{
                                System.out.println("On s'excuse ce produit n'est pas disponible.");
                            }

                        break;


                        case 3 : //faire le login pour verifier le compte 
                            
                            System.out.println("Login");
                            System.out.println("Donner votre nom ");
                            String s1 = userinput();
                            System.out.println("Donner votre prenom");
                            String s2 = userinput();
                            System.out.println("Donner votre mot de passe "); 
                            String s3 = userinput();
                            //Client.login(s1, s2, s3);

                              
                               
                }
                


                
                      



                  


                    

                    
                                                // peut reserver un produit (ajouté au panier)
                                                // peut acheter un produit
                                                // recherche
                                                // Checker le panier
                                    //Faire le login    ->   Checker son compte
                                    //- Beneficier d'une remise

                
        }
            

    }

}
