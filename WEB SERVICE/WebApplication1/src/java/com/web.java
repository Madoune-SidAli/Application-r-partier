
package com;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.LinkedList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;


/**
 *
 * @author amine
 */
@WebService(serviceName = "web")
public class web {
   

    /**
     * This is a sample web service operation
     */
    @WebMethod(operationName = "hello")
    public String hello(@WebParam(name = "name") String txt) {
        return "Hello " + txt + " !";
    }

    @WebMethod(operationName = "afficher")
    public List<Personne> afficher() {
        String sql = "SELECT * FROM personne;";
        
        List<Personne> personneList = new LinkedList<>();
        try {
            Statement st = connect_1.getCnnection().createStatement();
            ResultSet rs = st.executeQuery(sql);
            while(rs.next()) {
                Personne p = new Personne(rs.getInt("id"), rs.getString("nom"), rs.getString("prenom"));
                personneList.add(p);
            }
        } catch(SQLException se) {
            se.printStackTrace();
        }
        
        return personneList;
    }

   
    @WebMethod(operationName = "update")
    public int update(@WebParam(name = "Personne")Personne p) {
                String sqll = "UPDATE personne SET nom= ?, prenom=? WHERE id=?;";

                
        int i=0;
        try {
            PreparedStatement st = connect_1.getCnnection().prepareStatement(sqll);
            st.setString(1, p.getNom());
            st.setString(2, p.getPrenom());
            st.setInt(3, p.getId());
            return st.executeUpdate();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
            
            
        return -1;
    }
}
