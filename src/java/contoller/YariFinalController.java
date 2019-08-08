/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package contoller;



import dao.YariFinalDAO;
import entity.YariFinal;
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
public class YariFinalController implements Serializable {
    private List<YariFinal> ylist;
    private YariFinalDAO ydao;
    
    private YariFinal yarifinal;
    
     public List<YariFinal> getYlist() {
        this.ylist=this.getYdao().findAll();
        return ylist;
     
    }
     
    public void setYlist(List<YariFinal> ylist) {
        this.ylist = ylist;
    }

    public YariFinalDAO getYdao() {
        if(this.ydao==null)
            this.ydao=new YariFinalDAO();
        return ydao;
    }

    public void setYdao(YariFinalDAO ydao) {
        this.ydao = ydao;
    }

    public YariFinal getYariFinal() {
       if(this.yarifinal==null)
            this.yarifinal=new YariFinal();
        return yarifinal;
    }

    public void setYariFinal(YariFinal yarifinal) {
        this.yarifinal = yarifinal;
    }
}

    
     
