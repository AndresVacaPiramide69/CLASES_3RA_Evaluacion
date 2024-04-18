package com.example.ejemploFran;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.Statement;

@SpringBootApplication
public class EjemploFranApplication {

	public static void main(String[] args) {
		SpringApplication.run(EjemploFranApplication.class, args);
		DriverManager.drivers().forEach(driver -> System.out.printf("Driver: %s%n", driver.getClass().getName()));

		try (Connection connection = DriverManager.getConnection("jdbc:h2:mem:database", "root", "password")){
			connection.setAutoCommit(false);

			//Create Tabe
			Statement statement = connection.createStatement();
			String sqlCreateTable = "CREATE TABLE product (id serial, name VARCHAR (20), price DECIMAL(40))";
			statement.execute(sqlCreateTable);
			System.out.println("Creado correctamente");

			//Insert
			String insert = "INSERT INTO product(name, price) VALUES ('penetron', '777')";
			PreparedStatement ps = connection.prepareStatement(insert);

		}catch (Exception e){
			System.out.println(e.getMessage());
		}
	}

}
