import java.util.Scanner;
public class EvenOrOdd {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the number : ");
    int number = sc.nextInt();
    if(number%2==0){
      System.out.println("The given number is an even number");
    }
    else{
      System.out.println("It is an odd number");
    }
  }
}
