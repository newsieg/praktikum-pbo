/************************************/
/* Program   : BangunDatar.java */
/* Deskripsi : Class Bangun Datar*/
/* NIM/Nama  : 24060123130114/Tsuraya Olivia*/
/* Tanggal   : 13 Maret 2025*/
/***********************************/

public class BangunDatar {
    protected int jmlSisi;  // Sebelumnya private
    protected String warna;
    protected String border;
    private static int counterBangunDatar = 0;

    public BangunDatar(){
        counterBangunDatar++;
    }

    public BangunDatar(int jmlSisi, String warna, String border){
        this.jmlSisi = jmlSisi;
        this.warna = warna;
        this.border = border;
        counterBangunDatar++;
    }

    public int getJmlSisi(){
        return jmlSisi;
    }

    public void setJmlSisi(int jmlSisi){
        this.jmlSisi = jmlSisi;
    }

    public String getWarna(){
        return warna;
    }

    public void setWarna(String warna){
        this.warna = warna;
    }

    public String getBorder(){
        return border;
    }

    public void setBorder(String border){
        this.border = border;
    }

    public void printInfo(){
        System.out.println("Jumlah sisi: " + jmlSisi);
        System.out.println("Warna: " + warna);
        System.out.println("Border: " + border);
    }

    public static void printCounterBangunDatar(){
        System.out.println("Jumlah objek bangun datar: " + counterBangunDatar);
    }
}

/* 
Bagian 3 - Overriding Method
2. Coba lakukan overriding pada method printCounterBangunDatar(). 
Bagaimana hasilnya?
Jawab: printCounterBangunDatar tidak bisa dioverride karena bersifat 
static.

Bagian 5 - Keyword Final
1. Tambahkan keyword final pada kelas BangunDatar. Bagaimana pengaruhnya 
terhadap kelas Persegi dan Lingkaran?
Jawab: kelas Persegi dan Lingkaran akan mengalami error karena Java tidak 
mengizinkan subclass dari kelas yang dideklarasikan dengan final.

2. Hapus kembali keyword final pada kelas BangunDatar, lalu tambahkan 
keyword final pada method printInfo() di dalam kelas BangunDatar. 
Bagaimana pengaruhnya dengan method printInfo() pada kelas Persegi dan 
Lingkaran?
Jawab: akan muncul error karena jika sebuah method diberi final, maka 
method tersebut tidak bisa di-override dalam subclass.
*/
