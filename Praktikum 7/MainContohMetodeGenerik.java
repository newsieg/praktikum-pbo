/************************************/
/* Program   : MainContohMetodeGenerik.java */
/* Deskripsi : Aplikasi Kelas ContohMetodeGenerik*/
/* NIM/Nama  : 24060123130114/Tsuraya Olivia*/
/* Tanggal   : 8 Mei 2025*/
/***********************************/

public class MainContohMetodeGenerik {
    public static void main(String[] args) {
        Datum<Kucing> datumKucing = new Datum<>(new Kucing("Ana"));
        Datum<Anjing> datumAnjing = new Datum<>(new Anjing("Max"));
        Datum<Burung> datumBurung = new Datum<>(new Burung("Jeki"));

        ContohMetodeGenerik metode = new ContohMetodeGenerik();
        metode.cetakGerakDanSuara(datumKucing);
        System.out.println();
        metode.cetakGerakDanSuara(datumAnjing);
        System.out.println();
        metode.cetakGerakDanSuara(datumBurung);
    }
}
