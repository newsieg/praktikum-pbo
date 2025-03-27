/************************************/
/* Program   : LabNonKomputer.java */
/* Deskripsi : Subclass Laboratorium Non-Komputer*/
/* NIM/Nama  : 24060123130114/Tsuraya Olivia*/
/* Tanggal   : 27 Maret 2025*/
/***********************************/

public class LabNonKomputer extends Laboratorium {
    private String mataKuliah;
    
    public LabNonKomputer(String kode, double panjang, double lebar, double tinggi, int kapasitas, String namaLab, double hargaSewa, String mataKuliah) {
        super(kode, panjang, lebar, tinggi, kapasitas, namaLab, hargaSewa);
        this.mataKuliah = mataKuliah;
    }
    
    public String getMataKuliah() { 
        return mataKuliah; 
    }

    public void setMataKuliah(String mataKuliah) { 
        this.mataKuliah = mataKuliah; 
    }
    
    @Override
    public void printInfo() {
        super.printInfo();
        System.out.println("Kategori: Laboratorium Non-Komputer");
        System.out.println("Mata kuliah: " + mataKuliah);
    }
}
