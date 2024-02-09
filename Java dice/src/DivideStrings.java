import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class DivideStrings {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        List<String> shortStrings = new ArrayList<>();
        List<String> longStrings = new ArrayList<>();
        int count = 0;
       
        while (count < 20) {
            System.out.print("Enter a string ");
            String str = input.nextLine();
            if (str.equalsIgnoreCase("exit")) {
                break;
            } else if (str.length() <= 5) {
                shortStrings.add(str);
            } else {
                longStrings.add(str);
            }
            count++;
        }
       
        System.out.print("Enter short/long to show the list: ");
        String option = input.nextLine();
        if (option.equalsIgnoreCase("short")) {
            if (shortStrings.isEmpty()) {
                System.out.println("No short strings were entered.");
            } else {
                System.out.println("Short strings: " + shortStrings);
            }
        } else if (option.equalsIgnoreCase("long")) {
            if (longStrings.isEmpty()) {
                System.out.println("No long strings were entered.");
            } else {
                System.out.println("Long strings: " + longStrings);
            }
        } else {
            System.out.println("Invalid.");
        }
       
        input.close();
    }
}