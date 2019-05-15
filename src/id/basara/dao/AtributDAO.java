/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package id.basara.dao;

import java.util.List;
import id.basara.model.Atribut;

/**
 *
 * @author Rivaldo
 */
public interface AtributDAO {
    
    public boolean insert(Atribut c, String Table);
    
    public boolean update(Atribut c, String Table);
    
    public boolean delete(Atribut c, String Table);
    
    public List<Atribut> getAllCategory(String Column, String Table);
    public List<Atribut> getAllCategory(String Column, String Table, String Condition);
 
    public String getByCondition(String Column, String Table, String Condition);
}
