package udemy.course.spring6dependencyinjection.controllers;

import org.springframework.stereotype.Controller;
import udemy.course.spring6dependencyinjection.services.GreetingService;
import udemy.course.spring6dependencyinjection.services.GreetingServiceImpl;

/**
 * Created by Javier Tapia on 8/11/2023
 */
@Controller
public class MyController {

    private final GreetingService greetingService;

    public MyController() {
        this.greetingService = new GreetingServiceImpl();
    }

    public String sayHello() {
        System.out.println("I'm in the controller");
        return greetingService.sayGreeting();
    }
}
