package Problem3;

public class FlightTest {
    public static void main(String[] args) {
        Flight flight1 = new Flight("Lufthansa", "Frankfurt", "New York", 4001);
        Flight flight2 = new Flight("Emirates", "Dubai", "London", 29);
        Flight flight3 = new Flight("Delta", "Los Angeles", "Tokyo", 123);
        Flight flight4 = new Flight("Qatar Airways", "Doha", "Sydney", 909);

        Flight[] flights = { flight1, flight2, flight3, flight4 };

        flight3.setFlightNumber(777);
        flight1.setAirline("Lufthansa Updated");

        System.out.println("Flight3 airline: " + flight3.getAirline());
        System.out.println("Flight3 flight number: " + flight3.getFlightNumber());

        System.out.println("\nAll Flights Info:");
        for (Flight flight : flights) {
            System.out.println(flight);
        }
    }
}
