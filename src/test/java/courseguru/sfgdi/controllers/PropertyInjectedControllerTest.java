package courseguru.sfgdi.controllers;

import courseguru.sfgdi.services.GreetingServiceImpl;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class PropertyInjectedControllerTest {

    //It takes the property injected controller object
    PropertyInjectedController controller;

    //Configure method needed
    @BeforeEach
    void setUp(){
        //Set the test condition
        controller = new PropertyInjectedController();
        controller.greetingService = new GreetingServiceImpl();

    }
    @Test
    void getGreeting() {
        System.out.println(controller.getGreeting());
    }
}