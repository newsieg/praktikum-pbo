/************************************/
/* Program   : Segitiga.java */
/* Deskripsi : Kelas Segitiga*/
/* NIM/Nama  : 24060123130114/Tsuraya Olivia*/
/* Tanggal   : 8 Mei 2025*/
/***********************************/

public class Segitiga extends BangunDatar {
    private double sisiA;
    private double sisiB;
    private double sisiC;

    public Segitiga(double sisiA, double sisiB, double sisiC) {
        this.sisiA = sisiA;
        this.sisiB = sisiB;
        this.sisiC = sisiB;
    }

    public double hitungKeliling() {
        return sisiA + sisiB + sisiC;
    }
}
