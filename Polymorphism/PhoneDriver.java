// package com.Polymorphism;
// package Polymorphism;

@FunctionalInterface
interface Sim{
  void connect();
}
class Phone{
  Sim s; //Has-a
  public Phone(Sim s){
  this.s = s;
}
public void call(){
  s.connect();
}
}

class Airtel implements Sim{
  @Override
  public void connect(){
    System.out.println("Call Connect by Airtel");
  }
}
class Jio implements Sim{
  @Override
  public void connect(){
    System.out.println("Call Connect by Jio");
  }
}

class VI implements Sim{
  @Override
  public void connect(){
    System.out.println("Call Connect by VI");
  }
}


public class PhoneDriver {
  public static void main(String[] args) {
    Phone p1 = new Phone(new Airtel());
    p1.call();
    Phone p2 = new Phone(new Jio());
    p2.call();
    Phone p3 = new Phone(new VI());
    p3.call();
    Phone p4= new Phone(()-> System.out.println("Call Connect by BSNL")); // Lambda Expression
    p4.call();

  }
}