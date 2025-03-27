/************************************/
/* Program   : Laboratorium.java */
/* Deskripsi : Subclass Laboratorium*/
/* NIM/Nama  : 24060123130114/Tsuraya Olivia*/
/* Tanggal   : 27 Maret 2025*/
/***********************************/

public class Laboratorium extends Ruang{
    protected String namaLab;
    protected double hargaSewa;
    private static final double TARIF_KEBERSIHAN = 15000; 
    
    public Laboratorium(String kode, double panjang, double lebar, double tinggi, int kapasitas, String namaLab, double hargaSewa) {
        super(kode, panjang, lebar, tinggi, kapasitas);
        this.namaLab = namaLab;
        this.hargaSewa = hargaSewa;
    }
    
    public String getNamaLab() { 
        return namaLab; 
    }

    public void setNamaLab(String namaLab) { 
        this.namaLab = namaLab; 
    }

    public double getHargaSewa() { 
        return hargaSewa;
    }

    public void setHargaSewa(double hargaSewa) { 
        this.hargaSewa = hargaSewa; 
    }
    
    @Override
    public double hitungBiayaKebersihan(double tarifKebersihan) {
        return super.hitungBiayaKebersihan(TARIF_KEBERSIHAN);
    }
    
    @Override
    public void printInfo() {
        super.printInfo();
        System.out.println("Jenis: Laboratorium");
        System.out.println("Nama Laboratorium: " + namaLab);
        System.out.println("Harga Sewa: " + hargaSewa);
        System.out.println("Biaya Kebersihan: " + hitungBiayaKebersihan(TARIF_KEBERSIHAN));
    }
}
