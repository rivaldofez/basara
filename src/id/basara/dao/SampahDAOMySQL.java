/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package id.basara.dao;

import id.basara.database.DatabaseMySQL;
import id.basara.model.Sampah;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Acer
 */
public class SampahDAOMySQL implements SampahDAO {
    
    
    public boolean insert(Sampah p, String Table) {
        String sql = "INSERT INTO "+Table+" values (?, ?, ?, ?, ?, ?, ?)";
        try {
            PreparedStatement statement = DatabaseMySQL.getConnection().prepareStatement(sql);
            
            statement.setString(1, p.getKode_sampah());
            statement.setString(2, p.getNama());
            statement.setString(3, p.getKategori());
            statement.setString(4, p.getHarga_beli());
            statement.setString(5, p.getHarga_jual());
            statement.setString(6, p.getJumlah_stok());
            statement.setBytes(7, p.getSampah_gambar());
            
            int row = statement.executeUpdate();
            if (row > 0) {
                return true;
            }
            statement.close();
        } catch (Exception ex) {
            Logger.getLogger(Sampah.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }

    @Override
    public boolean update(Sampah sampah) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean delete(Sampah sampah) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Sampah> getAll() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public byte[] getgambar(String Column, String Table, String Condition) {
        String sql = "Select "+Column+" from "+Table+" where "+Condition;
        byte[] back = null;
        try {
            if (DatabaseMySQL.getConnection()==null){
                return null;
            }else{
                PreparedStatement statement = DatabaseMySQL.getConnection().prepareStatement(sql);

                ResultSet rs = statement.executeQuery();
                if(rs.next())
                    back=rs.getBytes(Column);
                statement.close();
            }
        } catch (Exception ex) {
            
        }
        return back;
    }

 
}
