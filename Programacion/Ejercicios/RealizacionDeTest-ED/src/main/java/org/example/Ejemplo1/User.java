package org.example.Ejemplo1;

import org.junit.jupiter.api.Test;

public class User {
    private String userName;
    private String password;

    public User() {
    }

    public User(String userName, String password) {
        this.userName = userName;
        this.password = password;
    }

//    @Test
//    public boolean passwordEsIgual(String password1, String password2){
//        if (password1 == null || password2 == null){
//            return false;
//        }
//        return true;
//    }

}
