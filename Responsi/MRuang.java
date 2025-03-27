/************************************/
/* Program   : MRuang.java */
/* Deskripsi : Main Class Ruang*/
/* NIM/Nama  : 24060123130114/Tsuraya Olivia*/
/* Tanggal   : 27 Maret 2025*/
/***********************************/

public class MRuang {
    public static void main(String[] args) {
        Department informatika = new Department("Informatika", "Dr. Eka", 12000);
        Department fisika = new Department("Fisika", "Dr. Ani", 11000);
        
        RuangKelas kelasA1 = new RuangKelas("A1", 10, 8, 3, 30, 30, 2);
        RuangDosen dosenBudi = new RuangDosen("D01", 5, 5, 3, 2, "Budi", informatika, 1, 2);
        RuangDepartment ruangInformatika = new RuangDepartment("INF01", 8, 6, 3, 10, informatika, 5, 10, 3);
        
        Laboratorium labKomputer = new LabKomputer("LK01", 12, 10, 3, 20, "Lab Komputer", 500000, 30);
        Laboratorium labFisika = new LabNonKomputer("LF01", 15, 12, 3, 15, "Lab Fisika", 400000, "Fisika Dasar, Termodinamika");
        
        System.out.println("=== Informasi Ruangan ===");
        kelasA1.printInfo();
        System.out.println();
        dosenBudi.printInfo();
        System.out.println();
        ruangInformatika.printInfo();
        System.out.println();
        labKomputer.printInfo();
        System.out.println();
        labFisika.printInfo();
    }
}