package com.coupling.loose;

public class LooseCoupling {
    public static void main(String[] args) {
        UserDataProvider userDataProvider = new UserDatabaseProvider();
        UserManager userManagerWithDb = new UserManager(userDataProvider);
        System.out.println(userManagerWithDb.getUserInfo());


        //User Manager class is only made once, we are not touching it again and again when we change implementation of DB
        //This is example of loose coupling where we do not have to change code everywhere
        UserDataProvider webServiceProvider = new WebServiceProvider();
        UserManager userManagerWithWebService = new UserManager(webServiceProvider);
        System.out.println(userManagerWithWebService.getUserInfo());
    }
}
