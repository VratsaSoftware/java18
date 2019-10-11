package db;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;

public class Database {

    private Connection conn;

    public Database() {
        setupDbConnection();
//        createUser();
//        createUsersTable();
//        createTable();
//        insertData();
        //readData();
    }

    public void setupDbConnection() {
        try {
            String uri = "jdbc:mysql://localhost:3306/library?user=root&createDatabaseIfNotExist=true";
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

    public void createUsersTable() {
        try {
            Statement stmt = conn.createStatement();
            String sql = "CREATE TABLE users (" +
                    "id SERIAL PRIMARY KEY NOT NULL," +
                    "username TEXT NOT NULL," +
                    "password TEXT NOT NULL)";
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

    public List<String> getData() {
        List<String> result = new ArrayList<>();
        try {
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery("SELECT * FROM books;");

            while (rs.next()) {
                int id = rs.getInt("id");
                String bookName = rs.getString("name");
                String bookAuthor = rs.getString("author");
                String bookIsbn = rs.getString("isbn");

                result.add(id + "|" + bookName + "|" + bookAuthor + "|" + bookIsbn);
            }
        } catch (Exception e) {
            e.printStackTrace();
            return new ArrayList<>();
        }

        return result;
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

    public void deleteSpam() {
        try {
            Statement stm = conn.createStatement();
            String sql = "DELETE FROM books WHERE name LIKE 'Kniga%'";
            stm.execute(sql);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public boolean login(String username, String password) {
        try {
            Statement stm = conn.createStatement();
            String sql  = "SELECT * FROM users WHERE username = '" + username
                    + "' AND password = '" + password + "'";

            ResultSet rs = stm.executeQuery(sql);
            return rs.next();
        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        }
    }

    public void createUser() {
        try {
            Statement stm = conn.createStatement();
            String sql  = "INSERT INTO users (username, password) VALUES" +
                    "('pesho', 'pesho1234')";

            stm.executeUpdate(sql);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
