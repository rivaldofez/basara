/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package id.basara.controller;

import id.basara.dao.ProdukDAO;
import id.basara.dao.ProdukDAOMySQL;
import id.basara.model.Produk;
import java.util.List;

/**
 *
 * @author Acer
 */
public class ProductController {
    private ProdukDAO dao = new ProdukDAOMySQL();
    
    public boolean insert(Produk produk, String Table){
        return dao.insert(produk, Table);
    }
    public boolean update(Produk produk){
        return dao.update(produk);
    }
    public boolean delete(Produk produk){
        return dao.delete(produk);
    }
    public List<Produk> getAll(){
        return dao.getAll();
    }
    
    public byte[] getgambar(String Column, String Table, String Condition){
        return dao.getgambar(Column, Table, Condition);
    }
}
