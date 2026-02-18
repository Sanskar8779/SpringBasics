package com.coupling.loose;

public class UserDatabaseProvider implements UserDataProvider {
    @Override
    public String getUserDetails() {
        return "User data from DB";
    }
}
