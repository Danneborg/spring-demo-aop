package kononikhin.Aspect;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class MyAspectLoggingDemo {

    @Before("execution(* kononikhin.DAO.*.*(..))")
    public void beforeExecution(){
        System.out.println("=>>>>>> Before execution addAccount() <<<<<<=");
    }
}
