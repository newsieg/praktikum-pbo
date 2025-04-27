/************************************/
/* Program   : Pegawai.java */
/* Deskripsi : Class Pegawai*/
/* NIM/Nama  : 24060123130114/Tsuraya Olivia*/
/* Tanggal   : 24 April 2025*/
/***********************************/

public class Pegawai {
    protected String nama;
    protected int gajiPokok = 5000000;

    public void setNama(String nama) {
        this.nama = nama;
    }

    public void tampilData() {
        System.out.println("Nama : " + nama + ", Gaji Pokok : " + gajiPokok);
    }
}
