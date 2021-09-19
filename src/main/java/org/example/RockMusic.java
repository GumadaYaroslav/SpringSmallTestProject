package org.example;

import org.springframework.stereotype.Component;

@Component
public class RockMusic implements Music {
    private RockMusic() {}

    public static RockMusic getRockMusic() {
        return new RockMusic();
    }

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
