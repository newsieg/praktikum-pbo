/************************************/
/* Program   : MMahasiswa.java */
/* Deskripsi : Main class Mahasiswa */
/* NIM/Nama  : 24060123130114/Tsuraya Olivia*/
/* Tanggal   : 27 Februari 2025*/
/***********************************/

public class MMahasiswa {
    public static void main(String[] args) {
        
        MataKuliah PBO = new MataKuliah("PBO", "Pemrograman Berorientasi Objek", 3);
        MataKuliah MBD = new MataKuliah("MBD", "Manajemen Basis Data", 3);
        Mahasiswa M1 = new Mahasiswa("123456789", "Citra", "Informatika");
        Dosen D1 = new Dosen("367376", "Andi", "Informatika");
        Kendaraan K1 = new Kendaraan("H1234AB", "motor");
        
        M1.setDosenWali(D1);
        M1.setKendaraan(K1);
        M1.addMatKul(PBO);
        M1.addMatKul(MBD);
        
        M1.printMhs();
        M1.printDetailMhs();
        
        System.out.println("Jumlah mata kuliah: " + M1.getJumlahMatKul());
        System.out.println("Jumlah SKS mata kuliah: " + M1.getJumlahSKS());
    }
}