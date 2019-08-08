package dao;

import entity.Oyuncular;
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

public class OyuncularDAO {

    public List<Oyuncular> findAll() {
        List<Oyuncular> olist = new ArrayList<>();
        DBConnection db = new DBConnection();
        Connection c = db.connect();
        try {
            Statement st = c.createStatement();
            ResultSet rs = st.executeQuery("select * from oyuncu ");
            while (rs.next()) { 
                Oyuncular tmp = new Oyuncular(rs.getInt("oyuncu_id"),rs.getString("adi_soyadi"),rs.getString("mevki"),rs.getString("takimi"));
                               olist.add(tmp);
            }
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
        return olist;
    }

   
}
