
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // Write your main program here. Implementing your own classes will be useful.
        String input = "1\nAY-123\n108\n"
                + "x\n"
                + "3\n"
                + "AY-123\n"
                + "x\n";
       // Scanner reader = new Scanner(input);
        Scanner reader = new Scanner(System.in);
        Airport airport = new Airport();
        TextUserInterface ui = new TextUserInterface(reader, airport);
        ui.start();
    }
}
