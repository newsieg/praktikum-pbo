/************************************/
/* Program   : coercion.java */
/* Deskripsi : Class coercion (3.b)*/
/* NIM/Nama  : 24060123130114/Tsuraya Olivia*/
/* Tanggal   : 24 April 2025*/
/***********************************/

public class coercion {
    public static void main(String[] args){
        // 1. char ke int, output = 97
        int output1 = 'a'; 
        System.out.println("1. output1 = " + output1); 

        // 2. double ke int 
        double x = 15.5;
        // int output2 = x; error karena tipe tidak compatible
        int output2 = (int) x; // output = 15
        System.out.println("2. output2 = " + output2); 

        // 3. int ke double, output = 25.0
        int y = 25;
        double output3 = y; 
        System.out.println("3. output3 = " + output3); 

        // 4. int ke char, output = N
        int z = 78;
        char output4 = (char) z; 
        System.out.println("4. output4 = " + output4); 

        // 5. char ke double, output = 97.0
        char a = 'a';
        double output5 = a; 
        System.out.println("5. output5 = " + output5); 
    }
}
