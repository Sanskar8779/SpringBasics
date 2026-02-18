package com.coupling.tight;

public class TightCoupling {
    public static void main(String[] args) {
        UserManager uM = new UserManager();
        System.out.println(uM.getUserInfo());
    }
}
