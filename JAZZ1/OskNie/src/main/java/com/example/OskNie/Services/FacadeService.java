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

    private Map<String, HandlerServiceInterface> services = new HashMap<>();

    public FacadeService(DevService devService, ProdService prodService, QaService qaService){
        this.devService = devService;
        this.prodService = prodService;
        this.qaService = qaService;

        services.put("dev", devService);
        services.put("qa", qaService);
        services.put("prod", prodService);
    }


    public void execute(String environment){
        System.out.println(services.get(environment).getWelcomeMessage());
    }


}
