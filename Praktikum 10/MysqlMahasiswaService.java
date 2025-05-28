/************************************/
/* Program   : MysqlMahasiswaService.java */ 
/* Deskripsi : Class MysqlMahasiswaService*/ 
/* NIM/Nama  : 24060123130114/Tsuraya Olivia*/
/* Tanggal   : 22 Mei 2025*/ 
/***********************************/

package jdbc.service;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import jdbc.utilities.MysqlUtility;
import jdbc.model.Mahasiswa;

public class MysqlMahasiswaService {
    Connection koneksi = null;
    
    public MysqlMahasiswaService(){
        koneksi = MysqlUtility.getConnection();
    }
    
    public Mahasiswa makeMhsObject(ResultSet rs) throws SQLException {
        Mahasiswa mhs = new Mahasiswa();
        mhs.setId(rs.getInt("id"));
        mhs.setNama(rs.getString("name"));
        return mhs;
    }

    public void add(Mahasiswa mhs) {
        try {
            String sql = "INSERT INTO mahasiswa (name) VALUES (?)";
            PreparedStatement ps = koneksi.prepareStatement(sql);
            ps.setString(1, mhs.getNama());
            ps.executeUpdate();
        } 
        catch (SQLException e) {
            System.out.println("Error tambah data: " + e.getMessage());
        }
    }


    public void update(Mahasiswa mhs) {
        try {
            String sql = "UPDATE mahasiswa SET name=? WHERE id=?";
            PreparedStatement ps = koneksi.prepareStatement(sql);
            ps.setString(1, mhs.getNama());
            ps.setInt(2, mhs.getId());
            ps.executeUpdate();
        } 
        catch (SQLException e) {
            System.out.println("Error update data: " + e.getMessage());
        }
    }

    public void delete(int id) {
        try {
            String sql = "DELETE FROM mahasiswa WHERE id=?";
            PreparedStatement ps = koneksi.prepareStatement(sql);
            ps.setInt(1, id);
            ps.executeUpdate();
        } 
        catch (SQLException e) {
            System.out.println("Error delete data: " + e.getMessage());
        }
    }

    public Mahasiswa getById(int id) {
        Mahasiswa mhs = null;
        try {
            String sql = "SELECT * FROM mahasiswa WHERE id=?";
            PreparedStatement ps = koneksi.prepareStatement(sql);
            ps.setInt(1, id);
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                mhs = makeMhsObject(rs);
            }
        } 
        catch (SQLException e) {
            System.out.println("Error getById: " + e.getMessage());
        }
        return mhs;
    }

    public List<Mahasiswa> getAll() {
        List<Mahasiswa> list = new ArrayList<>();
        try {
            String sql = "SELECT * FROM mahasiswa";
            Statement stmt = koneksi.createStatement();
            ResultSet rs = stmt.executeQuery(sql);
            while (rs.next()) {
                Mahasiswa mhs = makeMhsObject(rs);
                list.add(mhs);
            }
        } 
        catch (SQLException e) {
            System.out.println("Error getAll: " + e.getMessage());
        }
        return list;
    }
    
    public void indexReset() {
        try {
            String sql = "ALTER TABLE mahasiswa AUTO_INCREMENT = 1";
            Statement stmt = koneksi.createStatement();
            stmt.executeUpdate(sql);
        } 
        catch (SQLException e) {
            System.out.println("Error reset index: " + e.getMessage());
        }
    }

    public boolean isEmpty() {
        try {
            String sql = "SELECT COUNT(*) AS total FROM mahasiswa";
            Statement stmt = koneksi.createStatement();
            ResultSet rs = stmt.executeQuery(sql);
            if (rs.next()) {
                return rs.getInt("total") == 0;
            }
        } 
        catch (SQLException e) {
            System.out.println("Error check isEmpty: " + e.getMessage());
        }
        return true; // diasumsikan kosong jika error
    }

    public void closeConnection() {
        try {
            if (koneksi != null && !koneksi.isClosed()) {
                koneksi.close();
                System.out.println("Koneksi ditutup.");
            }
        } 
        catch (SQLException e) {
            System.out.println("Error saat menutup koneksi: " + e.getMessage());
        }
    }
}