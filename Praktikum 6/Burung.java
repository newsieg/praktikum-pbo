/************************************/
/* Program   : Burung.java */
/* Deskripsi : Subclass Burung*/
/* NIM/Nama  : 24060123130114/Tsuraya Olivia*/
/* Tanggal   : 27 April 2025*/
/***********************************/

public class Burung extends Anabul {

    public Burung(String nama){
        super(nama);
    }

    @Override
    public void Gerak(){
        System.out.println(nama + " bergerak dengan terbang.");
    }

    @Override
    public void Bersuara(){
        System.out.println(nama + " berbunyi cuit.");
    }
}
