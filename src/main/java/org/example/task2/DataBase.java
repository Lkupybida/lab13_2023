package org.example.task2;

public class DataBase extends БазаДаних {
    public String getUserData() {
        return отриматиДаніКористувача();
    }

    public String getStatisticalData() {
        return отриматиСтатистичніДані();
    }
}
