package com.learning;

import com.learning.Alien.Alien;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        //ApplicationContext is used to create spring container which will manage our beans
        //needed xml file as we are mentioning that we are managing our context container using xml file
        //and this xml file we have provided to the container containing information about the beans by the constructor argument
        // of the class ClassPathXmlApplicationContext

        ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
        // as the ApplicationContext is an interface the implementaion is provided by ClassPathXmlApplicationContext
        Alien a1 = (Alien) context.getBean("alien");
        a1.code();
    }
}
