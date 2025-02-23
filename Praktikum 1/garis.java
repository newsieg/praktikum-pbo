/************************************/
/* Program   : garis.java */
/* Deskripsi : Class Garis */
/* NIM/Nama  : 24060123130114/Tsuraya Olivia*/
/* Tanggal   : 23 Februari 2025*/
/***********************************/


class Titik{
    double absis;
    double ordinat;
    static int counterTitik = 0;

    Titik(double absis, double ordinat){
        this.absis = absis;
        this.ordinat = ordinat;
        counterTitik++;
    }

    Titik(){
        this(0, 0);
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

    void printTitik(){
        System.out.println("(" + absis + ", " + ordinat + ")");
    }
}

class Garis{
    Titik titikAwal, titikAkhir;
    static int counterGaris = 0;

    Garis(){
        this.titikAwal = new Titik(0, 0);
        this.titikAkhir = new Titik(1, 1);
        counterGaris++;
    }

    Garis(Titik awal, Titik akhir){
        this.titikAwal = awal;
        this.titikAkhir = akhir;
        counterGaris++;
    }

    Titik getTitikAwal(){
        return titikAwal;
    }

    Titik getTitikAkhir(){
        return titikAkhir;
    }

    void setTitikAwal(Titik awal){
        this.titikAwal = awal;
    }

    void setTitikAkhir(Titik akhir){
        this.titikAkhir = akhir;
    }

    static int getCounterGaris(){
        return counterGaris;
    }

    double getPanjang(){
        return Math.sqrt((titikAkhir.absis - titikAwal.absis) * (titikAkhir.absis - titikAwal.absis) + (titikAkhir.ordinat - titikAwal.ordinat) * (titikAkhir.ordinat - titikAwal.ordinat));
    }
    

    double getGradien(){
        if (titikAkhir.absis == titikAwal.absis) {
            return 0; 
        }
        return (titikAkhir.ordinat - titikAwal.ordinat) / 
               (titikAkhir.absis - titikAwal.absis);
    }
    

    Titik getTitikTengah(){
        return new Titik((titikAwal.absis + titikAkhir.absis) / 2, (titikAwal.ordinat + titikAkhir.ordinat) / 2);
    }

    boolean isSejajar(Garis g){
        return this.getGradien() == g.getGradien();
    }

    boolean isTegakLurus(Garis g){
        return this.getGradien() * g.getGradien() == -1;
    }

    void printGaris(){
        System.out.print("Titik awal: "); titikAwal.printTitik();
        System.out.print("Titik akhir: "); titikAkhir.printTitik();
    }

    String getPersamaan(){
        double m = getGradien();
        double c = titikAwal.ordinat - (m * titikAwal.absis);
        return "y = " + m + "x + " + c;
    }
}
