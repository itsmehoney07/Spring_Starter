package com.learning;

import com.learning.Alien.Alien;
import com.learning.Laptop.Computer;
import com.learning.Laptop.Laptop;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.sql.SQLOutput;

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
        //and this xml file we have provided to the container containing information about the beans to the instance of ApplicationContext
        // created using class ClassPathXmlApplicationContext

        ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
        // as the ApplicationContext is an interface the implementaion is provided by ClassPathXmlApplicationContext
        Alien a1 = (Alien) context.getBean("alien");
        a1.code();
        Computer l1= (Computer) context.getBean("desktop");
        String data=l1.toString();
        System.out.println(data);
        l1.compile();
        String aliendetails=a1.toString();
        System.out.println(aliendetails);
    }
}
