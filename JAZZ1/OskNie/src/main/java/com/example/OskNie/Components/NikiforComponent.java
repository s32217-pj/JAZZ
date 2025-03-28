package com.example.OskNie.Components;

import org.springframework.stereotype.Component;

import com.example.OskNie.Data.Human;

@Component
public class NikiforComponent {
    private LeonComponent LeonComponent;
    private String[] DefaultD;
    private Human HumanB;

    public NikiforComponent(LeonComponent LeonComp, String[] DefaultData, Human HumanBeing){
        this.LeonComponent = LeonComp;
        this.DefaultD = DefaultData;
        this.HumanB = HumanBeing;
        PrintInitMessage();
    }

    public final void PrintInitMessage(){
        System.out.println("Initializing " + this.getClass().getSimpleName());

        System.out.println("Printing default data: ");
        for (String string : DefaultD)
            System.out.println(string);

        System.out.printf("Printing HumanBeing: Name: %s, Surname: %s", HumanB.getName(), HumanB.getSurname());
    }
}
