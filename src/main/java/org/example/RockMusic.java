package org.example;

public class RockMusic implements Music {
    public  void doMyInit() {
        System.out.println("Doing my initialization");
    }

    public  void doMyDestroy() {
        System.out.println("i'm dead!");
    }
    @Override
    public String getSong() {
        return "Queen - We Will Rock You";
    }
}
