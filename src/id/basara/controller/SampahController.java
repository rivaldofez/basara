/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package id.basara.controller;

import id.basara.dao.SampahDAO;
import id.basara.dao.SampahDAOMySQL;
import id.basara.model.Sampah;
import java.util.List;

/**
 *
 * @author Acer
 */
public class SampahController {
    private SampahDAO dao = new SampahDAOMySQL();
    
    public boolean insert(Sampah sampah, String Table){
        return dao.insert(sampah, Table);
    }
    public boolean update(Sampah sampah){
        return dao.update(sampah);
    }
    public boolean delete(Sampah sampah){
        return dao.delete(sampah);
    }
    public List<Sampah> getAll(){
        return dao.getAll();
    }
    
    public byte[] getgambar(String Column, String Table, String Condition){
        return dao.getgambar(Column, Table, Condition);
    }
}
