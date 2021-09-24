package courseguru.sfgdi.controllers;

import courseguru.sfgdi.services.GreetingService;

public class PropertyInjectedController {

    //This hold any existing service
    public GreetingService greetingService;

    //implement the method
    public  String getGreeting(){

        return greetingService.sayGreeting();
    }
}
