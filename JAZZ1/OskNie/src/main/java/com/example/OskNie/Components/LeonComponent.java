package com.example.OskNie.Components;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class LeonComponent {

    public LeonComponent(@Value("${my.custom_property: #{'There was no default value'}}") String CustomProperty){
        PrintInitMessage();
        System.out.println("Custom property value: " + CustomProperty);
    }

    public final void PrintInitMessage(){
        System.out.println("Initializing " + this.getClass().getSimpleName());
    }
}
