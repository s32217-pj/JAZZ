package com.example.OskNie.Services;

import org.springframework.stereotype.Service;

import com.example.OskNie.Interfaces.HandlerServiceInterface;

@Service
public class QaService implements HandlerServiceInterface {

    @Override
    public String getWelcomeMessage() {
        return "Welcome from QaService";
    }
    
}
