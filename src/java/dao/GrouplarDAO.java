package dao;

import entity.Grouplar;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import util.DBConnection;

/**
 *
 * @author the_m
 */

public class GrouplarDAO {

    public List<Grouplar> findAll() {
        List<Grouplar> glist = new ArrayList<>();
        DBConnection db = new DBConnection();
        Connection c = db.connect();
        try {
            Statement st = c.createStatement();
            ResultSet rs = st.executeQuery("select * from grouplar ");
            while (rs.next()) { 
                Grouplar tmp = new Grouplar(rs.getInt("secilme_sirasi"),rs.getString("group_adi"),rs.getString("takim_adi"),rs.getInt("takim_sirasi"));
                               glist.add(tmp);
            }
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
        return glist;
    }

    public void insert(Grouplar grouplar) {
        DBConnection db = new DBConnection();
        Connection connection = db.connect();
        try {
            Statement st = connection.createStatement();
            st.executeUpdate("insert into grouplar(secilme_sirasi,group_adi,takim_adi,takim_sirasi) values('"+grouplar.getSecilme_sirasi()+","+grouplar.getGroup_adi()+","+grouplar.getTakim_adi()+","+grouplar.getTakim_sirasi()+"')");

        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
    }
}
