/************************************/
/* Program   : Koleksi.java */
/* Deskripsi : Kelas Koleksi*/
/* NIM/Nama  : 24060123130114/Tsuraya Olivia*/
/* Tanggal   : 8 Mei 2025*/
/***********************************/

import java.util.ArrayList;

public class Koleksi<T> {
    private int nbelm; 
    private ArrayList<T> wadah; 
    
    public Koleksi() {
        wadah = new ArrayList<>();
        nbelm = 0;
    }

    public T getIsi(int index) {
        if (index >= 0 && index < nbelm) {
            return wadah.get(index);
        } 
        else {
            throw new IndexOutOfBoundsException("Index tidak valid");
        }
    }

    public void setIsi(int index, T value) {
        if (index >= 0 && index < nbelm) {
            wadah.set(index, value);
        } 
        else {
            throw new IndexOutOfBoundsException("Index tidak valid");
        }
    }

    public int getSize() {
        return nbelm;
    }

    public void setSize(int size) {
        this.nbelm = size;
    }

    public void add(T value) {
        wadah.add(value);
        nbelm++;
    }

    public void delete(int index) {
        if (index >= 0 && index < nbelm) {
            wadah.remove(index);
            nbelm--;
        } 
        else {
            throw new IndexOutOfBoundsException("Index tidak valid");
        }
    }

    public void showAll() {
        System.out.println("Isi Koleksi:");
        for (int i = 0; i < nbelm; i++) {
            System.out.println("[" + i + "] = " + wadah.get(i));
        }
    }
}
