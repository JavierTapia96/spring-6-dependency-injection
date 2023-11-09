package udemy.course.spring6dependencyinjection;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import udemy.course.spring6dependencyinjection.controllers.MyController;

@SpringBootApplication
public class Spring6DependencyInjectionApplication {

    public static void main(String[] args) {
        ApplicationContext ctx = SpringApplication.run(Spring6DependencyInjectionApplication.class,
                                                       args);
        MyController controller = ctx.getBean(MyController.class);
        System.out.println("In Main Method");
        System.out.println(controller.sayHello());
    }

}
