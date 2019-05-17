/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package id.basara.dao;

import java.util.List;
import id.basara.model.Transaksi;

/**
 *
 * @author Rivaldo
 */
public interface TransaksiDAO {
    
    public boolean insert(Transaksi p, String Table);
    
    public boolean update(Transaksi p, String Table);
    
    public boolean delete(Transaksi p, String Table);
    
    public List<Transaksi> getAllTransaksi(String Column, String Table, String Condition);
    
    public Transaksi getByKode(String kode);
    
    public List<Transaksi> getByName(String name);
    
}