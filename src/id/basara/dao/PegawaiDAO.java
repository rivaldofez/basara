/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package id.basara.dao;

import id.basara.model.MPegawai;
import java.util.List;



/**
 *
 * @author Acer
 */
public interface PegawaiDAO {

    public boolean insert(MPegawai c, String Table);
    
    public boolean update(MPegawai c, String Table);
    
    public boolean delete(MPegawai c, String Table);
    
    public MPegawai loadByUsername(String username, String table, String Atribut);
    
   
    
}
