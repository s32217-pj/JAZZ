package com.example.OskNie.Components;

import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Component;

import com.example.OskNie.Configuration.DBConfiguration;

@Component
public class MateuszComponent {
    private ApplicationContext AppCtx;
    private DBConfiguration Config;

    public MateuszComponent(ApplicationContext AppCtx, DBConfiguration Cfg){
        this.AppCtx = AppCtx;
        this.Config=Cfg;
        
        LeonComponent LC = AppCtx.getBean("leonComponent",LeonComponent.class);
        NikiforComponent NC = AppCtx.getBean("nikiforComponent",NikiforComponent.class);
        
        //for (String name  : AppCtx.getBeanDefinitionNames()) {
            //  System.out.print(name);
            //}
            
        LC.PrintInitMessage();
        NC.PrintInitMessage();
        PrintInitMessage();
    }

    public final void PrintInitMessage(){
        System.out.println("Initializing " + this.getClass().getSimpleName());
        System.out.printf("\n\nDatabase login:\nLogin-Url: %s\nUsername: %s\nPassword: %s\n\n", Config.getLoginUrl(), Config.getCredentials().getUser(), Config.getCredentials().getPassword());
    }
}