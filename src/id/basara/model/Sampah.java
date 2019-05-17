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
public class Sampah {
    private String kode_sampah;
    private String nama;
    private String kategori;
    private String harga_jual;
    private String harga_beli;
    private String jumlah_stok;
    private byte[] sampah_gambar;

    public String getKode_sampah() {
        return kode_sampah;
    }

    public void setKode_sampah(String kode_sampah) {
        this.kode_sampah = kode_sampah;
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

    public byte[] getSampah_gambar() {
        return sampah_gambar;
    }

    public void setSampah_gambar(byte[] sampah_gambar) {
        this.sampah_gambar = sampah_gambar;
    }

    
    
    
    
}
