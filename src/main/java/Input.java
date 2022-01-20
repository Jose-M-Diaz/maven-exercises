import org.apache.commons.lang3.StringUtils;

import java.util.Scanner;

public class Input {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Something: ");
        String userInput = sc.nextLine();
        System.out.println("You Entered: " + userInput);
        if (userInput == "") {
            //System.out.println(StringUtils.isNumeric(userInput));
            System.out.println(userInput + " is a number");
        } else {
            System.out.println(userInput + " is not a number");
        }
        System.out.println("Flipped Case: " + StringUtils.swapCase(userInput));
        System.out.println("Reversed: " + StringUtils.reverse(userInput));

    }
}
