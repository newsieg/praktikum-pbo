/************************************/
/* Program   : PNS.java */
/* Deskripsi : Class PNS*/
/* NIM/Nama  : 24060123130114/Tsuraya Olivia*/
/* Tanggal   : 24 Maret 2025*/
/***********************************/

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class PNS extends Manusia implements Pajak {
    private String nip;
    private static int counterPNS = 0;

    public PNS(String nama, String tgl_mulai_kerja, String alamat, double pendapatan, String nip){
        super(nama, tgl_mulai_kerja, alamat, pendapatan);
        this.nip = nip;
        counterPNS++;
    }

    @Override
    public int hitungMasaKerja(){
        return (int) ChronoUnit.YEARS.between(tgl_mulai_kerja, LocalDate.now()) + 4;
    }

    public double hitungPajak(){
        return 0.1 * pendapatan;
    }

    public static int getCounterPNS(){
        return counterPNS;
    }

}
