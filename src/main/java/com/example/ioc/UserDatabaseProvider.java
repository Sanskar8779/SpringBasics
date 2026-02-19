package com.example.ioc;

public class UserDatabaseProvider implements UserDataProvider {
    @Override
    public String getUserDetails() {
        return "User data from DB";
    }
}
