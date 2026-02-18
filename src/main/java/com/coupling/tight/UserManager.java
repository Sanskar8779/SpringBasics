package com.coupling.tight;

public class UserManager {
    private UserDatabase uD = new UserDatabase();
    public String getUserInfo() {
        return uD.getUserData();
    }
}
