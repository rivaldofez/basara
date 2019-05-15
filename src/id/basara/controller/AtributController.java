/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package id.basara.controller;

import id.basara.dao.AtributDAO;
import id.basara.dao.AtributDAOMySQL;
import id.basara.model.Atribut;
import java.util.List;


/**
 *
 * @author Rivaldo
 */
public class AtributController {
    private AtributDAO dao = new AtributDAOMySQL();
    
    public List<Atribut> getAllData(String Column, String Table) {
        return dao.getAllCategory(Column,Table);
    }
    
    public List<Atribut> getAllData(String Column, String Table, String Condition) {
        return dao.getAllCategory(Column,Table, Condition);
    }
 
    public String getByCondition(String Column, String Table, String Condition){
        return dao.getByCondition(Column, Table, Condition);
    }
}
