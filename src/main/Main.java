package main;

import dao.StarDAO;
import tables.Star;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class Main {
    StarDAO starDAO;


    public static void main(String[] args) {
	// jdbc:mysql://localhost:3306/planets
        new Main().run();
    }

    private void run() {
        try {
            Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/planets", "Sentinel", "1234");
            starDAO = new StarDAO(connection);
            //starDAO.addStar(new Star(0,"Polaris"));
            List<Star> stars = starDAO.findAll();
            printStars(stars);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    private void printStars(List<Star> stars) {
        stars.stream().forEach(System.out::println);
    }
}
