/************************************/
/* Program   : DosenTamu.java */
/* Deskripsi : Class Dosen Tamu*/
/* NIM/Nama  : 24060123130114/Tsuraya Olivia*/
/* Tanggal   : 13 Maret 2025*/
/***********************************/

public class DosenTamu extends Dosen {
    String NIDK;
    String tanggalBerakhirKontrak;

    DosenTamu(String NIP, String nama, String tanggalLahir, String TMT, double gajiPokok, String fakultas, String NIDK, String tanggalBerakhirKontrak){
        super(NIP, nama, tanggalLahir, TMT, gajiPokok, fakultas);
        this.NIDK = NIDK;
        this.tanggalBerakhirKontrak = tanggalBerakhirKontrak;
    }

    @Override
    void printInfo(){
        System.out.println("NIP : " + NIP);
        System.out.println("NIDK : " + NIDK); 
        System.out.println("Nama : " + nama);
        System.out.println("Tanggal Lahir : " + formatTanggal(tanggalLahir));
        System.out.println("TMT : " + formatTanggal(TMT));
        System.out.println("Jabatan : Dosen Tamu");
        System.out.println("Fakultas : " + fakultas);
        int[] masaKerja = hitungMasaKerja();
        System.out.println("Masa Kerja : " + masaKerja[0] + " tahun " + masaKerja[1] + " bulan");
        System.out.println("Tanggal Terakhir Kontrak : " + formatTanggal(tanggalBerakhirKontrak));
        double tunjangan = 0.025 * gajiPokok;
        System.out.println("Gaji Pokok : Rp " + String.format("%,.2f", gajiPokok));
        System.out.println("Tunjangan : 2.5% x Rp " + String.format("%,.2f", gajiPokok) + " = Rp " + String.format("%,.2f", tunjangan));
    }
}
