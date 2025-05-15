/************************************/
/* Program   : DAOManager.java */
/* Deskripsi : Class DAOManager*/
/* NIM/Nama  : 24060123130114/Tsuraya Olivia*/
/* Tanggal   : 15 Mei 2025*/
/***********************************/

public class DAOManager {
    private PersonDAO personDAO;
    
    public void setPersonDAO(PersonDAO person){
        personDAO = person;
    }
    
    public PersonDAO getPersonDAO(){
        return personDAO;
    }
}
