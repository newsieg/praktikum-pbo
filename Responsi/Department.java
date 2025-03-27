/************************************/
/* Program   : Department.java */
/* Deskripsi : Class Department*/
/* NIM/Nama  : 24060123130114/Tsuraya Olivia*/
/* Tanggal   : 27 Maret 2025*/
/***********************************/

public class Department {
    private String namaDepartment;
    private String ketuaDepartment;
    private double tarifKebersihan;
    
    public Department(String namaDepartment, String ketuaDepartment, double tarifKebersihan) {
        this.namaDepartment = namaDepartment;
        this.ketuaDepartment = ketuaDepartment;
        this.tarifKebersihan = tarifKebersihan;
    }
    
    public String getNamaDepartment() {
        return namaDepartment;
    }
    
    public void setNamaDepartment(String namaDepartment) {
        this.namaDepartment = namaDepartment;
    }
    
    public String getKetuaDepartment() {
        return ketuaDepartment;
    }
    
    public void setKetuaDepartment(String ketuaDepartment) {
        this.ketuaDepartment = ketuaDepartment;
    }
    
    public double getTarifKebersihan() {
        return tarifKebersihan;
    }
    
    public void setTarifKebersihan(double tarifKebersihan) {
        this.tarifKebersihan = tarifKebersihan;
    }
}