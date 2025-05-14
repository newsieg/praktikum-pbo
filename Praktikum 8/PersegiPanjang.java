/************************************/
/* Program   : PersegiPanjang.java */
/* Deskripsi : Kelas Persegi Panjang*/
/* NIM/Nama  : 24060123130114/Tsuraya Olivia*/
/* Tanggal   : 8 Mei 2025*/
/***********************************/

public class PersegiPanjang extends BangunDatar {
    private double panjang;
    private double lebar;

    public PersegiPanjang(double panjang, double lebar) {
        this.panjang = panjang;
        this.lebar = lebar;
    }

    public double hitungKeliling() {
        return 2 * (panjang + lebar);
    }
}
