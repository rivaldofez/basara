/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package id.basara.dao;

import id.basara.model.Produk;
import id.basara.model.Sampah;
import java.util.List;

/**
 *
 * @author Acer
 */
public interface ProdukDAO {
    public boolean insert(Produk produk, String Table);
    public boolean update(Produk produk);
    public boolean delete(Produk produk);
    public List<Produk> getAll();
    public byte[] getgambar(String Column, String Table, String Condition);
}
