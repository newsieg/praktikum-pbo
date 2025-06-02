/************************************/
/* Program   : DiskonLambda.java */ 
/* Deskripsi : Class DiskonLambda*/ 
/* NIM/Nama  : 24060123130114/Tsuraya Olivia*/
/* Tanggal   : 2 Juni 2025*/ 
/***********************************/

interface IDiskon {
    public double hitungDiskon(int harga);
}

public class DiskonLambda {
    public static void main(String[] args) {
        IDiskon diskonMerdeka = new IDiskon() {
            public double hitungDiskon(int harga) {
                return harga - (harga * 0.3);
            }
        };
        
        IDiskon diskonLebaran = (harga) -> harga - (harga * 0.4);
        
        IDiskon diskonBiasa = (harga) -> {
                return harga - (harga * 0.1);
        };
        System.out.println("Diskon Merdeka: " + diskonMerdeka.hitungDiskon(45000));
        System.out.println("Diskon Merdeka: " + diskonLebaran.hitungDiskon(45000));
        System.out.println("Diskon Merdeka: " + diskonBiasa.hitungDiskon(45000));
    }
}
