/************************************/
/* Program   : MMataKuliah.java */
/* Deskripsi : Main class MataKuliah */
/* NIM/Nama  : 24060123130114/Tsuraya Olivia*/
/* Tanggal   : 27 Februari 2025*/
/***********************************/

public class MMataKuliah {
    public static void main(String[] args) {
        
        MataKuliah M1 = new MataKuliah();
        M1.setIDMatkul("PBO");
        M1.setNama("Pemrograman Berorientasi Objek");
        M1.setSKS(3);

        System.out.println("ID Matkul: " + M1.getIDMatkul());
        System.out.println("Nama: " + M1.getNama());
        System.out.println("SKS: " + M1.getSKS());

        MataKuliah M2 = new MataKuliah("MBD", "Manajemen Basis Data",3);
        
        System.out.println("ID Matkul: " + M2.getIDMatkul());
        System.out.println("Nama: " + M2.getNama());
        System.out.println("SKS: " + M2.getSKS());
    }
}
