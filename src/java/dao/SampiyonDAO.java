package dao;

import entity.Finall;
import entity.Sampiyon;
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

public class SampiyonDAO {

    public List<Sampiyon> findAll() {
        List<Sampiyon> slist = new ArrayList<>();
        DBConnection db = new DBConnection();
        Connection c = db.connect();
        try {
            Statement st = c.createStatement();
            ResultSet rs = st.executeQuery("select * from sampiyon");
            while (rs.next()) { 
                Sampiyon tmp = new Sampiyon(rs.getInt("sampiyon_id"),rs.getString("takim_adi"),rs.getString("ulkesi"));
                               slist.add(tmp);
            }
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
        return slist;
    }

    }

