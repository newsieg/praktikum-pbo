/************************************/
/* Program   : KoleksiAnabul.java */
/* Deskripsi : Kelas KoleksiAnabul*/
/* NIM/Nama  : 24060123130114/Tsuraya Olivia*/
/* Tanggal   : 8 Mei 2025*/
/***********************************/

import java.util.ArrayList;

public class KoleksiAnabul {
    private ArrayList<Anabul> koleksi;

    public KoleksiAnabul() {
        koleksi = new ArrayList<>();
    }

    public void add(Anabul a) {
        if (koleksi.size() < 10) {
            koleksi.add(a);
        } 
        else {
            System.out.println("Koleksi penuh.");
        }
    }

    public void showAll() {
        System.out.println("Koleksi Anabul:");
        for (int i = 0; i < koleksi.size(); i++) {
            Anabul a = koleksi.get(i);
            a.Gerak();
            a.Bersuara();
            System.out.println();
        }
    }
}
