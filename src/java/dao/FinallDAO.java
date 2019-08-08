package dao;

import entity.Finall;
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

public class FinallDAO {

    public List<Finall> findAll() {
        List<Finall> flist = new ArrayList<>();
        DBConnection db = new DBConnection();
        Connection c = db.connect();
        try {
            Statement st = c.createStatement();
            ResultSet rs = st.executeQuery("select * from final");
            while (rs.next()) { 
                Finall tmp = new Finall(rs.getInt("sampiyon_id"),rs.getString("takim_adi"),rs.getString("ulkesi"));
                               flist.add(tmp);
            }
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
        return flist;
    }

    }

