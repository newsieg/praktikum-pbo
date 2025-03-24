/************************************/
/* Program   : Pengusaha.java */
/* Deskripsi : Class Pengusaha*/
/* NIM/Nama  : 24060123130114/Tsuraya Olivia*/
/* Tanggal   : 24 Maret 2025*/
/***********************************/

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class Pengusaha extends Manusia implements Pajak {
    private String npwp;
    private static int counterPengusaha = 0;

    public Pengusaha(String nama, String tgl_mulai_kerja, String alamat, double pendapatan, String npwp){
        super(nama, tgl_mulai_kerja, alamat, pendapatan);
        this.npwp = npwp;
        counterPengusaha++;
    }

    @Override
    public int hitungMasaKerja(){
        return (int) ChronoUnit.YEARS.between(tgl_mulai_kerja, LocalDate.now()) + 1;
    }

    public double hitungPajak(){
        return 0.15 * pendapatan;
    }

    public static int getCounterPengusaha(){
        return counterPengusaha;
    }
}
