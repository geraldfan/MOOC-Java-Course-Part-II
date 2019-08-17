
import static java.lang.Integer.parseInt;
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Gerald
 */
public class TextUserInterface {

    private Scanner reader;
    private Airport airport;

    public TextUserInterface(Scanner reader, Airport airport) {
        this.reader = reader;
        this.airport = airport;
    }

    public void listAirportOperations() {
        System.out.println("[1] Add airplane");
        System.out.println("[2] Add flight");
        System.out.println("[x] Exit");
        System.out.println("> ");
    }

    public void listFlightOperations() {
        System.out.println("[1] Print planes");
        System.out.println("[2] Print flights");
        System.out.println("[3] Print plane info");
        System.out.println("[x] Quit");
        System.out.println("> ");
    }

    public void displayAirportPanel() {
        System.out.println("Airport panel");
       System.out.println("--------------------");
        System.out.println("Choose operation:");
        listAirportOperations();
        String input = reader.nextLine();
        while (!input.equals("x")) {
            if (input.equals("1")) {
                addPlane();
            } else if (input.equals("2")) {
                addFlight();
            }
            System.out.println("Choose operation:");
            listAirportOperations();
            input = reader.nextLine();
        }
        System.out.println();
    }

    public void displayFlightService() {
        System.out.println("Flight service");
        System.out.println("------------");
        System.out.println("Choose operation:");
        listFlightOperations();
        String input = reader.nextLine();
        while (!input.equals("x")) {
            if (input.equals("1")) {
                airport.printPlanes();
            } else if (input.equals("2")) {
                airport.printFlights();
            } else if (input.equals("3")) {
                System.out.print("Give plane ID: ");
                String planeID = reader.nextLine();
                airport.printPlaneInfo(planeID);
            }
            System.out.println("Choose operation:");
            listFlightOperations();
            input = reader.nextLine();
        }
        System.out.println();
    }

    private void addPlane() {
        System.out.print("Give plane ID: "); // Reading in the parameters of the plane
        String planeID = reader.nextLine();
        System.out.print("Give plane capacity: ");
        int capacity = parseInt(reader.nextLine());
        airport.addPlane(planeID, capacity);
    }

    private void addFlight() {
        System.out.print("Give plane ID: ");
        String planeID = reader.nextLine();
        System.out.print("Give departure airport code: ");
        String departure = reader.nextLine();
        System.out.print("Give destination airport code: ");
        String destination = reader.nextLine();
        Flight flight = new Flight(departure, destination);
        airport.addFlight(planeID, flight);
    }

    public void start() {
        displayAirportPanel();
        displayFlightService();
    }
}
