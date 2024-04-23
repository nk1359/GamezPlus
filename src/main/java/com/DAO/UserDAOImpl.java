package com.DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import com.entity.User;
import com.mysql.cj.protocol.Resultset;

/**
 * Implementation class for UserDAO interface.
 */
public class UserDAOImpl implements UserDAO {

    private Connection conn;

    /**
     * Constructs a UserDAOImpl object with the specified database connection.
     * 
     * @param conn The database connection.
     */
    public UserDAOImpl(Connection conn) {
        super();
        this.conn = conn;
    }

    /**
     * Registers a new user in the database.
     * 
     * @param us The User object containing user details.
     * @return true if the user is successfully registered, false otherwise.
     */
    @Override
    public boolean userRegister(User us) {
        boolean f = false;

        try {
            String sql = "insert into user(name,email,phno,password) values(?,?,?,?)";
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setString(1, us.getName());
            ps.setString(2, us.getEmail());
            ps.setString(3, us.getPhno());
            ps.setString(4, us.getPassword());

            int i = ps.executeUpdate();
            if (i == 1) {
                f = true;
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
        return f;
    }

    /**
     * Authenticates a user by checking their credentials in the database.
     * 
     * @param email    The email of the user.
     * @param password The password of the user.
     * @return The User object if authentication is successful, null otherwise.
     */
    @Override
    public User login(String email, String password) {
        User us = null;

        try {
            String sql = "select * from user where email=? and password=?";
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setString(1, email);
            ps.setString(2, password);

            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                us = new User();
                us.setId(rs.getInt(1));
                us.setName(rs.getString(2));
                us.setEmail(rs.getString(3));
                us.setPhno(rs.getString(4));
                us.setPassword(rs.getString(5));
                us.setAddress(rs.getString(6));
                us.setCity(rs.getString(7));
                us.setState(rs.getString(8));
            }

        } catch (Exception e) {
            e.printStackTrace();
        }

        return us;
    }
}
