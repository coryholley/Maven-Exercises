import org.apache.commons.lang3.StringUtils;

import java.util.Scanner;

//Create a new class with a main method that prompts the user for input and does the following (using the Stringutils class)
//
//        Tells whether or not what the user entered is a number
//        Flips the case of the string
//        Reverses the string
//        Example Console Output

public class Maven {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter a line from a song.");
        String lyrics = scanner.nextLine();

        System.out.println(StringUtils.isNumeric(lyrics));
        System.out.println(StringUtils.swapCase(lyrics));
        System.out.println(StringUtils.reverse(lyrics));


    }


}
