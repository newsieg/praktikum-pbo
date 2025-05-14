/************************************/
/* Program   : ContohMetodeGenerik.java */
/* Deskripsi : Kelas ContohMetodeGenerik*/
/* NIM/Nama  : 24060123130114/Tsuraya Olivia*/
/* Tanggal   : 8 Mei 2025*/
/***********************************/

public class ContohMetodeGenerik {
    public <T extends Anabul> void cetakGerakDanSuara(Datum<T> data) {
        data.getIsi().Gerak();
        data.getIsi().Bersuara();
    }

    public <T> void cetakIsi(Datum<T> data) {
        System.out.println("Isi objek: " + data.getIsi());
    }
}
