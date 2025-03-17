/************************************/
/* Program   : Dosen.java */
/* Deskripsi : Class Dosen*/
/* NIM/Nama  : 24060123130114/Tsuraya Olivia*/
/* Tanggal   : 13 Maret 2025*/
/***********************************/

public class Dosen extends Pegawai {
    String fakultas;

    Dosen(String NIP, String nama, String tanggalLahir, String TMT, double gajiPokok, String fakultas){
        super(NIP, nama, tanggalLahir, TMT, gajiPokok);
        this.fakultas = fakultas;
    }

    @Override
    void printInfo(){
        super.printInfo();
        System.out.println("Jabatan : Dosen");
        System.out.println("Fakultas : " + fakultas);
    }
}