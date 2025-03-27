/************************************/
/* Program   : RuangDepartment.java */
/* Deskripsi : Subclass Ruang Department*/
/* NIM/Nama  : 24060123130114/Tsuraya Olivia*/
/* Tanggal   : 27 Maret 2025*/
/***********************************/

public class RuangDepartment extends Ruang {
    private Department Department;
    private int jumlahMeja, jumlahKursi, jumlahLemari;
    
    public RuangDepartment(String kode, double panjang, double lebar, double tinggi, int kapasitas, Department Department, int jumlahMeja, int jumlahKursi, int jumlahLemari) {
        super(kode, panjang, lebar, tinggi, kapasitas);
        this.Department = Department;
        this.jumlahMeja = jumlahMeja;
        this.jumlahKursi = jumlahKursi;
        this.jumlahLemari = jumlahLemari;
    }
    
    public Department getDepartment() { 
        return Department; 
    }

    public void setDepartment(Department Department) { 
        this.Department = Department; 
    }

    public int getJumlahMeja() { 
        return jumlahMeja; 
    }

    public void setJumlahMeja(int jumlahMeja) { 
        this.jumlahMeja = jumlahMeja; 
    }

    public int getJumlahKursi() { 
        return jumlahKursi; 
    }

    public void setJumlahKursi(int jumlahKursi) { 
        this.jumlahKursi = jumlahKursi; 
    }

    public int getJumlahLemari() { 
        return jumlahLemari; 
    }

    public void setJumlahLemari(int jumlahLemari) { 
        this.jumlahLemari = jumlahLemari; 
    }
    
    @Override
    public double hitungBiayaKebersihan(double tarifKebersihan) {
        return super.hitungBiayaKebersihan(Department.getTarifKebersihan());
    }
    
    @Override
    public void printInfo() {
        super.printInfo();
        System.out.println("Jenis: Ruang Department");
        System.out.println("Department: " + Department.getNamaDepartment());
        System.out.println("Ketua Department: " + Department.getKetuaDepartment());
        System.out.println("Jumlah Meja: " + jumlahMeja);
        System.out.println("Jumlah Kursi: " + jumlahKursi);
        System.out.println("Jumlah Lemari: " + jumlahLemari);
        System.out.println("Biaya Kebersihan: " + hitungBiayaKebersihan(Department.getTarifKebersihan()));
    }
}
