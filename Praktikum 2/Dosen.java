/************************************/
/* Program   : Dosen.java */
/* Deskripsi : Class Dosen */
/* NIM/Nama  : 24060123130114/Tsuraya Olivia*/
/* Tanggal   : 27 Februari 2025*/
/***********************************/

public class Dosen {
    //ATRIBUT
    private String nip;
    private String nama;
    private String prodi;

    //METHOD
    public Dosen(){
        nip = "";
        nama = "";
        prodi = "";
    }

    public Dosen(String nip, String nama, String prodi){
        this.nip = nip;
        this.nama = nama;
        this.prodi = prodi;
    }

    public void setNIP(String nip){
        this.nip = nip;
    }

    public String getNIP(){
        return nip;
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

}
