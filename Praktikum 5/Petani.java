/************************************/
/* Program   : Petani.java */
/* Deskripsi : Class Petani*/
/* NIM/Nama  : 24060123130114/Tsuraya Olivia*/
/* Tanggal   : 24 Maret 2025*/
/***********************************/

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class Petani extends Manusia implements Pajak {
    private String asalKota;
    private static int counterPetani = 0;

    public Petani(String nama, String tgl_mulai_kerja, String alamat, double pendapatan, String asalKota){
        super(nama, tgl_mulai_kerja, alamat, pendapatan);
        this.asalKota = asalKota;
        counterPetani++;
    }

    @Override
    public int hitungMasaKerja(){
        return (int) ChronoUnit.YEARS.between(tgl_mulai_kerja, LocalDate.now()) + 1;
    }

    public double hitungPajak(){
        return 0;
    }

    public static int getCounterPetani(){
        return counterPetani;
    }

}
