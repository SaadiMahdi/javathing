
import java.util.Scanner;

public class Client{
    private static final Client Client = null;
    private String nom;
    private String prenom;
    private int refc;
    private String mdp ;
    private String adresse;

    

     Scanner userInput = new Scanner (System.in);
    /*public void toString() {
        return "nom"+this.getnom+"prenom"+this.getprenom+" ref"+this.getref+" adresse"+this.getadresse;
    }*/
    
    public Client(String nom,String prenom,int refc,String mdp ,String adresse){
        this.nom = nom;
        this.prenom = prenom;
        this.refc = refc;
        this.mdp = mdp;
        this.adresse = adresse;
    }

    void affich(){
        System.out.println("nom :"+nom+" prenom :"+prenom+" ref :"+refc+" adresse :"+adresse);
    }

    public String getnom() {
        return nom;
        }

    public String getprenom() {
        return prenom;
    }
    
    public int getref() {
        return refc;
    }

    public String getmdp(){
        return mdp;
    }

    public String getadresse() {
        return adresse;
    }

    public Client getClient() {
        return Client;
    }

    
  public CompteClient Login(String nom ,String prenom,String mdp){
    for(int i=0;i<DBC.size();i++){   
              if(nom==DBC.get(i).getnom() && prenom==DBC.get(i).getprenom() && DBC.get(i).getmdp()==mdp){ 
                    return DB_client.get(i);
              }  
      }
     return null;
  }
      

   



    



     }



