/************************************/
/* Program   : Kucing.java */
/* Deskripsi : Subclass Kucing*/
/* NIM/Nama  : 24060123130114/Tsuraya Olivia*/
/* Tanggal   : 27 April 2025*/
/***********************************/

public class Kucing extends Anabul {

    public Kucing(String nama){
        super(nama);
    }

    @Override
    public void Gerak(){
        System.out.println(nama + " bergerak dengan melata.");
    }

    @Override
    public void Bersuara(){
        System.out.println(nama + " berbunyi meong.");
    }
}
