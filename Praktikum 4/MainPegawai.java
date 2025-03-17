/************************************/
/* Program   : MainPegawai.java */
/* Deskripsi : Main Class Pegawai*/
/* NIM/Nama  : 24060123130114/Tsuraya Olivia*/
/* Tanggal   : 13 Maret 2025*/
/***********************************/

public class MainPegawai {
    public static void main(String[] args) {
        DosenTetap dosenTetap = new DosenTetap("9545647548", "Andi", "5 Mei 1990", "1 Januari 2015", 5000000, "Fakultas Sains dan Matematika", "78647324");
        dosenTetap.printInfo();
        System.out.println();

        DosenTamu dosenTamu = new DosenTamu("1234567890", "Budi", "10 Desember 1985", "1 Juni 2020", 4000000, "Fakultas Teknik", "98765432", "31 Desember 2025");
        dosenTamu.printInfo();
        System.out.println();

        Tendik tendik = new Tendik("9876543210", "Marie", "7 Maret 1988", "1 Juli 2010", 3000000, "Akademik");
        tendik.printInfo();
    }
}
