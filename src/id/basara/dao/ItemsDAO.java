/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package id.basara.dao;

import java.util.List;
import id.basara.model.Items;

/**
 *
 * @author Rivaldo
 */
public interface ItemsDAO {
    
    public boolean insert(Items p);
    
    public boolean update(Items p);
    
    public boolean delete(Items p);
    
    public List<Items> getAllItems();
    
    public Items getByKode(String kode);
    
    public List<Items> getByName(String name);
    
}
