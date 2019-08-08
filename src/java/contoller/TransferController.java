/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package contoller;

import dao.TransferDAO;
import entity.Transfer;
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
public class TransferController implements Serializable {
    private List<Transfer> tlist;
    private TransferDAO tdao;
    
    private Transfer transfer;
    
    public List<Transfer> getTlist() {
        this.tlist=this.getTdao().findAll();
        return tlist;
    }

    public void setTlist(List<Transfer> tlist) {
        this.tlist = tlist;
    }

    public TransferDAO getTdao() {
        if(this.tdao==null)
            this.tdao=new TransferDAO();
        return tdao;
    }

    public void setTdao(TransferDAO tdao) {
        this.tdao = tdao;
    }

    public Transfer getTransfer() {
        if(this.transfer==null)
            this.transfer=new Transfer();
        return transfer;
    }

    public void setTransfer(Transfer transfer) {
        this.transfer = transfer;
    }
    
    
    
}
