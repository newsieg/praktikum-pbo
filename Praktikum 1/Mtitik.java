/************************************/
/* Program   : Mtitik.java */
/* Deskripsi : Main class Titik */
/* NIM/Nama  : 24060123130114/Tsuraya Olivia*/
/* Tanggal   : 20 Februari 2025*/
/***********************************/


public class Mtitik {
    public static void main(String[] args){
        Titik T1 = new Titik();
        T1.setAbsis(3);
        T1.setOrdinat(4);
        T1.printTitik();
        T1.geser(3,4);
        T1.printTitik();

        Titik T2 = T1;
        T2.printTitik();
        T1.setAbsis(10);
        T1.setOrdinat(10);
        T2.printTitik();

        Titik T3 = new Titik();
        Titik T4 = new Titik(3,5);

        System.out.println("Jumlah objek titik = " + Titik.getCounterTitik());
        System.out.println("Jumlah objek titik = " + T2.getCounterTitik());

        T3.printCounterTitik();

        System.out.println("Titik T2 berada di kuadran = " + T2.getKuadran());

        System.out.println("Jarak titik T2 dari pusat = " + T2.getJarakPusat());
        System.out.println("Jarak titik T1 dan T4 = " + T4.getJarak(T1));

        Titik T5 = T1.getRefleksiX();
        T5.printTitik();
        Titik T6 = T1.getRefleksiY();
        T6.printTitik();
        
    }
    
}
