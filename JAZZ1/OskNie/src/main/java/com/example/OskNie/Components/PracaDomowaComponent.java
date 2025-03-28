package com.example.OskNie.Components;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.stereotype.Component;

@Component
@ConditionalOnProperty(prefix = "my", name="bool_value", havingValue = "true")
public class PracaDomowaComponent {
    
    public PracaDomowaComponent(@Value("${my.bool_value:false}") boolean BoolValue){
        System.out.println("\nKomponent Istnieje, Boolean value: " + BoolValue);
    }
}
