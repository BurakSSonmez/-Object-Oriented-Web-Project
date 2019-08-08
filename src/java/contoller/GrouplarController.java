/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package contoller;

import dao.GrouplarDAO;
import entity.Grouplar;
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
public class GrouplarController implements Serializable {
    private List<Grouplar> glist;
    private GrouplarDAO gdao;
    
    private Grouplar grouplar;
    
    public List<Grouplar> getGlist() {
        this.glist=this.getGdao().findAll();
        return glist;
    }

    public void setGlist(List<Grouplar> glist) {
        this.glist = glist;
    }

    public GrouplarDAO getGdao() {
        if(this.gdao==null)
            this.gdao=new GrouplarDAO();
        return gdao;
    }

    public void setGdao(GrouplarDAO gdao) {
        this.gdao = gdao;
    }

    public Grouplar getGrouplar() {
        if(this.grouplar==null)
            this.grouplar=new Grouplar();
        return grouplar;
    }

    public void setGrouplar(Grouplar grouplar) {
        this.grouplar = grouplar;
    }
    
    
    
}
