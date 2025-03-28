package com.example.OskNie.Services;
import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Service;

import com.example.OskNie.Interfaces.HandlerServiceInterface;


@Service
public class FacadeService {
    private DevService devService;
    private ProdService prodService;
    private QaService qaService;
    private StagingService stagingService;

    private Map<String, HandlerServiceInterface> services = new HashMap<>();

    public FacadeService(DevService devService, ProdService prodService, QaService qaService, StagingService stagingService){
        this.devService = devService;
        this.prodService = prodService;
        this.qaService = qaService;

        services.put("dev", devService);
        services.put("qa", qaService);
        services.put("prod", prodService);
        services.put("staging", stagingService);
    }


    public void execute(String environment){
        environment = environment.toLowerCase();

        if(!services.containsKey(environment))
            throw new RuntimeException("Facade Service: Environment " + environment + " does not exist in actual context");

        System.out.println(services.get(environment).getWelcomeMessage());
    }

    public String getMessage(String environment){
        environment = environment.toLowerCase();

        if(!services.containsKey(environment))
        throw new RuntimeException("Facade Service: Environment " + environment + " does not exist in actual context");

        return services.get(environment).getWelcomeMessage();
    }


}
