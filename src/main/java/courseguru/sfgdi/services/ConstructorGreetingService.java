package courseguru.sfgdi.services;


import org.springframework.stereotype.Service;

@Service
public class ConstructorGreetingService implements GreetingService {

    public String sayGreeting() {

        return "Hello World! - Constructor";
    }
}
