/************************************/
/* Program   : MKendaraan.java */
/* Deskripsi : Main class Kendaraan */
/* NIM/Nama  : 24060123130114/Tsuraya Olivia*/
/* Tanggal   : 27 Februari 2025*/
/***********************************/

public class MKendaraan {
    public static void main(String[] args) {
        
        Kendaraan K1 = new Kendaraan();
        K1.setNoPlat("B0003S");
        K1.setJenis("motor");

        System.out.println("No Plat: " + K1.getNoPlat());
        System.out.println("Jenis: " + K1.getJenis());

        Kendaraan K2 = new Kendaraan("BE1234ABC", "mobil");
        
        System.out.println("No Plat: " + K2.getNoPlat());
        System.out.println("Jenis: " + K2.getJenis());
    }
}
