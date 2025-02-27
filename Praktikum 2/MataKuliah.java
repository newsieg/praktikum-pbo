/************************************/
/* Program   : MataKuliah.java */
/* Deskripsi : Class MataKuliah */
/* NIM/Nama  : 24060123130114/Tsuraya Olivia*/
/* Tanggal   : 27 Februari 2025*/
/***********************************/

public class MataKuliah {
    //ATRIBUT
    private String idMatkul;
    private String nama;
    private int sks;

    //METHOD
    public MataKuliah(){
        idMatkul = "";
        nama = "";
        sks = 0;
    }

    public MataKuliah(String idMatkul, String nama, int sks){
        this.idMatkul = idMatkul;
        this.nama = nama;
        this.sks = sks;
    }

    public void setIDMatkul(String idMatkul){
        this.idMatkul = idMatkul;
    }

    public String getIDMatkul(){
        return idMatkul;
    }

    public void setNama(String nama){
        this.nama = nama;
    }

    public String getNama(){
        return nama;
    }

    public void setSKS(int sks){
        this.sks = sks;
    }

    public int getSKS(){
        return sks;
    }
    
}
