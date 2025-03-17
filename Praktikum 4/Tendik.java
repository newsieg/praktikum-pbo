/************************************/
/* Program   : Tendik.java */
/* Deskripsi : Class Tendik*/
/* NIM/Nama  : 24060123130114/Tsuraya Olivia*/
/* Tanggal   : 13 Maret 2025*/
/***********************************/

public class Tendik extends Pegawai {
    String bidang;

    Tendik(String NIP, String nama, String tanggalLahir, String TMT, double gajiPokok, String bidang){
        super(NIP, nama, tanggalLahir, TMT, gajiPokok);
        this.bidang = bidang;
    }

    @Override
    void printInfo(){
        super.printInfo();
        System.out.println("Jabatan : Tendik");
        System.out.println("Bidang : " + bidang);
        int[] masaKerja = hitungMasaKerja();
        System.out.println("Masa Kerja : " + masaKerja[0] + " tahun " + masaKerja[1] + " bulan");
        String bup = hitungBUP(tanggalLahir, 55);
        System.out.println("BUP : " + bup);
        double tunjangan = 0.01 * masaKerja[0] * gajiPokok;
        System.out.println("Gaji Pokok : Rp " + String.format("%,.2f", gajiPokok));
        System.out.println("Tunjangan : 1% x " + masaKerja[0] + " x Rp " + String.format("%,.2f", gajiPokok) + " = Rp " + String.format("%,.2f", tunjangan));
    }
}
