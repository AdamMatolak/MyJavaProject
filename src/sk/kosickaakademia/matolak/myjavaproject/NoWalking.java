package sk.kosickaakademia.matolak.myjavaproject;

public interface NoWalking {
    public default void needToWalk(){
        System.out.println("I don't need to go for a walk, I'm just gonna sleep UwU");
    }
}
