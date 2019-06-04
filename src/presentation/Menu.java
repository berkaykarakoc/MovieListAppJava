package presentation;

import java.util.Scanner;

public class Menu {

    public Menu() {

    }

    public void printMenu() {
        System.out.println("---------------------");
        System.out.println("1. Show movie list");
        System.out.println("2. Add movie");
        System.out.println("3. Remove movie");
        System.out.println("4. Save list");
        System.out.println("---------------------");
    }

    public String getInput() {
        Scanner s = new Scanner(System.in);

        return s.nextLine();
    }

    public int getInteger() {
        int number=-1;
        Scanner s = new Scanner(System.in);
        boolean isInt = false;
        while(isInt == false) {
            try {
                number = Integer.parseInt(s.nextLine());
                isInt = true ;
            } catch (Exception e) {
                System.out.println("Invalid Value");
                System.out.println("Please enter a Number \n");
            }
        }
        return number;
    }

    public void printErrorMessage() {
        System.out.println("---------------------");
        System.out.println("No such movie");
        System.out.println("---------------------");
    }

}
