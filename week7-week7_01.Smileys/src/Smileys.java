
public class Smileys {

    public static void main(String[] args) {
        printWithSmileys("Method");
        printWithSmileys("Beerbottle");
        printWithSmileys("Matti");
        // Test your method at least with the following
        // printWithSmileys("Method");
        // printWithSmileys("Beerbottle");
        // printWithSmileys("Interface");
    }

    private static void printWithSmileys(String input) {
       boolean isPrinted = false;
        for (int i = 0; i < 3; i++) {
            if (input.length() % 2 == 0) {
                for (int j = 0; j < input.length() + 6; j++) {
                    if (i == 0 || i == 2) {
                        if (j % 2 == 0) {
                            System.out.print(":");
                        } else {
                            System.out.print(")");
                        }
                    } else if(isPrinted == false) {
                        System.out.print(":) ");
                        System.out.print(input);
                        System.out.print(" :)");
                        isPrinted = true;
                    }
                }
            } else{
                for (int j = 0; j < input.length() + 7; j++) {
                    if (i == 0 || i == 2) {
                        if (j % 2 == 0) {
                            System.out.print(":");
                        } else {
                            System.out.print(")");
                        }
                    } else if(isPrinted == false) {
                        System.out.print(":) ");
                        System.out.print(input);
                        System.out.print("  :)");
                        isPrinted = true;
                    }                }
            }
            System.out.println();
        }
        return;
    }
}
