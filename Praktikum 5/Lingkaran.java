/************************************/
/* Program   : Lingkaran.java */
/* Deskripsi : Subclass Lingkaran*/
/* NIM/Nama  : 24060123130114/Tsuraya Olivia*/
/* Tanggal   : 20 Maret 2025*/
/***********************************/

class Lingkaran extends BangunDatar implements IRezise{
    private double jari;

    public Lingkaran(){
        setJmlSisi(0);
    }

    public Lingkaran(double diameter, String warna, String border) {
        super(0,warna,border);
        this.jari = diameter / 2; 
    }

    public double getJari(){
        return jari;
    }

    public void setJari(double jari){
        this.jari = jari;
    }

    public double getLuas(){
        return Math.PI * jari *jari;
    }

    public double getKeliling(){
        return 2 * Math.PI * jari;
    }

    @Override
    public void printInfo(){
        super.printInfo();
        System.out.println("Jari-jari: " + jari);
    }

    @Override 
    public void zoomIn(){
        jari = jari * 1.1;
    }

    @Override 
    public void zoomOut(){
        jari = jari * 0.9;
    }

    @Override 
    public void zoom(int percent){
        jari = jari * percent/100;
    }
}
