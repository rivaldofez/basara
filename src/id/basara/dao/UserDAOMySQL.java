/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package id.basara.dao;

import id.basara.model.User;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.List;
import id.basara.database.DatabaseMySQL;
import id.basara.view.Pengguna;

import java.util.logging.Level;
import java.util.logging.Logger;
/**
 *
 * @author Acer
 */
public class UserDAOMySQL implements UserDAO{

    @Override
    public boolean insert(User q, String Table) {
        String sql = "INSERT INTO "+Table+" values (?, ?, ?, ?, ?, ?, ?, ?, ?)";
        
        try {
            PreparedStatement statement = DatabaseMySQL.getConnection().prepareStatement(sql);
            
            statement.setString(1, q.getUsername() );
            statement.setString(2, q.getEmail());
            statement.setString(3, q.getPassword());
            statement.setString(4, q.getNama());
            statement.setString(5, q.getAlamat());
            statement.setString(6, q.getJenis_kelamin());
            statement.setString(7, q.getRekening());
            statement.setInt(8, q.getSaldo());
            statement.setString(9, q.getKode_branch());
            
            int row = statement.executeUpdate();
            if (row > 0) {
                return true;
            }
            statement.close();
        } catch (Exception ex) {
            Logger.getLogger(User.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }

    @Override
    public boolean update(User c, String Table) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean delete(User c, String Table) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public User loadByUsername(String username, String table, String Atribut) {
        String sql = "select * from "+table+" where "+Atribut+" = ?";    
        
        User u = new User();
        try {
            if (DatabaseMySQL.getConnection()==null){
                return null;
            }else{
                PreparedStatement statement = DatabaseMySQL.getConnection().prepareStatement(sql);

                statement.setString(1, username);
                ResultSet rs=statement.executeQuery();
                
                if(rs.next()){
                    
                    u.setUsername(rs.getString(Atribut));
                    u.setAlamat(rs.getString("alamat"));
                    u.setEmail(rs.getString("email"));
                    u.setJenis_kelamin(rs.getString("jenis_kelamin"));
                    u.setPassword(rs.getString("password"));
                    u.setKode_branch(rs.getString("kode_branch"));
                    u.setRekening(rs.getString("rekening"));
                    u.setSaldo(rs.getInt("saldo"));
                    u.setNama(rs.getString("nama"));
            
                }
            }
        } catch (Exception ex) {
            
        }
        return u;
    }

    

    

}
