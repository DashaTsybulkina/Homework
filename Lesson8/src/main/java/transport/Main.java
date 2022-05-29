package transport;

public class Main {
    public static void main(String[] args) {
        PassengerTransport passengerTransport = new PassengerTransport(700, 400, 3, "Ferrari", 4, 10, "Coupe", 2);
        System.out.println(passengerTransport.info());
        passengerTransport.calculateDistance(4);
        CargoTransport cargoTransport = new CargoTransport(500, 250, 7, "Volvo", 6, 17, 20);
        System.out.println(cargoTransport.info());
        cargoTransport.checkCapacity(15);
        cargoTransport.checkCapacity(25);
        MilitaryTransport militaryTransport = new MilitaryTransport(1100, 500, 7, "IL", 3, 5, true, 5);
        System.out.println(militaryTransport.info());
        militaryTransport.checkEjection();
        militaryTransport.rocketLaunch();
        CivilianTransport civilianTransport = new CivilianTransport(1300, 700, 15, "boieng", 7, 15, 50, true);
        System.out.println(civilianTransport.info());
        civilianTransport.checkPassenger(30);
        civilianTransport.checkPassenger(60);
    }
}
