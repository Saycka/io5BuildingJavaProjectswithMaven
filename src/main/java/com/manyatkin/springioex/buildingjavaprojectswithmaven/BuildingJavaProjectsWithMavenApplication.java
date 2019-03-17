package com.manyatkin.springioex.buildingjavaprojectswithmaven;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import org.joda.time.LocalTime;

//@SpringBootApplication
public class BuildingJavaProjectsWithMavenApplication {

    public static void main(String[] args) {
//        SpringApplication.run(BuildingJavaProjectsWithMavenApplication.class, args);
        LocalTime currentTime = new LocalTime();
        System.out.println("Current time:" + currentTime);
        Greeter greeter = new Greeter();
        System.out.println(greeter.sayHello());
    }

}
