/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package id.basara.controller;

import id.basara.dao.PegawaiDAO;
import id.basara.dao.PegawaiDAOMySQL;
import id.basara.dao.UserDAOMySQL;
import java.util.List;
import id.basara.dao.UserDAO;
import id.basara.model.MPegawai;

/**
 *
 * @author Acer
 */
public class PegawaiController {
    private PegawaiDAO dao = new PegawaiDAOMySQL();
    
    public boolean insert(MPegawai c, String Table){
        return dao.insert(c, Table);
    }
    
    public boolean update(MPegawai c, String Table){
        return dao.update(c, Table);
    }
    
    public boolean delete(MPegawai c, String Table){
        return dao.delete(c, Table);
    }
    
    public MPegawai loadByUsername(String username, String Table, String Atribut){
        return dao.loadByUsername(username, Table, Atribut);
    }
    
}