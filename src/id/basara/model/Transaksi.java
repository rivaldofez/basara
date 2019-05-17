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
public class Transaksi {
    private String id;
    private String tgl;
    private String waktu;
    private String status;
    private String kode_items;
    private String no_pengguna;
    private String no_pegawai;
    private String kode_branch;
    private int jumlah;
    private double total;

    public Transaksi(String id, String tgl, String waktu, int jumlah, String status, String kode_items, String no_pengguna, String no_pegawai, String kode_branch, double total) {
        this.id = id;
        this.tgl = tgl;
        this.waktu = waktu;
        this.status = status;
        this.kode_items = kode_items;
        this.no_pengguna = no_pengguna;
        this.no_pegawai = no_pegawai;
        this.kode_branch = kode_branch;
        this.jumlah = jumlah;
        this.total=total;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }

    
    public String getId() {
        return id;
    }

    public String getTgl() {
        return tgl;
    }

    public String getWaktu() {
        return waktu;
    }

    public String getStatus() {
        return status;
    }

    public String getKode_items() {
        return kode_items;
    }

    public String getNo_pengguna() {
        return no_pengguna;
    }

    public String getNo_pegawai() {
        return no_pegawai;
    }

    public String getKode_branch() {
        return kode_branch;
    }

    public int getJumlah() {
        return jumlah;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setTgl(String tgl) {
        this.tgl = tgl;
    }

    public void setWaktu(String waktu) {
        this.waktu = waktu;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public void setKode_items(String kode_items) {
        this.kode_items = kode_items;
    }

    public void setNo_pengguna(String no_pengguna) {
        this.no_pengguna = no_pengguna;
    }

    public void setNo_pegawai(String no_pegawai) {
        this.no_pegawai = no_pegawai;
    }

    public void setKode_branch(String kode_branch) {
        this.kode_branch = kode_branch;
    }

    public void setJumlah(int jumlah) {
        this.jumlah = jumlah;
    }
    
    
    
}


