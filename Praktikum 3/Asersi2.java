/************************************/
/* Program   : Asersi2.java */
/* Deskripsi : Program untuk demo asersi, yang akan menolak input jari-jari lingkaran yang bernilai 0*/
/* NIM/Nama  : 24060123130114/Tsuraya Olivia*/
/* Tanggal   : 6 Maret 2025*/
/***********************************/

class Lingkaran{
    private double jariJari;
    public Lingkaran(double jariJari){
        this.jariJari = jariJari;
    }
    public double hitungKeliling(){
        double keliling = 2*Math.PI*jariJari;
        return keliling;
    }
}

public class Asersi2 {
    public static void main(String[] args){
        double jariJari = 0;
        assert(jariJari > 0): "jari jari tidak boleh nol";
        Lingkaran L = new Lingkaran(jariJari);
        double kelilingLingkaran = L.hitungKeliling();
        System.out.println("keliling lingkaran = " + kelilingLingkaran);
    }
}

/* Secara konsep, ada yang kurang tepat pada program Asersi2 di atas, jelaskan! 
   Jawab: Nilai jariJari tidak berubah sebelum assert dieksekusi.
   Variabel jariJari diberikan nilai 0, lalu langsung diperiksa dengan pernyataan assert(jariJari > 0).
   Karena jariJari bernilai 0, kondisi jariJari > 0 akan bernilai false, sehingga asersi akan gagal dan menampilkan pesan "jari jari tidak boleh nol" jika assertions diaktifkan.
*/