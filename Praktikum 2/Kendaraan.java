/************************************/
/* Program   : Kendaraan.java */
/* Deskripsi : Class Kendaraan */
/* NIM/Nama  : 24060123130114/Tsuraya Olivia*/
/* Tanggal   : 27 Februari 2025*/
/***********************************/

public class Kendaraan {
    //ATRIBUT
    private String noPlat;
    private String jenis;

    //METHOD
    public Kendaraan(){
        noPlat = "";
        jenis = "";
    }

    public Kendaraan(String noPlat, String jenis){
        this.noPlat = noPlat;
        this.jenis = jenis;
    }

    public void setNoPlat(String noPlat){
        this.noPlat = noPlat;
    }

    public String getNoPlat(){
        return noPlat;
    }

    public void setJenis(String jenis){
        this.jenis = jenis;
    }

    public String getJenis(){
        return jenis;
    }
}
