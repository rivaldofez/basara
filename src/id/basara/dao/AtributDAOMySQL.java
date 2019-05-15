/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package id.basara.dao;

import id.basara.database.DatabaseMySQL;
import id.basara.model.Atribut;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;



/**
 *
 * @author Rivaldo
 */
public class AtributDAOMySQL implements AtributDAO{

    @Override
    public boolean insert(Atribut c, String Table) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean update(Atribut c, String Table) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean delete(Atribut c, String Table) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Atribut> getAllCategory(String Column, String Table) {
        List<Atribut> categories = new ArrayList<Atribut>();
        String sql = "Select "+Column+" from "+Table;
        try {
            if (DatabaseMySQL.getConnection()==null){
                return null;
            }else{
                PreparedStatement statement = DatabaseMySQL.getConnection().prepareStatement(sql);

                ResultSet rs = statement.executeQuery();
                while (rs.next()){
                    Atribut c = new Atribut(
                            rs.getString(1)
                    );
                    categories.add(c);
                }
                statement.close();
            }
        } catch (Exception ex) {
            
        }
        return categories;
    }
    
    public List<Atribut> getAllCategory(String Column, String Table, String Condition) {
        List<Atribut> categories = new ArrayList<Atribut>();
        String sql = "Select "+Column+" from "+Table+" where "+Condition;
        try {
            if (DatabaseMySQL.getConnection()==null){
                return null;
            }else{
                PreparedStatement statement = DatabaseMySQL.getConnection().prepareStatement(sql);

                ResultSet rs = statement.executeQuery();
                while (rs.next()){
                    Atribut c = new Atribut(
                            rs.getString(1)
                    );
                    categories.add(c);
                }
                statement.close();
            }
        } catch (Exception ex) {
            
        }
        return categories;
    }

    @Override
    public String getByCondition(String Column, String Table, String Condition) {
        String sql = "Select "+Column+" from "+Table+" where "+Condition;
        String back = null;
        try {
            if (DatabaseMySQL.getConnection()==null){
                return null;
            }else{
                PreparedStatement statement = DatabaseMySQL.getConnection().prepareStatement(sql);

                ResultSet rs = statement.executeQuery();
                if(rs.next())
                    back=rs.getString(Column);
                statement.close();
            }
        } catch (Exception ex) {
            
        }
        return back;
    }



    
}
