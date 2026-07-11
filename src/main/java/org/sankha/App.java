package org.sankha;
import org.sankha.config.AppConfig;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */

public class App 
{
    public static void main( String[] args )
    {

//    ApplicationContext context=new ClassPathXmlApplicationContext("applicationContext.xml");
//    Dev dev=context.getBean(Dev.class);
////
//    dev.build();
//        Dekstop dsk=context.getBean("desktop",Dekstop.class);

ApplicationContext context=new AnnotationConfigApplicationContext(AppConfig.class);
Dekstop dt1=context.getBean(Dekstop.class);
dt1.compile();

Dev dev=context.getBean(Dev.class);
System.out.println(dev.getAge());
dev.build();

    }
}
