
import java.util.List;
import java.util.ArrayList;
public class DataBaseC{
 
    
public List<CompteClient> DB_client;



public void setCompteClient(CompteClient c_client){
        this.DB_client.add(c_client);
    }

public DataBaseC(){
ArrayList<CompteClient> c_clients = new ArrayList<CompteClient>();
c_clients.add(new CompteClient("Saadi","Mahdi",1325647,"El Achour",0));
c_clients.add(new CompteClient("Oussadi","saadi",2547869,"idk",0));
this.DB_client=c_clients;
}

   public CompteClient search(int ref){
       CompteClient compte = new CompteClient();
       for(int i=0; i<DB_client.size();i++){
           if(DB_client.get(i).getref()==ref){
            return compte;
           }
       }
       return null;
   }



public static void main(String[] args){

    DataBaseC db = new DataBaseC();
    CompteClient compte = db.search(1325647);
    if(compte!=null){
        System.out.println("trouver");
        compte.AfficheCompte();
    }
    System.out.println("pas trouver");
}
}