/************************************/
/* Program   : BangunDatarGeneric.java */
/* Deskripsi : Kelas BangunDatarGeneric*/
/* NIM/Nama  : 24060123130114/Tsuraya Olivia*/
/* Tanggal   : 8 Mei 2025*/
/***********************************/

public class BangunDatarGeneric<T extends BangunDatar> {
    private T bangunDatar;
    
    public void set(T tipeBangunDatar){
        bangunDatar = tipeBangunDatar;
    }
    
    public T get(){
        return bangunDatar;
    }
    
    public double hitungKeliling(){
        return bangunDatar.hitungKeliling();
    }
}
