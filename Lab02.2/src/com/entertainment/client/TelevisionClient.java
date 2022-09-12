package com.entertainment.client;

public class TelevisionClient {

  public static void main(String[] args) {
    Television tv1 = new Television();
    tv1.setBrand("Samsung");
    tv1.setVolume(125);


    Television tv2 = new Television("sony",50);


    tv1.turnOn();
    tv1.turnOff();
    System.out.println();
    System.out.printf("%d television instances created%n", Television.getInstanceCount());



    tv2.turnOn();
    tv2.turnOff();

    System.out.printf("%d television instances created%n", Television.getInstanceCount());

    System.out.println(tv1.toString());
    System.out.println(tv1);


    System.out.println(tv2);

    Television tv3 = new Television("LG",55);

    System.out.println(tv3);
    System.out.printf("%d television instances created%n", Television.getInstanceCount());




 }


}
