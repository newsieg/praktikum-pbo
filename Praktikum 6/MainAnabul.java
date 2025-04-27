/************************************/
/* Program   : MainAnabul.java */
/* Deskripsi : Main Class Anabul*/
/* NIM/Nama  : 24060123130114/Tsuraya Olivia*/
/* Tanggal   : 27 April 2025*/
/***********************************/

import java.util.ArrayList;

public class MainAnabul {
    public static void main(String[] args) {
        Anabul kucing = new Kucing("Ana");
        Anabul anjing = new Anjing("Max");
        Anabul burung = new Burung("Jeki");

        ArrayList<Anabul> emps = new ArrayList<>();
        emps.add(kucing);
        emps.add(anjing);
        emps.add(burung);

        for (Anabul emp : emps) {
            emp.Gerak();
            emp.Bersuara();
            System.out.println();
        }
    }
}
