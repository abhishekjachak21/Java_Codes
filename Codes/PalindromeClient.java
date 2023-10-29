import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.util.Scanner;

public class PalindromeClient {

    public static void main(String[] args) {
        try {
            Registry registry = LocateRegistry.getRegistry("localhost", 1099);

            PalindromeService palindromeService = (PalindromeService) registry.lookup("PalindromeService");

            Scanner sc = new Scanner(System.in);

            System.out.println("Enter the string: ");
            String input = sc.nextLine();

            if (palindromeService.isPalindrome(input)) {
                System.out.println(input + " is a palindrome.");
            } else {
                System.out.println(input + " is not a palindrome.");
            }
        } catch (Exception e) {
            System.err.println("Client exception: " + e.toString());
            e.printStackTrace();
        }
    }
}
