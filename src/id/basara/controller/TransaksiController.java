/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package id.basara.controller;

import java.util.List;
import java.util.Observable;
import id.basara.model.Transaksi;
import id.basara.dao.TransaksiDAO;
import id.basara.dao.TransaksiDAOMySql;
import id.basara.model.CrudState;

/**
 *
 * @author Rivaldo
 */
public class TransaksiController extends Observable{
    private TransaksiDAO dao = new TransaksiDAOMySql();
    private CrudState crudState;
    
    public void setDAO(TransaksiDAO d){
        dao = d;
    }
    
    public void manipulate(Transaksi p, CrudState c, String Table){
        boolean result = false;
        this.crudState = c;
        
        switch (c){
            case INSERT:
                result = dao.insert(p, Table);
                break;
            case UPDATE:
                result = dao.update(p, Table);
                break;
            case DELETE:
                result = dao.delete(p, Table);
                break;
        }
        
        setChanged();
        if (result){
            notifyObservers(p);
        }else{
            notifyObservers();
        }
    }
    
    public CrudState getCrudState(){
        return crudState;
    }
    
    public List<Transaksi> getAllProduct() {
        return dao.getAllTransaksi();
    }
}