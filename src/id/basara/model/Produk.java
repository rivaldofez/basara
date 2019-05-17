/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package id.basara.model;

/**
 *
 * @author Acer
 */
public class Produk {
    private String kode_produk;
    private String nama;
    private String kategori;
    private String harga_jual;
    private String harga_beli;
    private String jumlah_stok;
    private String kode_pengrajin;
    private byte[] produk_gambar;
    private String username_pengrajin;

    public String getKode_produk() {
        return kode_produk;
    }

    public void setKode_produk(String kode_produk) {
        this.kode_produk = kode_produk;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getKategori() {
        return kategori;
    }

    public void setKategori(String kategori) {
        this.kategori = kategori;
    }

    public String getHarga_jual() {
        return harga_jual;
    }

    public void setHarga_jual(String harga_jual) {
        this.harga_jual = harga_jual;
    }

    public String getHarga_beli() {
        return harga_beli;
    }

    public void setHarga_beli(String harga_beli) {
        this.harga_beli = harga_beli;
    }

    public String getJumlah_stok() {
        return jumlah_stok;
    }

    public void setJumlah_stok(String jumlah_stok) {
        this.jumlah_stok = jumlah_stok;
    }

    public String getKode_pengrajin() {
        return kode_pengrajin;
    }

    public void setKode_pengrajin(String kode_pengrajin) {
        this.kode_pengrajin = kode_pengrajin;
    }

    public byte[] getProduk_gambar() {
        return produk_gambar;
    }

    public void setProduk_gambar(byte[] produk_gambar) {
        this.produk_gambar = produk_gambar;
    }

    public String getUsername_pengrajin() {
        return username_pengrajin;
    }

    public void setUsername_pengrajin(String username_pengrajin) {
        this.username_pengrajin = username_pengrajin;
    }

    
    
    
    
    
    
}
