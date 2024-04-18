package org.example.Classes;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConexionMySQL {

    public static Connection connection(){
        try {
            return DriverManager.getConnection(ConfiguracionBD.getUrl(), ConfiguracionBD.getUser(), ConfiguracionBD.getPassword());
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
        return null;
    }
}
