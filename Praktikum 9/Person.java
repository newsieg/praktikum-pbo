/************************************/
/* Program   : Person.java */
/* Deskripsi : Class Person*/
/* NIM/Nama  : 24060123130114/Tsuraya Olivia*/
/* Tanggal   : 15 Mei 2025*/
/***********************************/

public class Person {
    private int id;
    private String name;
    
    public Person(String n){
        name = n;
    }
    
    public Person(int i, String n){
        id = i;
        name = n;
    }
    
    public int getId(){
        return id;
    }
    
    public String getName(){
        return name;
    }
}
