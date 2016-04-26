package dao;

import tables.Star;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Eugeny on 23.04.2016.
 */
public class StarDAO {
    Connection connection;

    public StarDAO(Connection connection) {
        this.connection = connection;
    }

    public List<Star> findAll() {
        List<Star> stars = new ArrayList<>();
        try {
            PreparedStatement preparedStatement = connection.prepareStatement("SELECT * FROM star");
            try (ResultSet resultSet = preparedStatement.executeQuery()) {
                while (resultSet.next()) {
                    int id = resultSet.getInt("id");
                    String name = resultSet.getString("name");
                    Star s = new Star(id, name);
                    stars.add(s);
                }
            }
        } catch (SQLException e) {

        }
        return stars;
    }

    public void addStar(Star star) {
        try {
            PreparedStatement preparedStatement = connection.prepareStatement("INSERT INTO star (name) VALUES (?)");
            preparedStatement.setString(1, star.getName());
            preparedStatement.executeUpdate();
            preparedStatement.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
