package Problem3;

public class Flight {
    private String airline;
    private String origin;
    private String destination;
    private int flightNumber;

    public Flight(String airline, String origin, String destination, int flightNumber) {
        this.airline = airline;
        this.origin = origin;
        this.destination = destination;
        this.flightNumber = flightNumber;
    }

    public String getAirline() {
        return airline;
    }

    public String getOrigin() {
        return origin;
    }

    public String getDestination() {
        return destination;
    }

    public void setAirline(String airline) {
        this.airline = airline;
    }

    public int getFlightNumber() {
        return flightNumber;
    }

    public void setOrigin(String origin) {
        this.origin = origin;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public void setFlightNumber(int flightNumber) {
        this.flightNumber = flightNumber;
    }

    @Override
    public String toString() {
        return "Flight[airline=" + airline +
                ", origin=" + origin +
                ", destination=" + destination +
                ", flightNumber=" + flightNumber + "]";
    }
}
