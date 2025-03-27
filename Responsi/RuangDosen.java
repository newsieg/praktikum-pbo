/************************************/
/* Program   : RuangDosen.java */
/* Deskripsi : Subclass Ruang Dosen*/
/* NIM/Nama  : 24060123130114/Tsuraya Olivia*/
/* Tanggal   : 27 Maret 2025*/
/***********************************/

public class RuangDosen extends Ruang {
    private String namaDosen;
    private Department Department;
    private int jumlahMeja, jumlahKursi;
    
    public RuangDosen(String kode, double panjang, double lebar, double tinggi, int kapasitas, String namaDosen, Department Department, int jumlahMeja, int jumlahKursi) {
        super(kode, panjang, lebar, tinggi, kapasitas);
        this.namaDosen = namaDosen;
        this.Department = Department;
        this.jumlahMeja = jumlahMeja;
        this.jumlahKursi = jumlahKursi;
    }
    
    public String getNamaDosen() { 
        return namaDosen; 
    }

    public void setNamaDosen(String namaDosen) { 
        this.namaDosen = namaDosen; 
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
    
    @Override
    public double hitungBiayaKebersihan(double tarifKebersihan) {
        return super.hitungBiayaKebersihan(Department.getTarifKebersihan());
    }
    
    @Override
    public void printInfo() {
    super.printInfo();
    System.out.println("Jenis: Ruang Dosen");
    System.out.println("Nama Dosen: " + namaDosen);
    System.out.println("Department: " + Department.getNamaDepartment());
    System.out.println("Ketua Department: " + Department.getKetuaDepartment());
    System.out.println("Jumlah Meja: " + jumlahMeja);
    System.out.println("Jumlah Kursi: " + jumlahKursi);
    System.out.println("Biaya Kebersihan: " + hitungBiayaKebersihan(Department.getTarifKebersihan()));
}
}
