package org.example.Classes;

import java.math.BigDecimal;
import java.sql.*;

public class ProductoCRUD {

    //Consulta devuelve todos los datos de la tabla producto
    public static void getAll(){
        String sql = "SELECT * FROM producto";

        try(Connection conn = ConexionMySQL.connection()) {
            PreparedStatement preparedStatementstatement = conn.prepareStatement(sql);
            ResultSet resultSetQuery = preparedStatementstatement.executeQuery();

            while (resultSetQuery.next()){
                System.out.printf("Barcode -> %s , Nombre -> %s , Precio -> %s",
                        resultSetQuery.getString(1),
                        resultSetQuery.getString(2),
                        resultSetQuery.getBigDecimal(3)
                        );
                System.out.println();
            }

        }catch (Exception e){
            System.out.println(e.getMessage());
        }
    }
    //Consulta para meter mas productos
    public static void add(String barcode, String nombre, double precio){
        String sql = "INSERT INTO producto() VALUES (?, ?, ?)";

        try (Connection conn = ConexionMySQL.connection()) {
            PreparedStatement preparedStatement = conn.prepareStatement(sql);

            preparedStatement.setString(1, barcode);
            preparedStatement.setString(2, nombre);
            preparedStatement.setBigDecimal(3, new BigDecimal(precio));
            preparedStatement.executeUpdate();
        }catch (SQLException e){
            throw new RuntimeException(e);
        }
    }

    //Consulta para actualizar el precio de un producto por id
    public static void nuevoPrecioId(String barcode, double precio){
        String sql = "";

        try (Connection conn = ConexionMySQL.connection()) {
            PreparedStatement preparedStatement = conn.prepareStatement(sql);

            ResultSet resultSet = preparedStatement.executeQuery();

        }catch (SQLException e){
            throw new RuntimeException(e);
        }
    }
}
