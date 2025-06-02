/************************************/
/* Program   : LambdaList.java */ 
/* Deskripsi : Class LambdaList*/ 
/* NIM/Nama  : 24060123130114/Tsuraya Olivia*/
/* Tanggal   : 2 Juni 2025*/ 
/***********************************/

import java.util.ArrayList;

public class LambdaList {
    public static void main(String[] args) {
        ArrayList<String> dataMahasiswa = new ArrayList<>();
        dataMahasiswa.add("Adi");
        dataMahasiswa.add("Bambang");
        dataMahasiswa.add("Cici");
        dataMahasiswa.add("Didi");
        
        dataMahasiswa.forEach((nama) -> System.out.println(nama));
    }
}
