/************************************/
/* Program   : RuangKelas.java */
/* Deskripsi : Subclass Ruang Kelas*/
/* NIM/Nama  : 24060123130114/Tsuraya Olivia*/
/* Tanggal   : 27 Maret 2025*/
/***********************************/

public class RuangKelas extends Ruang {
    private int kursiTersedia, kursiRusak;
    private static final double TARIF_KEBERSIHAN = 10000; 
    
    public RuangKelas(String kode, double panjang, double lebar, double tinggi, int kapasitas, int kursiTersedia, int kursiRusak) {
        super(kode, panjang, lebar, tinggi, kapasitas);
        this.kursiTersedia = kursiTersedia;
        this.kursiRusak = kursiRusak;
    }
    
    public int getKursiTersedia() { 
        return kursiTersedia; 
    }

    public void setKursiTersedia(int kursiTersedia) { 
        this.kursiTersedia = kursiTersedia; 
    }

    public int getKursiRusak() { 
        return kursiRusak; 
    }

    public void setKursiRusak(int kursiRusak) { 
        this.kursiRusak = kursiRusak; 
    }
    
    @Override
    public double hitungBiayaKebersihan(double tarifKebersihan) {
    return super.hitungBiayaKebersihan(TARIF_KEBERSIHAN); // Use the constant
}
    
    @Override
    public void printInfo() {
        super.printInfo();
        System.out.println("Jenis: Ruang Kelas");
        System.out.println("Kursi Tersedia: " + kursiTersedia);
        System.out.println("Kursi Rusak: " + kursiRusak);
        System.out.println("Biaya Kebersihan: " + hitungBiayaKebersihan(TARIF_KEBERSIHAN));
    }
}
