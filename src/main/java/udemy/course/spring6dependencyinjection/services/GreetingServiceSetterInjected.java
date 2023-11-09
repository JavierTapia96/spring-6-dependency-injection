package udemy.course.spring6dependencyinjection.services;

import org.springframework.stereotype.Service;

/**
 * Created by Javier Tapia on 8/11/2023
 */
@Service("setterGreetingService")
public class GreetingServiceSetterInjected implements GreetingService{

    @Override
    public String sayGreeting() {
        return "Hey I'm Setting a Greeting";
    }
}
