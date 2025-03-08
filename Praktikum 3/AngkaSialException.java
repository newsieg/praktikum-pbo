/************************************/
/* Program   : AngkaSialException.java */
/* Deskripsi : Eksepsi buatan sendiri menolak masukan angka 13*/
/* NIM/Nama  : 24060123130114/Tsuraya Olivia*/
/* Tanggal   : 6 Maret 2025*/
/***********************************/

public class AngkaSialException extends Exception {
    public AngkaSialException(){
        super("Jangan masukkan angka 13 karena angka sial");
    }
}
