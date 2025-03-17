/************************************/
/* Program   : DosenTetap.java */
/* Deskripsi : Class Dosen Tetap*/
/* NIM/Nama  : 24060123130114/Tsuraya Olivia*/
/* Tanggal   : 13 Maret 2025*/
/***********************************/

public class DosenTetap extends Dosen {
    String NIDN;

    DosenTetap(String NIP, String nama, String tanggalLahir, String TMT, double gajiPokok, String fakultas, String NIDN){
        super(NIP, nama, tanggalLahir, TMT, gajiPokok, fakultas);
        this.NIDN = NIDN;
    }

    @Override
    void printInfo(){
        System.out.println("NIP : " + NIP);
        System.out.println("NIDN : " + NIDN);
        System.out.println("Nama : " + nama);
        System.out.println("Tanggal Lahir : " + formatTanggal(tanggalLahir));
        System.out.println("TMT : " + formatTanggal(TMT));
        System.out.println("Jabatan : Dosen Tetap");
        System.out.println("Fakultas : " + fakultas);
        int[] masaKerja = hitungMasaKerja();
        System.out.println("Masa Kerja : " + masaKerja[0] + " tahun " + masaKerja[1] + " bulan");
        String bup = hitungBUP(tanggalLahir, 65);
        System.out.println("BUP : " + bup);
        double tunjangan = 0.02 * masaKerja[0] * gajiPokok;
        System.out.println("Gaji Pokok : Rp " + String.format("%,.2f", gajiPokok));
        System.out.println("Tunjangan : 2% x " + masaKerja[0] + " x Rp " + String.format("%,.2f", gajiPokok) + " = Rp " + String.format("%,.2f", tunjangan));
    }
}
