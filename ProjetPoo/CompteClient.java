
public class CompteClient{
    private String nom;
    private String prenom;
    private int ref;
    private String adresse;
    private int montantCumule;

    public CompteClient(){}

    /*@Override
    public String toString(){
        return ("nom"+this.getnom+"prenom"+this.getprenom+" ref"+this.getref+" adresse"+this.getadresse);
    }*/

    public CompteClient(String nom, String prenom, int ref, String adresse, int montantCumule){
        this.nom = nom;
        this.prenom = prenom;
        this.ref = ref;
        this.adresse = adresse;
        this.montantCumule = montantCumule;
    }
     



   
    
     public void AfficheCompte(){
        System.out.println("Nom : "+this.nom+" Prenom : "+this.prenom+"Ref : "+this.ref+" Adresse : "+this.adresse+" montant Cumule : "+this.montantCumule);
    }

    public String getnom() {
        return nom;
    }

    public String getprenom() {
        return prenom;
    }

    public int getref() {
        return ref ;
    }

    public String getadresse(){
        return adresse;
    }

    public int getmontantcumule(){
        return montantCumule;
    }
    
    public void setnom(String nom){
        this.nom = nom;
    }

    public void setprenom(String prenom){
        this.prenom = prenom;
    }

    public void setref(int ref){
        this.ref = ref;
    }

    public void setadresse(String adresse){
        this.adresse = adresse;
    }

    public void setmontant(int montantCumule){
        this.montantCumule= montantCumule;
    }



}