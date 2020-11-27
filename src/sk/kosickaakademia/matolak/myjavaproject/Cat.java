package sk.kosickaakademia.matolak.myjavaproject;

public class Cat extends Animal {
    public Cat(int size, int age) {
        super(size, age);
    }

    @Override
    public void iAmAnimal() {
        System.out.println("I like to do nothin all day long.");
    }
}
