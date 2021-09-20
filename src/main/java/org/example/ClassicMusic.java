package org.example;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
public class ClassicMusic implements Music {

    public  void doMyInit() {
        System.out.println("Doing my initialization");
    }

    public void doMyConstr()
    {
        System.out.println("kek");
    }
    @Override
    public String getSong() {
        return "Рахманинов. Второй концерт для фортепьяно.";
    }
}
