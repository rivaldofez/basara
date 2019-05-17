/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package id.basara.dao;

import id.basara.model.User;
import java.util.List;



/**
 *
 * @author Acer
 */
public interface UserDAO {

    public boolean insert(User c, String Table);
    
    public boolean update(User c, String Table);
    
    public boolean delete(User c, String Table);
    
    public User loadByUsername(String username, String table, String Atribut);
    
   
    
}
