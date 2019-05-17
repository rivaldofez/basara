/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package id.basara.dao;

import id.basara.model.Sampah;
import java.util.List;

/**
 *
 * @author Acer
 */
public interface SampahDAO {
    public boolean insert(Sampah sampah, String Table);
    public boolean update(Sampah sampah);
    public boolean delete(Sampah sampah);
    public List<Sampah> getAll();
    public byte[] getgambar(String Column, String Table, String Condition);
}
