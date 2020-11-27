package sk.kosickaakademia.matolak.myjavaproject;

public class Dog extends Animal implements Walking{
    public Dog(int size, int age) {
        super(size, age);
    }

    @Override
    public void iAmAnimal() {
        System.out.printf("I like to catch the ball");
    }

    @Override
    public void needToWalk() {

    }
}
