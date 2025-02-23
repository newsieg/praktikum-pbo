/************************************/
/* Program   : Titik.java */
/* Deskripsi : Class Titik */
/* NIM/Nama  : 24060123130114/Tsuraya Olivia*/
/* Tanggal   : 20 Februari 2025*/
/***********************************/

public class Titik {
    //ATRIBUT
    double absis;
    double ordinat;
    static int counterTitik = 0;

    //METODE
    Titik(double absis, double ordinat){
        this.absis = absis;
        this.ordinat = ordinat;
        counterTitik++;
    }

    Titik(){
        this(0,0);
    }

    static int getCounterTitik(){
        return counterTitik;
    }

    double getAbsis(){
        return absis;
    }
    
    double getOrdinat(){
        return ordinat;
    }

    void setAbsis(double x){
        absis = x;
    }

    void setOrdinat(double y){
        ordinat = y;
    }

    void geser(double x, double y){
        absis = absis + x;
        ordinat = ordinat + y;
    }

    void printTitik(){
        System.out.println("Titik("+ absis + "," + ordinat + ")");
    }

    void printCounterTitik(){
        System.out.println(this.counterTitik);
    }

    int getKuadran(){
        if (absis > 0 && ordinat > 0) return 1;
        else if (absis < 0 && ordinat > 0) return 2;
        else if (absis < 0 && ordinat < 0) return 3;
        else if (absis > 0 && ordinat < 0) return 4;
        else return 0; 
    }

    double getJarakPusat(){
        return Math.sqrt(absis * absis + ordinat * ordinat);
    }

    double getJarak(Titik T) {
        return Math.sqrt((absis - T.getAbsis()) * (absis - T.getAbsis()) + (ordinat - T.getOrdinat()) * (ordinat - T.getOrdinat()));
    }
    

    void refleksiX(){
        ordinat = -ordinat;
    }

    void refleksiY(){
        absis = -absis;
    }

    Titik getRefleksiX(){
        return new Titik(getAbsis(),getOrdinat()*-1);
    }

    Titik getRefleksiY(){
        return new Titik(getAbsis()*-1,getOrdinat());
    }

}
