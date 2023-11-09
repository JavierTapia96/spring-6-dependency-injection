package udemy.course.spring6dependencyinjection.controllers.i18n;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import udemy.course.spring6dependencyinjection.services.GreetingService;

/**
 * Created by Javier Tapia on 8/11/2023
 */
@Controller
public class Myi18NController {

    private final GreetingService greetingService;

    public Myi18NController(@Qualifier("i18nService") GreetingService greetingService) {
        this.greetingService = greetingService;
    }

    public String sayHello() {
        return greetingService.sayGreeting();
    }
}
