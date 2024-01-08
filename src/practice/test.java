package practice;

import java.util.Scanner;

public class test {
    public static void main(String[] args) {
        // Create a Scanner object to read user input
        Scanner scanner = new Scanner(System.in);

        // Declare a variable to store the user's input
        String option;

        // Prompt the user to enter 'YES' or 'NO' and convert the input to uppercase
        System.out.println("Enter 'YES' or 'NO': ");
        option = scanner.nextLine().toUpperCase();

        // Continue prompting the user until a valid input ('YES' or 'NO') is provided
        while (!option.equals("NO") && !option.equals("YES") ){
            //Display an error message
            System.out.println("Error");

            //Prompt the user again for a valid input and convert to uppercase
            System.out.println("Enter 'YES' or 'NO': ");
            option = scanner.nextLine().toUpperCase();
        }

        //Display the final chosen option
        System.out.println("Option is : " + option);

    }
}
