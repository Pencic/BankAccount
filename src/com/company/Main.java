package com.company;

public class Main {

    public static void main(String[] args) {
        Client client = new Client(0,"Milos","123456");
        Account account = new Account(1,100,1.5, new Client(1,"Nikola" , "1234"));
        account.withdraw(20);
        account.toString();
        System.out.println(client );

    }

}
