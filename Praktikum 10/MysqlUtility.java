/************************************/
/* Program   : MysqlUtility.java */ 
/* Deskripsi : Class MysqlUtility*/ 
/* NIM/Nama  : 24060123130114/Tsuraya Olivia*/
/* Tanggal   : 22 Mei 2025*/ 
/***********************************/

package jdbc.utilities;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class MysqlUtility {
    private static Connection koneksi;
    
    public static Connection getConnection(){
        if (koneksi == null){
            try{
                Class.forName("com.mysql.jdbc.Driver");
                String url = "jdbc:mysql://localhost:3307/pbo";
                String user = "root";
                String password = "Galaxyexpress9!";
                koneksi = DriverManager.getConnection(url, user, password);
                if (koneksi != null){
                    System.out.println("Koneksi berhasil.");
                }
            }
            catch(ClassNotFoundException cne){
                System.out.println("Gagal load driver: " + cne.getMessage());
            }
            catch(SQLException sqle){
                System.out.println("Gagal koneksi: " + sqle.getMessage());
            }
        }
        return koneksi;
    }
}
