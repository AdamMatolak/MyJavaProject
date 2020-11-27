package sk.kosickaakademia.matolak.myjavaproject;

public class Animal {
    private int size;
    private int age;
    public Animal(int size, int age){
        this.size=size;
        this.age=age;
    }
    public int getSize() {
        return size;
    }
    public void setSize(int size) {
        this.size = size;
    }
    public int isAge() {
        return age;
    }
    public void setProtection(boolean protection) {
        this.age = age;
    }
    public void iAmAnimal(){
        System.out.println("Yes, I´m an animal...");
    }
}
