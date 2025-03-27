/************************************/
/* Program   : Ruang.java */
/* Deskripsi : Class Ruang*/
/* NIM/Nama  : 24060123130114/Tsuraya Olivia*/
/* Tanggal   : 27 Maret 2025*/
/***********************************/

public class Ruang {
    protected String kode;
    protected double panjang, lebar, tinggi;
    protected int kapasitas;

    public Ruang(String kode, double panjang, double lebar, double tinggi, int kapasitas) {
        this.kode = kode;
        this.panjang = panjang;
        this.lebar = lebar;
        this.tinggi = tinggi;
        this.kapasitas = kapasitas;
    }

    public String getKode() { 
        return kode; 
    }

    public void setKode(String kode) { 
        this.kode = kode; 
    }

    public double getPanjang() { 
        return panjang; 
    }

    public void setPanjang(double panjang) { 
        this.panjang = panjang; 
    }

    public double getLebar() { 
        return lebar; 
    }

    public void setLebar(double lebar) { 
        this.lebar = lebar; 
    }

    public double getTinggi() { 
        return tinggi; 
    }

    public void setTinggi(double tinggi) { 
        this.tinggi = tinggi; 
    }

    public int getKapasitas() { 
        return kapasitas; 
    }

    public void setKapasitas(int kapasitas) { 
        this.kapasitas = kapasitas; 
    }
    
    public double hitungBiayaKebersihan(double tarifKebersihan) {
        return panjang * lebar * tarifKebersihan;
    }
    
    public void printInfo() {
        System.out.println("Kode ruang: " + kode);
        System.out.println("Dimensi ruang: " + panjang + " x " + lebar + " x " + tinggi);
        System.out.println("Kapasitas: " + kapasitas);
    }
}
