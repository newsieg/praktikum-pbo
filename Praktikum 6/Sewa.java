/************************************/
/* Program   : Sewa.java */
/* Deskripsi : Main Class Sewa (3.c)*/
/* NIM/Nama  : 24060123130114/Tsuraya Olivia*/
/* Tanggal   : 24 April 2025*/
/***********************************/

public class Sewa {
    public static void main(String[] args){
        Vehicle kendaraan = new Vehicle();
        Vehicle mobil = new Car();
        Vehicle bis = new Bus();

        kendaraan.calRent(50, 1000);
        mobil.calRent(50, 1000);
        bis.calRent(50, 1000);
    }
}
