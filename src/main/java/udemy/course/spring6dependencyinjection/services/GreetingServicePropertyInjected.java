package udemy.course.spring6dependencyinjection.services;

import org.springframework.stereotype.Service;

/**
 * Created by Javier Tapia on 8/11/2023
 */
@Service("propertyGreetingService")
public class GreetingServicePropertyInjected implements GreetingService {

    @Override
    public String sayGreeting() {
        return "Friends don't let friends use Property Injection";
    }
}
