package dao;

import entity.Takimlar;
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

public class TakimlarDAO {

    public List<Takimlar> findAll() {
        List<Takimlar> tlist = new ArrayList<>();
        DBConnection db = new DBConnection();
        Connection c = db.connect();
        try {
            Statement st = c.createStatement();
            ResultSet rs = st.executeQuery("select * from takim ");
            while (rs.next()) { 
                Takimlar tmp = new Takimlar(rs.getString("takim_adi"),rs.getString("ulkesi"),rs.getInt("sirasi"));
                               tlist.add(tmp);
            }
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
        return tlist;
    }

   
}
