/************************************/
/* Program   : Lingkaran.java */
/* Deskripsi : Kelas Lingkaran*/
/* NIM/Nama  : 24060123130114/Tsuraya Olivia*/
/* Tanggal   : 8 Mei 2025*/
/***********************************/

public class Lingkaran extends BangunDatar{
    private double jejari;
    
    public Lingkaran(double jejari){
        this.jejari = jejari;
    }
    
    public double hitungKeliling(){
        return 2*jejari*3.14;
    }
}
