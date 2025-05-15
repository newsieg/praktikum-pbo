/************************************/
/* Program   : MySQLPersonDAO.java */
/* Deskripsi : Class MySQLPersonDAO*/
/* NIM/Nama  : 24060123130114/Tsuraya Olivia*/
/* Tanggal   : 15 Mei 2025*/
/***********************************/

import java.sql.Connection;
import java.sql.DriverManager;

public class MySQLPersonDAO implements PersonDAO {
    public void savePerson(Person p) throws Exception {
        String name = p.getName();
        
//        Create connection
//         using the new driven class
         Class.forName("com.mysql.cj.jdbc.Driver");
         Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3307/pbo", "root", "Galaxyexpress9!");
         
         String query = "INSERT INTO person(name) VALUES ('" + name + "')";
         System.out.println(query);
         java.sql.Statement s = con.createStatement();
         s.executeUpdate(query);
         
         con.close();
    }
}