package Intro;

import java.sql.SQLException;

public class CheckExceptions {

    public static void main(String[] args) {

        Account acc = new Account();
        try {
            System.out.println("trying to withdraw, eh");
            acc.Withdraw(100);
        } catch (SQLException e) {
            System.out.println(e.getMessage());
            System.out.println("Try again later, son");
//            e.printStackTrace();
        }

        finally {
            System.out.println("this is always executed");
        }
    }

}
