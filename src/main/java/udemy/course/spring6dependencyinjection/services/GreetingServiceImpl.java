package udemy.course.spring6dependencyinjection.services;

import org.springframework.stereotype.Service;

/**
 * Created by Javier Tapia on 8/11/2023
 */
@Service
public class GreetingServiceImpl implements GreetingService {

    @Override
    public String sayGreeting() {
        return "Hello Everyone From Base Service!";
    }
}
