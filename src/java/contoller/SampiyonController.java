/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package contoller;



import dao.SampiyonDAO;
import entity.Sampiyon;
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
public class SampiyonController implements Serializable {
    private List<Sampiyon> slist;
    private SampiyonDAO sdao;
    
    private Sampiyon sampiyon;
    
    public List<Sampiyon> getSlist() {
        this.slist=this.getSdao().findAll();
        return slist;
    }

    public void setSlist(List<Sampiyon> slist) {
        this.slist = slist;
    }

    public SampiyonDAO getSdao() {
        if(this.sdao==null)
            this.sdao=new SampiyonDAO();
        return sdao;
    }

    public void setSdao(SampiyonDAO sdao) {
        this.sdao = sdao;
    }

    public Sampiyon getSampiyon() {
        if(this.sampiyon==null)
            this.sampiyon=new Sampiyon();
        return sampiyon;
       
    }

    public void setSinal(Sampiyon sampiyon) {
        this.sampiyon = sampiyon;
    }
   
}
