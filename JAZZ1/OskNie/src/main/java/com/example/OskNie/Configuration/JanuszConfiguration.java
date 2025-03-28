package com.example.OskNie.Configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.example.OskNie.Data.Human;

@Configuration
public class JanuszConfiguration {
    @Bean("HumanBeing")
    public Human HumanBeing(){
        return new Human("Jarosław", "Kaczyński");
    }

    @Bean("DeafultData")
    public String[] DefaultData(){
        return new String[]{
            "Data1",
            "Data2",
            "Data3",
            "Data4",
            "Data5"
        };
    }
}
