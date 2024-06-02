// Superclass
class Animal {
    // Properties
    String name;
    int age;

    // Constructor
    public Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Method
    public void sleep() {
        System.out.println(name + " is sleeping");
    }
}

// Subclass inheriting from Animal
class Dog extends Animal {
    // Constructor
    public Dog(String name, int age) {
        super(name, age); // Call the superclass constructor
    }

    // Additional method specific to Dog
    public void bark() {
        System.out.println(name + " is barking");
    }
}

public class InheritanceExample {
    public static void main(String[] args) {
        // Create a Dog object
        Dog myDog = new Dog("Buddy", 3);

        // Access properties and methods of the superclass
        System.out.println("Name: " + myDog.name);
        System.out.println("Age: " + myDog.age);
        myDog.sleep(); // Method from superclass

        // Access methods specific to Dog
        myDog.bark();
    }
}
