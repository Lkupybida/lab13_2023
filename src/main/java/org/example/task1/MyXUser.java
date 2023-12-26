package org.example.task1;

import java.time.LocalDate;

public class MyXUser implements User{
    private XUser xUser;
    public MyXUser (XUser xUser) {
        this.xUser = xUser;
    }
    @Override
    public String getEmail() {
        return xUser.getEmail();
    }
    @Override
    public String getCountry () {
        return xUser.getCountry();
    }
    @Override
    public LocalDate getLastActiveTime() {
        return xUser.getLastActiveTime().toLocalDate();
    }
}
