package com.example.OskNie.Services;

import com.example.OskNie.Interfaces.HandlerServiceInterface;

public class StagingService implements HandlerServiceInterface {

    @Override
    public String getWelcomeMessage() {
        return "Welcome from staging service";
    }
    
}
