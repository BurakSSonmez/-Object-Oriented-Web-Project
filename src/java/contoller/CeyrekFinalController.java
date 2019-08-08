/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package contoller;

import dao.CeyrekFinalDAO;
import entity.CeyrekFinal;
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
public class CeyrekFinalController implements Serializable {
    private List<CeyrekFinal> clist;
    private CeyrekFinalDAO cdao;
    
    private CeyrekFinal ceyrekfinal;
    
    public List<CeyrekFinal> getClist() {
        this.clist=this.getCdao().findAll();
        return clist;
    }

    public void setClist(List<CeyrekFinal> clist) {
        this.clist = clist;
    }

    public CeyrekFinalDAO getCdao() {
        if(this.cdao==null)
            this.cdao=new CeyrekFinalDAO();
        return cdao;
    }

    public void setCdao(CeyrekFinalDAO cdao) {
        this.cdao = cdao;
    }

    public CeyrekFinal getCeyrekFinal() {
        if(this.ceyrekfinal==null)
            this.ceyrekfinal=new CeyrekFinal();
        return ceyrekfinal;
    }

    public void setCeyrekFinal(CeyrekFinal ceyrekfinal) {
        this.ceyrekfinal = ceyrekfinal;
    }
   
}
