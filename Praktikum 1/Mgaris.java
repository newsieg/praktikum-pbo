/************************************/
/* Program   : Mgaris.java */
/* Deskripsi : Main class Garis */
/* NIM/Nama  : 24060123130114/Tsuraya Olivia*/
/* Tanggal   : 23 Februari 2025*/
/***********************************/


public class Mgaris {
    public static void main(String[] args) {
        Titik t1 = new Titik(-2, 0);
        Titik t2 = new Titik(0, 4);
        Garis g1 = new Garis(t1, t2);
        g1.printGaris();
        
        System.out.println("Panjang Garis: " + g1.getPanjang());
        System.out.println("Gradien Garis: " + g1.getGradien());
        System.out.print("Titik Tengah: "); g1.getTitikTengah().printTitik();
        System.out.println("Persamaan Garis: " + g1.getPersamaan());

        Titik t3 = new Titik(1, 1);
        Titik t4 = new Titik(3, 5);
        Garis g2 = new Garis(t3, t4);
        
        System.out.println("Garis g1 sejajar dengan g2: " + g1.isSejajar(g2));
        System.out.println("Garis g1 tegak lurus dengan g2: " + g1.isTegakLurus(g2));
    }
}
