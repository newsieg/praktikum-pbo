/************************************/
/* Program   : Manajer.java */
/* Deskripsi : Subclass Manajer*/
/* NIM/Nama  : 24060123130114/Tsuraya Olivia*/
/* Tanggal   : 24 April 2025*/
/***********************************/

public class Manajer extends Pegawai {
    private int tunjangan = 700000;

    public Manajer(String nama) {
        this.nama = nama;
    }

    @Override
    public void tampilData() {
        super.tampilData();
        System.out.println("Tunjangan : " + tunjangan);
    }
}

