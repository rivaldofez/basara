/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package id.basara.model;

/**
 *
 * @author Rivaldo
 */
public class Items {
    private String kode;
    private String nama;
    private int stok;
    private Atribut category;
    float harga1;
    float harga2;

    public Items(String kode, String nama, float harga1, float harga2 , int stok, Atribut category) {
        this.kode = kode;
        this.nama = nama;
        this.stok = stok;
        this.category = category;
        this.harga1 = harga1;
        this.harga2 = harga2;
    }

    public String getKode() {
        return kode;
    }

    public String getNama() {
        return nama;
    }

    public int getStok() {
        return stok;
    }

    public Atribut getCategory() {
        return category;
    }

    public float getHarga1() {
        return harga1;
    }

    public float getHarga2() {
        return harga2;
    }

    public void setKode(String kode) {
        this.kode = kode;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public void setStok(int stok) {
        this.stok = stok;
    }

    public void setCategory(Atribut category) {
        this.category = category;
    }

    public void setHarga1(float harga1) {
        this.harga1 = harga1;
    }

    public void setHarga2(float harga2) {
        this.harga2 = harga2;
    }

    
    
 
    
    
    
}
