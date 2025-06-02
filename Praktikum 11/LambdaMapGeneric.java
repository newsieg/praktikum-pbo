/************************************/
/* Program   : LambdaMapGeneric.java */ 
/* Deskripsi : Class LambdaMapGeneric*/ 
/* NIM/Nama  : 24060123130114/Tsuraya Olivia*/
/* Tanggal   : 2 Juni 2025*/ 
/***********************************/

import java.util.HashMap;
import java.util.Map;

interface TampilkanData {
    void tampil(String nim, String nama);
}

public class LambdaMapGeneric {
    public static void main(String[] args) {
        Map<String, String> dataMahasiswa = new HashMap<>();
        dataMahasiswa.put("1", "Andi");
        dataMahasiswa.put("2", "Budi");
        dataMahasiswa.put("3", "Cici");
        dataMahasiswa.put("4", "Didi");

        TampilkanData tampilkan = (nim, nama) -> System.out.println("NIM: " + nim + ", Nama: " + nama);

        dataMahasiswa.forEach((nim, nama) -> tampilkan.tampil(nim, nama));
    }
}
