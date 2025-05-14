/************************************/
/* Program   : BangunDatarGenericTest.java */
/* Deskripsi : Aplikasi Kelas BangunDatarGeneric*/
/* NIM/Nama  : 24060123130114/Tsuraya Olivia*/
/* Tanggal   : 8 Mei 2025*/
/***********************************/

public class BangunDatarGenericTest {
    public static void main(String[] args) {
        Lingkaran l = new Lingkaran(2);
        BangunDatarGeneric<Lingkaran> bdgLingkaran = new BangunDatarGeneric<>();
        bdgLingkaran.set(l);
        System.out.println("Keliling Lingkaran: " + bdgLingkaran.hitungKeliling());
        System.out.println("Tipe generic: " + bdgLingkaran.get().getClass().getName());
        System.out.println();

        Persegi p = new Persegi(4);
        BangunDatarGeneric<Persegi> bdgPersegi = new BangunDatarGeneric<>();
        bdgPersegi.set(p);
        System.out.println("Keliling Persegi: " + bdgPersegi.hitungKeliling());
        System.out.println("Tipe generic: " + bdgPersegi.get().getClass().getName());
        System.out.println();

        PersegiPanjang pp = new PersegiPanjang(4, 6);
        BangunDatarGeneric<PersegiPanjang> bdgPersegiPanjang = new BangunDatarGeneric<>();
        bdgPersegiPanjang.set(pp);
        System.out.println("Keliling Persegi Panjang: " + bdgPersegiPanjang.hitungKeliling());
        System.out.println("Tipe generic: " + bdgPersegiPanjang.get().getClass().getName());
        System.out.println();

        Segitiga s = new Segitiga(3, 4, 5);
        BangunDatarGeneric<Segitiga> bdgSegitiga = new BangunDatarGeneric<>();
        bdgSegitiga.set(s);
        System.out.println("Keliling Segitiga: " + bdgSegitiga.hitungKeliling());
        System.out.println("Tipe generic: " + bdgSegitiga.get().getClass().getName());
    }
}
