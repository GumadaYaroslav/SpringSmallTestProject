package org.example;

import org.springframework.stereotype.Component;

@Component
public class ClassicMusic implements Music {
    public  void doMyInit() {
        System.out.println("Doing my initialization");
    }
    @Override
    public String getSong() {
        return "Рахманинов. Второй концерт для фортепьяно.";
    }
}
