/************************************/
/* Program   : Mahasiswa.java */
/* Deskripsi : Class Mahasiswa */
/* NIM/Nama  : 24060123130114/Tsuraya Olivia*/
/* Tanggal   : 27 Februari 2025*/
/***********************************/

import java.util.ArrayList;

public class Mahasiswa{
    //ATRIBUT
    private String nim;
    private String nama;
    private String prodi;
    private ArrayList<MataKuliah> listMatkul;
    private Dosen dosenWali;
    private Kendaraan kendaraan;

    //METHOD
    public Mahasiswa(){
        this.nim = "";
        this.nama = "";
        this.prodi = "";
        this.listMatkul = new ArrayList<>();
        this.dosenWali = null;
        this.kendaraan = null;
    }

    public Mahasiswa(String nim, String nama, String prodi){
        this.nim = nim;
        this.nama = nama;
        this.prodi = prodi;
        this.listMatkul = new ArrayList<>();
        this.dosenWali = null;
        this.kendaraan = null;
    }

    public void setNIM(String nim){
        this.nim = nim;
    }

    public String getNIM(){
        return nim;
    }

    public void setNama(String nama){
        this.nama = nama;
    }

    public String getNama(){
        return nama;
    }

    public void setProdi(String prodi){
        this.prodi = prodi;
    }

    public String getProdi(){
        return prodi;
    }

    public void setDosenWali(Dosen dosenWali){
        this.dosenWali = dosenWali;
    }

    public Dosen getDosenWali(){
        return dosenWali;
    }

    public void setKendaraan(Kendaraan kendaraan){
        this.kendaraan = kendaraan;
    }

    public Kendaraan getKendaraan(){
        return kendaraan;
    }

    public void addMatKul(MataKuliah matkul){
        listMatkul.add(matkul);
    }

    public int getJumlahSKS(){
        int totalSKS = 0;
        for (MataKuliah matkul : listMatkul){
            totalSKS += matkul.getSKS();
        }
        return totalSKS;
    }

    public int getJumlahMatKul(){
        return listMatkul.size();
    }

    public void printMhs(){
        System.out.println("NIM: " + nim);
        System.out.println("Nama: " + nama);
        System.out.println("Prodi: " + prodi);
    }

    public void printDetailMhs(){
        printMhs();

        for (MataKuliah matkul : listMatkul) {
            System.out.println("- " + matkul.getIDMatkul() + " | " + matkul.getNama() + " | " + matkul.getSKS() + " SKS");
        }

        System.out.println("NIP Dosen Wali: " + dosenWali.getNIP());
        System.out.println("Nama Dosen Wali: " + dosenWali.getNama());
        System.out.println("Prodi Dosen Wali: " + dosenWali.getProdi());

        System.out.println("No Plat Kendaraan: " + kendaraan.getNoPlat());
        System.out.println("Jenis Kendaraan: " + kendaraan.getJenis());
    }
}
