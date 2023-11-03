package com.kotlin.tutorial.examples;

import java.util.stream.Stream;
import lombok.Data;

@Data
public class JavaTest {
  void printfromJava() {
    System.out.println("this is computed in Java");
  }






    public static void main(String[] args){

    System.out.println("Java  calling kotlin classes...");
    Vehicle car = new Car("Mercedes Benz", 300, "Medium Airbag");
    Vehicle airplane = new AirPlane("Boeing 747", 2);

    Stream.of(car, airplane).forEach(System.out::println);
  }
}
