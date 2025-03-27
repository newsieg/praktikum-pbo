/************************************/
/* Program   : LabKomputer.java */
/* Deskripsi : Subclass Laboratorium Komputer*/
/* NIM/Nama  : 24060123130114/Tsuraya Olivia*/
/* Tanggal   : 27 Maret 2025*/
/***********************************/

public class LabKomputer extends Laboratorium {
    private int jumlahKomputer;
        
    public LabKomputer(String kode, double panjang, double lebar, double tinggi, int kapasitas, String namaLab, double hargaSewa, int jumlahKomputer) {
        super(kode, panjang, lebar, tinggi, kapasitas, namaLab, hargaSewa);
        this.jumlahKomputer = jumlahKomputer;
    }
    
    public int getJumlahKomputer() { 
        return jumlahKomputer; 
    }

    public void setJumlahKomputer(int jumlahKomputer) { 
        this.jumlahKomputer = jumlahKomputer; 
    }
    
    @Override
    public void printInfo() {
        super.printInfo();
        System.out.println("Kategori: Laboratorium Komputer");
        System.out.println("Jumlah Komputer: " + jumlahKomputer);
    }
}
