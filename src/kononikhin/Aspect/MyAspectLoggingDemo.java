package kononikhin.Aspect;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Aspect
@Component
@Order(10)
public class MyAspectLoggingDemo {

//    @Before("execution(* kononikhin.DAO.*.*(..))")
//    public void beforeExecution(){
//        System.out.println("=>>>>>> Before execution addAccount() <<<<<<=");
//    }

    @Before("kononikhin.Aspect.AOPExressions.excludeGettersAndSetters()")
    public void beforeExecution(){
        System.out.println("=>>>>>> Before execution addAccount() <<<<<<=");
    }



}
