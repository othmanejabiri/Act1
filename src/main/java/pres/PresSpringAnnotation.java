package pres;

import metier.Imetier;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class PresSpringAnnotation {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext("ext","metier");
        Imetier metier =  context.getBean(Imetier.class);
        System.out.println("RES="+metier.calcul());


    }
}