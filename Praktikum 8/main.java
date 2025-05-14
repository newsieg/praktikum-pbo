/************************************/
/* Program   : main.java */
/* Deskripsi : Aplikasi Kelas Koleksi*/
/* NIM/Nama  : 24060123130114/Tsuraya Olivia*/
/* Tanggal   : 8 Mei 2025*/
/***********************************/

public class main {
    public static void main(String[] args) {
        Koleksi<Character> koleksiChar = new Koleksi<>();

        for (char c = 'A'; c < 'A' + 10; c++) {
            koleksiChar.add(c);
        }

        koleksiChar.showAll();

        koleksiChar.setIsi(4, 'Z');
        System.out.println("\nSetelah mengubah indeks ke-4 menjadi 'Z':");
        koleksiChar.showAll();

        koleksiChar.delete(1);
        System.out.println("\nSetelah menghapus indeks ke-1:");
        koleksiChar.showAll();

        System.out.println("\nElemen pada indeks ke-3: " + koleksiChar.getIsi(3));
        System.out.println("Ukuran koleksi saat ini: " + koleksiChar.getSize());
    }
}
