/************************************/
/* Program   : MainKoleksiAnabul.java */
/* Deskripsi : Aplikasi Kelas KoleksiAnabul*/
/* NIM/Nama  : 24060123130114/Tsuraya Olivia*/
/* Tanggal   : 8 Mei 2025*/
/***********************************/

import java.util.Random;

public class MainKoleksiAnabul {
    public static void main(String[] args) {
        KoleksiAnabul koleksi = new KoleksiAnabul();

        Random rand = new Random();
        String[] namaHewan = {"Ana", "Max", "Jeki", "Orion", "Rocky", "Ginger", "Teuta", "Chris", "Koromaru", "Mona"};

        for (int i = 0; i < 10; i++) {
            int jenis = rand.nextInt(3); 
            String nama = namaHewan[i];
            switch (jenis) {
                case 0:
                    koleksi.add(new Kucing(nama));
                    break;
                case 1:
                    koleksi.add(new Anjing(nama));
                    break;
                case 2:
                    koleksi.add(new Burung(nama));
                    break;
            }
        }
        koleksi.showAll();
    }
}
