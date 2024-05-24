/*
 Create a class Car with attributes model, color, and year. Write a program to create an object of the class and display its attributes.
 */


public class Car {
  String model;
  String color;
  int year;
  public static void main(String[] args) {
    Car Tata = new Car();
    Tata.model = "Nexon";
    Tata.color = "Black";
    Tata.year = 2024;
    System.out.println(Tata.model + "" + Tata.color + "" + Tata.year);
  }
  
}
