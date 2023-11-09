package udemy.course.spring6dependencyinjection.services;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

/**
 * Created by Javier Tapia on 8/11/2023
 */
@Profile("uat")
@Service
public class EnvironmentServiceUat implements EnvironmentService {

    @Override
    public String getEnvironment() {
        return "uat";
    }
}
