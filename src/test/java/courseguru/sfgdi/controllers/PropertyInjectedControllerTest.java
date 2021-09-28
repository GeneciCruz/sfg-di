package courseguru.sfgdi.controllers;

import courseguru.sfgdi.services.ConstructorGreetingService;
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
        controller.greetingService = new ConstructorGreetingService();

    }
    @Test
    void getGreeting() {
        System.out.println(controller.getGreeting());
    }
}