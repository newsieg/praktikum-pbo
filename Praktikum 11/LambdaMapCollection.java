/************************************/
/* Program   : LambdaListMapCollection.java */ 
/* Deskripsi : Class LambdaListMapCollection*/ 
/* NIM/Nama  : 24060123130114/Tsuraya Olivia*/
/* Tanggal   : 2 Juni 2025*/ 
/***********************************/

import java.util.HashMap;
import java.util.Map;

public class LambdaMapCollection {
    public static void main(String[] args) {
        Map<String, String> mahasiswaMap = new HashMap<>();
        mahasiswaMap.put("1", "Adi");
        mahasiswaMap.put("2", "Bambang");
        mahasiswaMap.put("3", "Cici");
        mahasiswaMap.put("4", "Didi");
        
        mahasiswaMap.forEach((nim,nama) -> System.out.println("NIM: " + nim + ", Nama: " + nama));
    }
}
