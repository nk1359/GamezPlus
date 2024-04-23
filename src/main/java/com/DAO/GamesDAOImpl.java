package com.DAO;

import java.security.spec.PSSParameterSpec;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import com.entity.GameDtls;

/**
 * Implementation class for GamesDAO interface.
 */
public class GamesDAOImpl implements GamesDAO {

    private Connection conn;

    /**
     * Constructs a GamesDAOImpl object with the specified database connection.
     * 
     * @param conn The database connection.
     */
    public GamesDAOImpl(Connection conn) {
        super();
        this.conn = conn;
    }

    /**
     * Adds game details to the database.
     * 
     * @param g The GameDtls object containing game details.
     * @return true if the game details are successfully added, false otherwise.
     */
    @Override
    public boolean addGames(GameDtls g) {
        boolean f = false;

        try {
            String sql = "insert into game_dtls(gameName, publisher, price, gameCategory, status, photo, email) values(?,?,?,?,?,?,?)";
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setString(1, g.getGameName());
            ps.setString(2, g.getPublisher());
            ps.setString(3, g.getPrice());
            ps.setString(4, g.getGameCategory());
            ps.setString(5, g.getStatus());
            ps.setString(6, g.getPhotoName());
            ps.setString(7, g.getEmail());

            int i = ps.executeUpdate();

            if (i == 1) {
                f = true;
            }

        } catch (Exception e) {
            e.getStackTrace();
        }

        return f;
    }

    @Override
    public List<GameDtls> getAllGames() {

        List<GameDtls> list = new ArrayList<GameDtls>();
        GameDtls g = null;

        try {
            String sql = "select * from game_dtls";
            PreparedStatement ps = conn.prepareStatement(sql);

            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                g = new GameDtls();
                g.setGameId(rs.getInt(1));
                g.setGameName(rs.getString(2));
                g.setPublisher(rs.getString(3));
                g.setPrice(rs.getString(4));
                g.setGameCategory(rs.getString(5));
                g.setStatus(rs.getString(6));
                g.setPhotoName(rs.getString(7));
                g.setEmail(rs.getString(8));
                list.add(g);
            }

        } catch (Exception e) {
            e.printStackTrace();
        }

        return list;
    }

}
