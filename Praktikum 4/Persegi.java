/************************************/
/* Program   : Persegi.java */
/* Deskripsi : Subclass Persegi*/
/* NIM/Nama  : 24060123130114/Tsuraya Olivia*/
/* Tanggal   : 13 Maret 2025*/
/***********************************/

public class Persegi extends BangunDatar {
    private double sisi;

    public Persegi(){
        setJmlSisi(4);
    }

    public Persegi(double sisi, String warna, String border){
        super(4,warna,border);
        this.sisi = sisi;
    }
    public double getSisi(){
        return sisi; 
    }
    
    public void setSisi(double sisi){
        this.sisi = sisi;
    }

    public double getLuas(){
        return sisi*sisi;
    }

    public double getKeliling(){
        return 4*sisi;
    }

    public double getDiagonal() {
        return sisi * Math.sqrt(2);
    }

    @Override
    public void printInfo(){
        super.printInfo();
        System.out.println("Sisi: " + sisi);
    }
}

/* 
Bagian 1 - Simple Inheritance
3. Apakah konstruktor berparameter pada kelas Persegi 
dapat direalisasikan seperti berikut? Mengapa?
    public Persegi(double sisi, String warna, String border){
            this.jmlSisi = 4;
            this.warna = warna;
            this.border = border;
            this.sisi = sisi;
    }
Jawab: tidak dapat direalisasikan karena atribut jmlSisi, 
warna, dan border bersifat private di BangunDatar sehingga tidak
dapat langsung diakses dengan this. Solusinya adalah dengan menggunakan
setter:
setJmlSisi(4);
setWarna(warna);
setBorder(border);

Bagian 4 - Access Modifier Protected
Modifikasilah atribut class BangunDatar dengan access modifier protected. 
Setelah modifikasi tersebut, apakah konstruktor berparameter pada kelas 
Persegi dapat direalisasikan seperti berikut? Mengapa?
    public Persegi(double sisi, String warna, String border){
        this.jmlSisi = 4;
        this.warna = warna;
        this.border = border;
        this.sisi = sisi;
    }
Jawab: konstruktor Persegi tetap dapat direalisasikan setelah modifikasi 
access modifier ke protected karena kelas Persegi adalah subclass dari BangunDatar, 
maka bisa langsung mengakses atribut protected dalam BangunDatar.
*/