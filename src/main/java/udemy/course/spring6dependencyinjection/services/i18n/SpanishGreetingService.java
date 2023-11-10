package udemy.course.spring6dependencyinjection.services.i18n;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;
import udemy.course.spring6dependencyinjection.services.GreetingService;

/**
 * Created by Javier Tapia on 8/11/2023
 */
@Profile("ES")
@Service("i18nService")
public class SpanishGreetingService implements GreetingService {

    @Override
    public String sayGreeting() {
        return "Hola Mundo - ES";
    }
}