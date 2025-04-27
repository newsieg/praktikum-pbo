/************************************/
/* Program   : TestPolimorfisme.java */
/* Deskripsi : Main Class TestPolimorfisme Post Test*/
/* NIM/Nama  : 24060123130114/Tsuraya Olivia*/
/* Tanggal   : 24 April 2025*/
/***********************************/

import java.util.ArrayList;

public class TestPolimorfisme {
    public static void main(String[] args) {
        Pegawai pegawai = new Programmer("Mira");
        Pegawai pegawai2 = new Manajer("Joko");
        Pegawai pegawai3 = new Manajer("Argo");

        ArrayList<Pegawai> emps = new ArrayList<>();
        emps.add(pegawai);
        emps.add(pegawai2);
        emps.add(pegawai3);

        System.out.println("Tsuraya Olivia (24060123130114)");
        for (Pegawai emp : emps){
            emp.tampilData();
        }
    }
}

