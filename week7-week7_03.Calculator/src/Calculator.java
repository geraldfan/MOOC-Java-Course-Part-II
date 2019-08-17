/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Gerald
 */
public class Calculator {

    private Reader reader = new Reader();
    private int timesRun = 0;

    public Calculator() {

    }

    public void start() {
        while (true) {
            System.out.print("command: ");
            String command = reader.readString();
            if (command.equals("end")) {
                break;
            }

            if (command.equals("sum")) {
                sum();
                timesRun++;
            } else if (command.equals("difference")) {
                difference();
                timesRun++;
            } else if (command.equals("product")) {
                product();
                timesRun++;
            }
        }

        statistics();
    }

    private void sum() {
        System.out.print("value1: ");
        int value1 = reader.readInteger();// read the value using the Reader-object
        System.out.print("value2: ");
        int value2 = reader.readInteger();// read the value using the Reader-object
        int sum = value1 + value2;
        System.out.println("sum of the values " + sum);// print the value according to the example above
    }

    private void difference() {
        System.out.print("value1: ");
        int value1 = reader.readInteger();// read the value using the Reader-object
        System.out.print("value2: ");
        int value2 = reader.readInteger();// read the value using the Reader-object
        int diff = value1 - value2;
        System.out.println("difference of the values " + diff);// print the value according to the example above
    }

    private void product() {
        System.out.print("value1: ");
        int value1 = reader.readInteger();// read the value using the Reader-object
        System.out.print("value2: ");
        int value2 = reader.readInteger();// read the value using the Reader-object
        int product = value1 * value2;
        System.out.println("product of the values " + product);// print the value according to the example above
    }

    private void statistics() {
        System.out.println("Calculations done " + timesRun);
    }
}
