/* Shwing the working of class and object with the help of constructors */

// Creating anew class named Car2
class Main {

  // Giving attributes to the class named model, color and year

  String model;
  String color;
  int year;

  // Creating a constructor

  public Main(String model, String color, int year){
    // initializing the values of the atrributes 
    this.model = model;
    this.color = color;
    this.year = year;
  }
  // now creating a method to display the values of attributes 
  public void display(){
    System.out.println("Model name = " + model);
    System.out.println("Color name = " + color);
    System.out.println("Year of purchase is = " + year);
    
  }

  public class Car2{
    public static void main(String[] args) {
      Main Tata = new Main("Nexon", "Black", 2024);
      Tata.display();
    }
  }

}
