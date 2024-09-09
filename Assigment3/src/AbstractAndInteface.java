
abstract class Animal {
    public abstract void sound();
    public void sleep() {
        System.out.println("Animal is sleeping...");
    }
}

interface Movable {
    void move();
}

class Dog extends Animal implements Movable {
    @Override
    public void sound() {
        System.out.println("Dog barks");
    }

    @Override
    public void move() {
        System.out.println("Dog runs");
    }
}

class Bird extends Animal implements Movable {
    @Override
    public void sound() {
        System.out.println("Bird chirps");
    }

    @Override
    public void move() {
        System.out.println("Bird flies");
    }
}

public class AbstractAndInteface {
    public static void main(String[] args) {
        //Abstract class methods
        Animal myDog = new Dog();
        Animal myBird = new Bird();

        myDog.sound();
        myDog.sleep();
        myBird.sound();
        myBird.sleep();

        // interface methods
        Movable dogMovable = new Dog();
        Movable birdMovable = new Bird();

        dogMovable.move();
        birdMovable.move();
    }
}
