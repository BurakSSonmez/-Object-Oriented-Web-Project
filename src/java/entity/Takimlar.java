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
public class Takimlar {
    private String takim_adi;
    private String ulkesi;
    private int sirasi;
    
    public Takimlar() {
    }

    public Takimlar(String takim_adi, String ulkesi, int sirasi) {            
        this.takim_adi = takim_adi;
        this.ulkesi = ulkesi;
        this.sirasi=sirasi;
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

    public int getSirasi() {
        return sirasi;
    }

    public void setSirasi(int sirasi) {
        this.sirasi = sirasi;
    }
    
    @Override
    public String toString() {
        return "Takimlar{" + "takim_adi=" + takim_adi + ", ulkesi=" + ulkesi + ",sirasi=" + sirasi + '}';
    }
    
}
