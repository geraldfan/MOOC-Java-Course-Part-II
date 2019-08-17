
import static java.lang.Integer.parseInt;
import java.util.Scanner;
import java.util.*;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Gerald
 */
public class Reader {

    private Scanner sc = new Scanner(System.in);

    public String readString() {
        String output = sc.nextLine();
        return output;
    }

    public int readInteger() {
        int input = parseInt(sc.nextLine());
        return input;
    }
}
