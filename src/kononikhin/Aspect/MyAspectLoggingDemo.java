package kononikhin.Aspect;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class MyAspectLoggingDemo {

    @Before("execution(* add*(kononikhin.Entity.Account,..))")
    public void beforeExecution(){
        System.out.println("=>>>>>> Before execution addAccount() <<<<<<=");
    }
}
