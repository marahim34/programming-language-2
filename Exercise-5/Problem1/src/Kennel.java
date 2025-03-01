public class Kennel {
    public static void main(String[] args){
    Dog dog1 = new Dog("Rex", 3);
    Dog dog2 = new Dog("Max", 5);
    Dog dog3 = new Dog("Stephen", 4);

    System.out.println(dog1);
    System.out.println(dog2);
    System.out.println(dog3);

    dog1.setName("Rocky");
    dog1.setAge(4);

    System.out.println("After updates " + dog1);

    System.out.println("Age of " + dog2.getName() + " in person years: " + dog2.getAgeInPersonInYears());

    }
}
