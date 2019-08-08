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
public class Sampiyon {
    private int sampiyon_id;
    private String takim_adi;
    private String ulkesi;
   

    public Sampiyon() {
    }

    public Sampiyon(int sampiyon_id, String takim_adi, String ulkesi) {
        this.sampiyon_id = sampiyon_id;
        this.takim_adi = takim_adi;
        this.ulkesi = ulkesi;
    }

    public int getSampiyon_id() {
        return sampiyon_id;
    }

    public void setSampiyon_id(int sampiyon_id) {
        this.sampiyon_id = sampiyon_id;
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
        return "Sampiyon{" + "sampiyon_id=" + sampiyon_id + ", takim_adi=" + takim_adi + ", ulkesi=" + ulkesi +'}';
    }
    
}
