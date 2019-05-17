/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package id.basara.dao;

import java.sql.PreparedStatement;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

import id.basara.model.Transaksi;
import id.basara.database.DatabaseMySQL;
import java.sql.ResultSet;
import java.util.ArrayList;

/**
 *
 * @author Rivaldo
 */
public class TransaksiDAOMySQL implements TransaksiDAO {

    @Override
    public boolean insert(Transaksi p, String Table) {
        String sql = "INSERT INTO "+Table+" values (?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
        try {
            PreparedStatement statement = DatabaseMySQL.getConnection().prepareStatement(sql);
            
            statement.setString(1, p.getId());
            statement.setString(2, p.getTgl());
            statement.setString(3, p.getWaktu());
            statement.setInt(4, p.getJumlah());
            statement.setString(5, p.getStatus());
            statement.setString(6, p.getKode_items());
            statement.setString(7, p.getNo_pengguna());
            statement.setString(8, p.getNo_pegawai());
            statement.setString(9, p.getKode_branch());
            statement.setDouble(10, p.getTotal());
            
            int row = statement.executeUpdate();
            if (row > 0) {
                return true;
            }
            statement.close();
        } catch (Exception ex) {
            Logger.getLogger(Transaksi.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }

    @Override
    public boolean update(Transaksi p, String Table) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public boolean updateonevalue(Transaksi p, String Table, String Column, String Value, String Condition){
        String sql = "UPDATE " +Table+ " SET " +Column+" = '" +Value+ "' where ";
        try {
            PreparedStatement statement = DatabaseMySQL.getConnection().prepareStatement(sql);
            
            int row = statement.executeUpdate();
            if (row > 0) {
                return true;
            }
            statement.close();
        } catch (Exception ex) {
            Logger.getLogger(Transaksi.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }
    
    @Override
    public boolean delete(Transaksi p, String Table) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Transaksi getByKode(String kode) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Transaksi> getByName(String name) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Transaksi> getAllTransaksi(String Column, String Table, String Condition) {
       List<Transaksi> transaksi = new ArrayList<Transaksi>();
        String sql = "Select "+Column+" from "+Table+" where "+Condition;
        try {
            if (DatabaseMySQL.getConnection()==null){
                return null;
            }else{
                PreparedStatement statement = DatabaseMySQL.getConnection().prepareStatement(sql);

                ResultSet rs = statement.executeQuery();
                while (rs.next()){
                    Transaksi p = new Transaksi(
                            rs.getString(1),
                            rs.getString(2),
                            rs.getString(3),
                            rs.getInt(4),
                            rs.getString(5),
                            rs.getString(6),
                            rs.getString(7),
                            rs.getString(8),
                            rs.getString(9),
                            rs.getDouble(10)
                    );
                    transaksi.add(p);
                }
                statement.close();
            }
        } catch (Exception ex) {
            Logger.getLogger(Transaksi.class.getName()).log(Level.SEVERE, null, ex);
        }
        return transaksi;
    }


}
