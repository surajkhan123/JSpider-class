package Encapsulation.SingleToneClass;

import java.util.Scanner;

class Bus{

  private static Bus n;
  private int totalSeat;

  static Scanner sc = new Scanner(System.in);

  private Bus(){
    totalSeat = 50;
  }

  public static Bus getObject(){
    if(n == null)
      n = new Bus();
    return n;
  }

  public void setBooking(int Seats){

    System.out.println("Total seats available: " + totalSeat);

    if(Seats > totalSeat)
      System.out.println("Seat Not Available");

    else{
      totalSeat = totalSeat - Seats;
      System.out.println(Seats + " seats are booked for you");
      System.out.println(totalSeat + " seats are currently available");
    }
  }

  class Reservation{

    public void reserveSeat(){

      System.out.println("How many Seats need for Book:");
      int noofSeats = sc.nextInt();

      Bus b = Bus.getObject();
      b.setBooking(noofSeats);
    }
  }
}

public class TicketBooking {

  public static void main(String[] args) {

    Bus b = Bus.getObject();

    Bus.Reservation p1 = b.new Reservation();
    p1.reserveSeat();

    Bus.Reservation p2 = b.new Reservation();
    p2.reserveSeat();
  }
}