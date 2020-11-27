package sk.kosickaakademia.matolak.myjavaproject;

public interface Walking {
    public default void needToWalk(){
        System.out.println("I need to go out for the walk ;(");
    }

}
