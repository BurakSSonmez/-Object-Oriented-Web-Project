/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package contoller;

import dao.OyuncularDAO;
import entity.Oyuncular;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

/**
 *
 * @author the_m
 */
@ManagedBean
@RequestScoped
public class OyuncularController implements Serializable {
    private List<Oyuncular> olist;
    private OyuncularDAO odao;
    
    private Oyuncular oyuncular;
    
    public List<Oyuncular> getOlist() {
        this.olist=this.getOdao().findAll();
        return olist;
    }
    public void setOlist(List<Oyuncular> olist) {
        this.olist = olist;
    }

    public OyuncularDAO getOdao() {
        if(this.odao==null)
            this.odao=new OyuncularDAO();
        return odao;
    }

    public void setOdao(OyuncularDAO odao) {
        this.odao = odao;
    }

    public Oyuncular getOyuncular() {
        if(this.oyuncular==null)
            this.oyuncular=new Oyuncular();
        return oyuncular;
    }

    public void setOyuncular(Oyuncular oyuncular) {
        this.oyuncular = oyuncular;
    }
    
}