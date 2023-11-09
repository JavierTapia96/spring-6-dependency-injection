package udemy.course.spring6dependencyinjection.controllers;

import org.springframework.stereotype.Controller;
import udemy.course.spring6dependencyinjection.services.EnvironmentService;

/**
 * Created by Javier Tapia on 8/11/2023
 */
@Controller
public class EnvironmentController {

    private final EnvironmentService environmentService;

    public EnvironmentController(EnvironmentService environmentService) {
        this.environmentService = environmentService;
    }

    public String getEnvironment() {
        return "You are in " + environmentService.getEnvironment() + " environment";
    }
}
