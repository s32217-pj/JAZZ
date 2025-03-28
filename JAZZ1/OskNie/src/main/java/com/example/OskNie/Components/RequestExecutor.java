package com.example.OskNie.Components;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import com.example.OskNie.Services.FacadeService;

@Component
public class RequestExecutor {
    private FacadeService faService;
    private String environment;

    public RequestExecutor(FacadeService faService, @Value("${app.environment:#{'dev'}}")String environment){
        this.faService = faService;
        this.environment = environment;                
        faService.execute(environment);
    }

    public void execute(){
        faService.execute(environment);
    }

    public String getWelcomeMessage(){
        return faService.getMessage(environment);
    }
}
