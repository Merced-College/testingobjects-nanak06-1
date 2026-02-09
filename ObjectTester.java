/*
Name: Nanak Barring
Date: 2/7/26
Program: Object Tester for Testing Objects lab
*/

public class ObjectTester {
    public static void main(String[] args) {

        System.out.println("--- Dog Tests ---");

        // default constructor
        Dog d1 = new Dog();
        System.out.println("d1 after default constructor:");
        System.out.println(d1);

        // parameterized constructor
        Dog d2 = new Dog("Rex", 4, "Collie");
        System.out.println("\nd2 after parameterized constructor:");
        System.out.println(d2);

        // mutate using setters + read using getters
        System.out.println("\nMutating d2 via setters:");
        d2.setAge(6);
        d2.setName("Max");
        d2.setBreed("Border Collie");

        System.out.println("d2 age via getter: " + d2.getAge());
        System.out.println("d2 now:");
        System.out.println(d2);

        System.out.println("\n--- Car Tests ---");

        // default constructor
        Car c1 = new Car();
        System.out.println("c1 after default constructor:");
        System.out.println(c1);

        // parameterized constructor
        Car c2 = new Car("Civic", 2018, false);
        System.out.println("\nc2 after parameterized constructor:");
        System.out.println(c2);

        // mutate using setters + read using getters
        System.out.println("\nMutating c2 via setters:");
        c2.setModel("Model 3");
        c2.setYear(2021);
        c2.setElectric(true);

        System.out.println("c2 year via getter: " + c2.getYear());
        System.out.println("c2 now:");
        System.out.println(c2);
    }
}
