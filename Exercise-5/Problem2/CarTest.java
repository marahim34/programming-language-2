package Problem2;

public class CarTest {
    public static void main(String[] args) {
        Car car1 = new Car("Toyota", "Camry", 2022);
        Car car2 = new Car("Ford", "Mustang", 2021);
        Car car3 = new Car("Chevrolet", "Impala", 1980);

        System.out.println(car1);
        System.out.println(car2);
        System.out.println(car3);

        System.out.println(car1.getMake() + " " + car1.getModel()
                + " is antique? " + car1.isAntique());
        System.out.println(car2.getMake() + " " + car2.getModel()
                + " is antique? " + car2.isAntique());
        System.out.println(car3.getMake() + " " + car3.getModel()
                + " is antique? " + car3.isAntique());

        car2.setYear(1970);
        System.out.println("\nAfter updating " + car2.getModel() + " year:");
        System.out.println(car2 + " is antique? " + car2.isAntique());
    }
}
