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
public class CeyrekFinal {
    private int tur_id;
    private String takim_adi;
    private String ulkesi;
   

    public CeyrekFinal() {
    }

    public CeyrekFinal(int tur_id, String takim_adi, String ulkesi) {
        this.tur_id = tur_id;
        this.takim_adi = takim_adi;
        this.ulkesi = ulkesi;
    }

    public int getTur_id() {
        return tur_id;
    }

    public void setTur_id(int tur_id) {
        this.tur_id = tur_id;
    }

    public String getTakim_adi() {
        return takim_adi;
    }

    public void setTakim_adi(String takim_adi) {
        this.takim_adi = takim_adi;
    }

    public String getUlkesi() {
        return ulkesi;
    }

    public void setUlkesi(String ulkesi) {
        this.ulkesi = ulkesi;
    }
    
    @Override
    public String toString() {
        return "CeyrekFinal{" + "tur_id=" + tur_id + ", takim_adi=" + takim_adi + ", ulkesi=" + ulkesi +'}';
    }
}