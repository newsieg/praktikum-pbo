/************************************/
/* Program   : Main.java */
/* Deskripsi : Main class dan subclass*/
/* NIM/Nama  : 24060123130114/Tsuraya Olivia*/
/* Tanggal   : 13 Maret 2025*/
/***********************************/

public class Main {
    public static void main(String[] args) {
        Persegi persegi1 = new Persegi(5, "Merah", "Hitam");
        System.out.println("=== Persegi 1 ===");
        System.out.println("Sisi: " + persegi1.getSisi());
        System.out.println("Luas: " + persegi1.getLuas());
        System.out.println("Keliling: " + persegi1.getKeliling());
        System.out.println("Diagonal: " + persegi1.getDiagonal());
        persegi1.printInfo();
        System.out.println();

        Persegi persegi2 = new Persegi();
        persegi2.setSisi(7);
        persegi2.setWarna("Biru");
        persegi2.setBorder("Putih");
        System.out.println("=== Persegi 2 ===");
        System.out.println("Sisi: " + persegi2.getSisi());
        System.out.println("Luas: " + persegi2.getLuas());
        System.out.println("Keliling: " + persegi2.getKeliling());
        System.out.println("Diagonal: " + persegi2.getDiagonal());
        persegi2.printInfo();
        System.out.println();

        Lingkaran lingkaran1 = new Lingkaran(10, "Hijau", "Hitam");
        System.out.println("=== Lingkaran 1 ===");
        System.out.println("Jari-jari: " + lingkaran1.getJari());
        System.out.println("Luas: " + lingkaran1.getLuas());
        System.out.println("Keliling: " + lingkaran1.getKeliling());
        lingkaran1.printInfo();
        System.out.println();

        Lingkaran lingkaran2 = new Lingkaran();
        lingkaran2.setJari(4);
        lingkaran2.setWarna("Kuning");
        lingkaran2.setBorder("Biru");
        System.out.println("=== Lingkaran 2 ===");
        System.out.println("Jari-jari: " + lingkaran2.getJari());
        System.out.println("Luas: " + lingkaran2.getLuas());
        System.out.println("Keliling: " + lingkaran2.getKeliling());
        lingkaran2.printInfo();
    }
}
