package dao;


import entity.CeyrekFinal;
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

public class CeyrekFinalDAO {

    public List<CeyrekFinal> findAll() {
        List<CeyrekFinal> clist = new ArrayList<>();
        DBConnection db = new DBConnection();
        Connection c = db.connect();
        try {
            Statement st = c.createStatement();
            ResultSet rs = st.executeQuery("select * from ceyrekfinal");
            while (rs.next()) { 
                CeyrekFinal tmp = new CeyrekFinal(rs.getInt("tur_id"),rs.getString("takim_adi"),rs.getString("ulkesi"));
                               clist.add(tmp);
            }
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
        return clist;
    }

    }

