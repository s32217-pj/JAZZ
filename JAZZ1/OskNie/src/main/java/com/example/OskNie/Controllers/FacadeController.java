package com.example.OskNie.Controllers;
import org.springframework.web.bind.annotation.RestController;

import com.example.OskNie.Components.RequestExecutor;
import org.springframework.web.bind.annotation.GetMapping;

@RestController
public class FacadeController {
    private RequestExecutor requestExecutor;

    public FacadeController(RequestExecutor rService){
        this.requestExecutor = rService;
    }

    @GetMapping("/")
    public String getFacadeServiceStatus()
    {
        return requestExecutor.getWelcomeMessage();
    }
    
}
