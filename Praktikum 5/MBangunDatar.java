/************************************/
/* Program   : MBangunDatar.java */
/* Deskripsi : Main Class Bangun Datar*/
/* NIM/Nama  : 24060123130114/Tsuraya Olivia*/
/* Tanggal   : 20 Maret 2025*/
/***********************************/

public class MBangunDatar {
    public static void main(String[] args) {
        Persegi P1 = new Persegi(10, "Merah", "Hitam");
        Persegi P2 = new Persegi(5, "Biru", "Putih");
        Lingkaran L1 = new Lingkaran(7, "Kuning", "Abu-abu");
        Lingkaran L2 = new Lingkaran(14, "Hijau", "Biru");

        System.out.println("=== Persegi P1 ===");
        P1.printInfo();
        System.out.println("Luas: " + P1.getLuas());
        System.out.println("Keliling: " + P1.getKeliling());
        System.out.println("Diagonal: " + P1.getDiagonal());
        
        System.out.println("\n=== Persegi P2 ===");
        P2.printInfo();
        System.out.println("Luas: " + P2.getLuas());
        System.out.println("Keliling: " + P2.getKeliling());
        System.out.println("Diagonal: " + P2.getDiagonal());

        System.out.println("\n=== Lingkaran L1 ===");
        L1.printInfo();
        System.out.println("Luas: " + L1.getLuas());
        System.out.println("Keliling: " + L1.getKeliling());

        System.out.println("\n=== Lingkaran L2 ===");
        L2.printInfo();
        System.out.println("Luas: " + L2.getLuas());
        System.out.println("Keliling: " + L2.getKeliling());

        L2.printInfo();
        BangunDatar.printCounterBangunDatar();

        System.out.println("Apakah P1 dan P2 memiliki luas yang sama? " + P1.isEqualLuas(P2));
        System.out.println("Apakah L1 dan L2 memiliki keliling yang sama? " + L1.isEqualKeliling(L2));
        System.out.println("Apakah P1 dan L1 memiliki keliling yang sama? " + P1.isEqualKeliling(L1));

        System.out.println("\n=== Zoom in & zoom out ===");
        P2.zoomIn();
        System.out.println("P2 setelah zoom in:");
        P2.printInfo();

        P2.zoomOut();
        System.out.println("P2 setelah zoom out:");
        P2.printInfo();

        L2.zoom(120);
        System.out.println("L2 setelah diperbesar 120%:");
        L2.printInfo();
    }
}

/*
Bagian 1 - Abstract Class
3. Dari pembuatan objek seperti contoh, adakah kode yang bermasalah pada saat dijalankan?
Jawab:
BangunDatar B1 = new BangunDatar(); -> bermasalah karena BangunDatar adalah abstract class sehingga tidak bisa diinstansiasi secara langsung
BangunDatar P1 = new Persegi(10); -> bermasalah karena konstruktor membutuhkan tiga parameter (sisi, warna, dan border), tetapi hanya diberikan satu (10)
Persegi P2 = new Persegi(5); -> bermasalah karena konstruktor membutuhkan tiga parameter (sisi, warna, border), tetapi hanya diberikan satu (5)
BangunDatar L1 = new Lingkaran(7); -> bermasalah karena konstruktor membutuhkan tiga parameter (diameter, warna, dan border), tetapi hanya diberikan satu (7).
Lingkaran L1 = new Lingkaran (14) -> bermasalah karena konstruktor membutuhkan tiga parameter (diameter, warna, dan border), tetapi hanya diberikan satu (14).

5. Apakah method yang dibuat pada langkah nomor 4 dapat digunakan untuk membandingkan objek bangun datar yang berbeda?
Jawab: Ya, isEqualLuas dan isEqualKeliling dapat digunakan untuk membandingkan objek bangun datar yang berbeda karena kedua method tersebut hanya bergantung 
pada nilai numerik yang dikembalikan yang tersedia untuk semua subclass BangunDatar.

Jika BangunDatar tidak dijadikan sebagai abstract class, dapatkah Anda membuat method isEqualLuas() dan isEqualKeliling pada class BangunDatar? Mengapa?
Jawab: Ya, isEqualLuas dan isEqualKeliling masih dapat dibuat dalam BangunDatar jika BangunDatar memiliki implementasinya.

Apakah kelebihan saat class BangunDatar dijadikan sebagai abstract class daripada non-abstract class?
Jawab: 
- Mencegah instansiasi langsung, sehingga hanya subclass seperti Persegi dan Lingkaran yang bisa dibuat objeknya.
- Memastikan implementasi metode abstract, sehingga setiap subclass dipaksa untuk memberikan implementasi spesifiknya, menghindari kemungkinan error akibat 
method yang belum didefinisikan.

Bagian 2 - Interface
Apakah keuntungan saat method zoomIn(), zoomOut(), dan zoom() dikemas dalam interface IResize dibanding dijadikan sebagai abstract method dalam class BangunDatar?
Jawab: interface lebih fleksibel dibanding memasukkan metode tersebut sebagai abstract method dalam BangunDatar.
*/