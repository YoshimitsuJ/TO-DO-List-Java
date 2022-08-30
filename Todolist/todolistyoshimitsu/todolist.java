package todolistyoshimitsu;

import java.beans.Expression;
import java.util.Scanner;

public class todolist {

    public static void main(String[] args) {

        // welcome page
        System.out.println("Welcome Yoshimitsu");

        Scanner s = new Scanner(System.in);

        while (true) {
            // Menu
            System.out.println("Please choose an option\n");
            System.out.println("1. Enter a task");
            System.out.println("2. Remove a task");
            System.out.println("3. List all Task");
            System.out.println("4. Exit");
            Scanner input;
            int choice = s.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("Enter number of task");
                    s.nextLine();
                    System.out.println("Enter a task");

                    break;

                case 2:
                    System.out.println("Wich task do you want to remove?");

            }
            break;
        }
    }

}