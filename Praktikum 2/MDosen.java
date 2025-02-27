/************************************/
/* Program   : MDosen.java */
/* Deskripsi : Main class Dosen */
/* NIM/Nama  : 24060123130114/Tsuraya Olivia*/
/* Tanggal   : 27 Februari 2025*/
/***********************************/

public class MDosen {
    public static void main(String[] args) {
        
        Dosen D1 = new Dosen();
        D1.setNIP("123456789");
        D1.setNama("Budi, S.Kom.");
        D1.setProdi("Informatika");

        System.out.println("NIP: " + D1.getNIP());
        System.out.println("Nama: " + D1.getNama());
        System.out.println("Prodi: " + D1.getProdi());

        Dosen D2 = new Dosen("694201234", "Prof. Andriana", "Sistem Informasi");
        
        System.out.println("NIP: " + D2.getNIP());
        System.out.println("Nama: " + D2.getNama());
        System.out.println("Prodi: " + D2.getProdi());
    }
}
