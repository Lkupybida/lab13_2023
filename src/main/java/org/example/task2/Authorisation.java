package org.example.task2;

public class Authorisation extends Авторизація {
    public Boolean authorise(DataBase db) {
        db.getUserData();
        return true;
    }
}
