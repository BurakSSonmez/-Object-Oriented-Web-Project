/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entity;

/**
 *
 * @author the_m
 */
public class Transfer {
    private int oyuncu_id;
    private String adi_soyadi;
    private String mevki;
    private String takimi;

    public Transfer() {
    }

    public Transfer(int oyuncu_id, String adi_soyadi, String mevki, String takimi) {
        this.oyuncu_id = oyuncu_id;
        this.adi_soyadi = adi_soyadi;
        this.mevki = mevki;
        this.takimi = takimi;
    }

    public int getOyuncu_id() {
        return oyuncu_id;
    }

    public void setOyuncu_id(int oyuncu_id) {
        this.oyuncu_id = oyuncu_id;
    }

    public String getAdi_soyadi() {
        return adi_soyadi;
    }

    public void setAdi_soyadi(String adi_soyadi) {
        this.adi_soyadi = adi_soyadi;
    }

    public String getMevki() {
        return mevki;
    }

    public void setMevki(String mevki) {
        this.mevki = mevki;
    }

    public String getTakimi() {
        return takimi;
    }

    public void setTakimi(String takimi) {
        this.takimi = takimi;
    }
    
    @Override
    public String toString() {
        return "Transfer{" + "oyuncu_id=" + oyuncu_id + ", adi_soyadi=" + adi_soyadi + ", mevki=" + mevki + ", takimi=" + takimi + '}';
    }
}