

import com.Personne;
import com.Web_Service;
import com.Web;
import java.util.List;
import javax.sound.sampled.Port;


public class Main {
    public static void main(String[] args) {
        Web_Service service = new Web_Service();
        Web web = service.getWebPort();
        
        List<Personne> personneList = web.afficher();
        for(Personne personne : personneList) {
            System.out.println(personne.getId() + " Nom: " + personne.getNom() + " Prenom: " + personne.getPrenom());
           
        }
        
        
         Personne p=new Personne();
         p.setId(1);
         p.setNom("Madoune");
         p.setPrenom("Sid Ali");        
        int i= web.update(p);
        System.out.println("hg"+i);
    }
}
