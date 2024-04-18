package org.example.Classes;

import java.io.InputStream;
import java.util.Properties;

public class ConfiguracionBD {

    private static final Properties PROPERTIES = new Properties();
    private static final String PROPERTIES_FILE = "application.properties";

    static {
        try (InputStream inputStream = ConfiguracionBD.class.getClassLoader().getResourceAsStream(PROPERTIES_FILE)){
            if (inputStream == null){
                System.out.println("No podemos cargar el fichero " + PROPERTIES_FILE);
                System.exit(1);
            }
            PROPERTIES.load(inputStream);
        }catch (Exception e){
            throw new RuntimeException(e);
        }
    }

    public static String getUrl(){
        return PROPERTIES.getProperty("db.url");
    }

    public static String getUser(){
        return PROPERTIES.getProperty("db.user");
    }

    public static String getPassword(){
        return PROPERTIES.getProperty("db.pass");
    }
}
