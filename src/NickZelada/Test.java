package NickZelada;

import java.util.*;
import NickZelada.PascalsTriangle;

/**
 * The Test class consist of the main in which would run the program.
 *
 * @author Nick Zelada
 * @version October 1, 2018
 */
public class Test {

    /**
     * The test file would ask the user to input a number from 1-13 in which how
     * many rows they wish to see. If they put something else, they get an error
     * message. After seeing the rows that they wanted, they would be asked if
     * they want to see more or no. If they put no, then the program quits.
     *
     * @param args
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // scanner

        String input = "";

        do {
            boolean valid = false;
            int row = 0;
            while (!valid) {
                System.out.println("Enter a valid number of rows between 1-13: "); // inputs a number from 1-13
                try {

                    row = Integer.parseInt(scanner.nextLine());

                    if (row < 1 || row > 13) {
                        System.out.println("number should be within 1-13"); // user put a number out of the range
                    } else {
                        valid = true;
                    }
                } catch (Exception e) {
                    System.out.println("Invalid input, try again..."); // wrong input
                }
            }
            PascalsTriangle t = new PascalsTriangle(row); // Creates Pascal triangle with required number of rows
            System.out.println(t.toString()); // prints it
            System.out.println("\n\n Do you want to continue? (y/n)"); // ask user if they want more

            input = scanner.nextLine();
        } while (input.equalsIgnoreCase("y"));
    }

}
