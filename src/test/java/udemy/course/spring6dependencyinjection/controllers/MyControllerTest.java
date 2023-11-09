package udemy.course.spring6dependencyinjection.controllers;

import org.junit.jupiter.api.Test;

/**
 * Created by Javier Tapia on 8/11/2023
 */
class MyControllerTest {

    @Test
    void sayHello() {
        MyController myController = new MyController();
        System.out.println(myController.sayHello());
    }
}