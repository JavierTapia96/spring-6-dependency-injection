package udemy.course.spring6dependencyinjection.controllers;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.BeanFactoryAware;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Component;

/**
 * Created by Javier Tapia on 9/11/2023
 */
@Component
public class LifeCycleDemoBean implements InitializingBean, DisposableBean, BeanNameAware,
    BeanFactoryAware, ApplicationContextAware, BeanPostProcessor {

    public LifeCycleDemoBean() {
        System.out.println("## I'm in the LifeCycleBean Constructor");
    }

    @Value("${java.specification.version}")
    public void setJavaVer(String javaVer) {
        System.out.println("## 1 Java version: " + javaVer);
    }

    @Override
    public void setBeanFactory(BeanFactory beanFactory) throws BeansException {
        System.out.println("## 3 Bean Factory has been set");
    }

    @Override
    public void setBeanName(String name) {
        System.out.println("## 2 My Bean Name is: " + name);
    }

    @PostConstruct
    public void postConstruct() {
        System.out.println("## 5 The Post Construct annotated method has been called");
    }

    @Override
    public void destroy() throws Exception {
        System.out.println("## 8 The LifeCycleBean has been terminated");
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("## 6 The LifeCycleBean has its properties set");
    }

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        System.out.println("## 4 Application context has been set");
    }

    @PreDestroy
    public void preDestroy() {
        System.out.println("## 7 The Pre-destroy annotated method has been called");
    }

    @Override
    public Object postProcessBeforeInitialization(Object bean, String beanName)
        throws BeansException {
        System.out.println("## 9 Before initialization - " + beanName);
        if (bean instanceof LifeCycleDemoBean) {
            System.out.println("## 9.1 Before initialization - " + beanName);
            ((LifeCycleDemoBean) bean).beforeInit();
        }
        return BeanPostProcessor.super.postProcessBeforeInitialization(bean, beanName);
    }

    @Override
    public Object postProcessAfterInitialization(Object bean, String beanName)
        throws BeansException {
        System.out.println("## 10 After initialization - " + beanName);
        if (bean instanceof LifeCycleDemoBean) {
            System.out.println("## 10.1 After initialization - " + beanName);
            ((LifeCycleDemoBean) bean).afterInit();
        }
        return BeanPostProcessor.super.postProcessAfterInitialization(bean, beanName);
    }

    public void beforeInit() {
        System.out.println("## 11 - Before Init - Called by Bean Post Processor");
    }

    public void afterInit() {
        System.out.println("## 12 - After Init - Called by Bean Post Processor");
    }
}
