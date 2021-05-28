package com.vidhansharma;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) {
        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
        Coach coach = context.getBean("footballCoach", Coach.class);
        System.out.println(coach.dailyWorkout());
    }
}
