/*
Name: Nanak Barring
Date: 2/7/26
Program: Dog class for Testing Objects lab
*/

public class Dog {

    // data variables (fields)
    private String name;
    private int age;
    private String breed;

    // no-arg (default) constructor
    public Dog() {
        name = "Unknown";
        age = 0;
        breed = "Mixed";
    }

    // parameterized constructor
    public Dog(String name, int age, String breed) {
        this.name = name;
        this.age = age;
        this.breed = breed;
    }

    // getters
    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getBreed() {
        return breed;
    }

    // setters
    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        if (age >= 0) {
            this.age = age;
        }
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    // toString
    @Override
    public String toString() {
        return "Dog{name='" + name + "', age=" + age + ", breed='" + breed + "'}";
    }
}
