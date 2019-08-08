package dao;

import entity.Transfer;
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

public class TransferDAO {

    public List<Transfer> findAll() {
        List<Transfer> tlist = new ArrayList<>();
        DBConnection db = new DBConnection();
        Connection c = db.connect();
        try {
            Statement st = c.createStatement();
            ResultSet rs = st.executeQuery("select * from transfer ");
            while (rs.next()) { 
                Transfer tmp = new Transfer(rs.getInt("oyuncu_id"),rs.getString("adi_soyadi"),rs.getString("mevki"),rs.getString("takimi"));
                               tlist.add(tmp);
            }
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
        return tlist;
    }

  
}
