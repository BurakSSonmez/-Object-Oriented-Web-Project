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
public class Grouplar {
    private int secilme_sirasi;
    private String group_adi;
    private String takim_adi;
    private int takim_sirasi;

    public Grouplar() {
    }

    public Grouplar(int secilme_sirasi, String group_adi, String takim_adi, int takim_sirasi) {
        this.secilme_sirasi = secilme_sirasi;
        this.group_adi = group_adi;
        this.takim_adi = takim_adi;
        this.takim_sirasi = takim_sirasi;
    }
    
    

    public int getSecilme_sirasi() {
        return secilme_sirasi;
    }

    public void setSecilme_sirasi(int secilme_sirasi) {
        this.secilme_sirasi = secilme_sirasi;
    }

    public String getGroup_adi() {
        return group_adi;
    }

    public void setGroup_adi(String group_adi) {
        this.group_adi = group_adi;
    }

    public String getTakim_adi() {
        return takim_adi;
    }

    public void setTakim_adi(String takim_adi) {
        this.takim_adi = takim_adi;
    }

    public int getTakim_sirasi() {
        return takim_sirasi;
    }

    public void setTakim_sirasi(int takim_sirasi) {
        this.takim_sirasi = takim_sirasi;
    }

    @Override
    public String toString() {
        return "Grouplar{" + "secilme_sirasi=" + secilme_sirasi + ", group_adi=" + group_adi + ", takim_adi=" + takim_adi + ", takim_sirasi=" + takim_sirasi + '}';
    }
         
}
