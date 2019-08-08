/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package contoller;


import dao.TakimlarDAO;
import entity.Takimlar;
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
public class TakimlarController implements Serializable {
    private List<Takimlar> tlist;
    private TakimlarDAO tdao;
    
    private Takimlar takimlar;
    
     public List<Takimlar> getTlist() {
        this.tlist=this.getTdao().findAll();
        return tlist;
     
    }
     
    public void setTlist(List<Takimlar> tlist) {
        this.tlist = tlist;
    }

    public TakimlarDAO getTdao() {
        if(this.tdao==null)
            this.tdao=new TakimlarDAO();
        return tdao;
    }

    public void setTdao(TakimlarDAO tdao) {
        this.tdao = tdao;
    }

    public Takimlar getTakimlar() {
       if(this.takimlar==null)
            this.takimlar=new Takimlar();
        return takimlar;
    }

    public void setTakimlar(Takimlar takimlar) {
        this.takimlar = takimlar;
    }
}

    
     
