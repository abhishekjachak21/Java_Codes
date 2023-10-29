import java.rmi.Remote;
import java.rmi.RemoteException;

// Define the PalindromeService interface that extends Remote
public interface PalindromeService extends Remote {

    // Define the isPalindrome method that throws a RemoteException
    boolean isPalindrome(String input) throws RemoteException;
}
