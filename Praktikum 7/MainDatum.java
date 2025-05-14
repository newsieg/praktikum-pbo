/************************************/
/* Program   : MainDatum.java */
/* Deskripsi : Aplikasi Kelas Generik Datum*/
/* NIM/Nama  : 24060123130114/Tsuraya Olivia*/
/* Tanggal   : 8 Mei 2025*/
/***********************************/

public class MainDatum {
    public static void main(String[] args) {
        Datum<Anabul> dKucing = new Datum<>(new Kucing("Ana"));
        Datum<Anabul> dAnjing = new Datum<>(new Anjing("Max"));
        Datum<Anabul> dBurung = new Datum<>(new Burung("Jeki"));

        dKucing.getIsi().Gerak();
        dKucing.getIsi().Bersuara();
        System.out.println();

        dAnjing.getIsi().Gerak();
        dAnjing.getIsi().Bersuara();
        System.out.println();

        dBurung.getIsi().Gerak();
        dBurung.getIsi().Bersuara();
    }
}
