/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package contoller;


import dao.FinallDAO;
import entity.Finall;
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
public class FinallController implements Serializable {
    private List<Finall> flist;
    private FinallDAO fdao;
    
    private Finall finall;
    
    public List<Finall> getFlist() {
        this.flist=this.getFdao().findAll();
        return flist;
    }

    public void setFlist(List<Finall> flist) {
        this.flist = flist;
    }

    public FinallDAO getFdao() {
        if(this.fdao==null)
            this.fdao=new FinallDAO();
        return fdao;
    }

    public void setFdao(FinallDAO fdao) {
        this.fdao = fdao;
    }

    public Finall getFinall() {
        if(this.finall==null)
            this.finall=new Finall();
        return finall;
       
    }

    public void setFinal(Finall finall) {
        this.finall = finall;
    }
   
}
