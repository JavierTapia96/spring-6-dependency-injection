package udemy.course.spring6dependencyinjection.services;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

/**
 * Created by Javier Tapia on 8/11/2023
 */
@Profile({"dev", "default"})
@Service
public class EnvironmentServiceDev implements EnvironmentService {

    @Override
    public String getEnvironment() {
        return "dev";
    }
}
