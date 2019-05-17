/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package id.basara.controller;

import id.basara.dao.UserDAOMySQL;
import id.basara.model.User;
import java.util.List;
import id.basara.dao.UserDAO;

/**
 *
 * @author Acer
 */
public class UserController {
    private UserDAO dao = new UserDAOMySQL();
    
    public boolean insert(User c, String Table){
        return dao.insert(c, Table);
    }
    
    public boolean update(User c, String Table){
        return dao.update(c, Table);
    }
    
    public boolean delete(User c, String Table){
        return dao.delete(c, Table);
    }
    
    public User loadByUsername(String username, String Table, String Atribut){
        return dao.loadByUsername(username, Table, Atribut);
    }
    
}