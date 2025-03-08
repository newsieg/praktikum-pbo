/************************************/
/* Program   : AngkaSial.java */
/* Deskripsi : Program penggunaan exception buatan sendiri, pengenalan klausa throw dan throws*/
/* NIM/Nama  : 24060123130114/Tsuraya Olivia*/
/* Tanggal   : 6 Maret 2025*/
/***********************************/

public class AngkaSial {
    public void cobaAngka(int angka) throws AngkaSialException{
        if (angka == 13){
            throw new AngkaSialException();
        }
        System.out.println(angka + " bukan angka sial");
    }

    public static void main(String[] args){
        AngkaSial as = new AngkaSial();
        try{
            as.cobaAngka(10);
            as.cobaAngka(13);
            as.cobaAngka(12);
        }
        catch(AngkaSialException ase){
            System.out.println(ase.getMessage());
            System.out.println("Hati-hati memasukkan angka");
        }
    }
}

/* Ketika eksepsi terjadi, apakah baris 12 pada AngkaSial.java di atas dieksekusi?
   Jawab: Tidak, karena eksepsi dilempar sebelum pernyataan tersebut.

   Apakah baris 21 pada AngkaSial.java di atas dieksekusi?
   Jawab: Ya, karena AngkaSialException dilempar ketika cobaAngka(13) dipanggil.
*/