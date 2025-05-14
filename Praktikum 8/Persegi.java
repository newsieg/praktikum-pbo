/************************************/
/* Program   : Persegi.java */
/* Deskripsi : Kelas Persegi*/
/* NIM/Nama  : 24060123130114/Tsuraya Olivia*/
/* Tanggal   : 8 Mei 2025*/
/***********************************/

public class Persegi extends BangunDatar{
    private double sisi;
    
    public Persegi(double sisi){
        this.sisi = sisi;
    }
    
    public double hitungKeliling(){
        return 4*sisi;
    }
}