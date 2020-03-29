package com.vso;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Properties;

public class MySqlTest {
    private Connection conn;

    public MySqlTest() {
        setupDbConnection();
        createTable();
        //insertData();
        //readData();
    }

    public void setupDbConnection() {
        try {
            String uri = "jdbc:mysql://localhost:3306/library?user=root";
            Properties props = setLoginForDB();
            Class.forName("com.mysql.jdbc.Driver");
            conn = DriverManager.getConnection(uri);
        } catch (Exception e) {
            System.out.print("Opa");
            e.printStackTrace();
        }
    }

    public Properties setLoginForDB() {
        Properties props = new Properties();
        props.setProperty("user", "root");
        props.setProperty("password", "");
        return props;
    }

    public void createTable() {
        try {
            Statement stmt = conn.createStatement();
            String sql = "CREATE TABLE books (" +
                    "id SERIAL PRIMARY KEY NOT NULL," +
                    "name TEXT NOT NULL," +
                    "author TEXT NOT NULL," +
                    "isbn TEXT NOT NULL)";
            stmt.executeUpdate(sql);
            stmt.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void insertData() {
        for (int i = 0; i < 10; i++) {
            insertRow("Kniga" + i, "Avtor" + i, i + "");
        }
    }

    public void insertRow(String name, String author, String isbn) {
        try {
            Statement stmt = conn.createStatement();
            String sql = "INSERT INTO books (name, author, isbn) VALUES('"
                    + name + "', '" +
                    author + "', '" +
                    isbn + "');";
            stmt.executeUpdate(sql);
            stmt.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void readData() {
		// TEST
        try {
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery("SELECT * FROM books;");

            while (rs.next()) {
                int id = rs.getInt("id");
                String bookName = rs.getString("name");
                String bookAuthor = rs.getString("author");
                String bookIsbn = rs.getString("isbn");
                System.out.format("%d %s %s %s\n", id, bookName, bookAuthor, bookIsbn);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public String getBookInfo(String bookName) {
        StringBuilder sb = new StringBuilder();
        try {
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery("SELECT * FROM books WHERE name = '" + bookName + "';");

            while (rs.next()) {
                int id = rs.getInt("id");
                String name = rs.getString("name");
                String bookAuthor = rs.getString("author");
                String bookIsbn = rs.getString("data_of_publishing");
                sb.append(String.format("%d %s %s %s\n", id, name, bookAuthor, bookIsbn));
            }
            return sb.toString();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return "No data";
    }

}
