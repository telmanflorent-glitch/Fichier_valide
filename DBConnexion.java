package org.example.DAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnexion {

    private static final String url = "jdbc:mysql://localhost:3306/personnes";
    private static final String user = "root";
    private static final String password = "";


    public static Connection getConnection() {
        try {
            Connection conn = DriverManager.getConnection(url, user, password);
            System.out.println("Connection established");
            return conn;
        } catch (SQLException ex) {
            System.out.println("Erreur de connexion");
            ex.printStackTrace();
            return null;  // Obligatoire ici pour que la méthode retourne toujours une valeur
        }
    }


    public static void closeConnection(Connection conn) {
        if (conn != null) {
            try {
                conn.close();
                System.out.println("Connection closed");
            } catch (SQLException ex) {
                System.out.println("Erreur lors de la fermeture de la connexion");
                ex.printStackTrace();
            }
        }
    }



}
