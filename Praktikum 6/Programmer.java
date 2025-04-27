/************************************/
/* Program   : Programmer.java */
/* Deskripsi : Subclass Programmer*/
/* NIM/Nama  : 24060123130114/Tsuraya Olivia*/
/* Tanggal   : 24 April 2025*/
/***********************************/

public class Programmer extends Pegawai {
    private int bonus = 450000;

    public Programmer(String nama) {
        this.nama = nama;
    }

    @Override
    public void tampilData() {
        super.tampilData();
        System.out.println("Bonus : " + bonus);
    }
}

