package courseguru.sfgdi.controllers;

import courseguru.sfgdi.services.GreetingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class PropertyInjectedController {

    //This hold any existing service
    @Autowired
    public GreetingService greetingService;

    //implement the method
    public  String getGreeting(){

        return greetingService.sayGreeting();
    }
}
