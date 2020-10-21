package exercise2;

import java.util.Scanner;

public class QuadraticEquation{
  public static void main(String[] args){
    Scanner input = new Scanner(System.in);
    double a = input.nextInt();
    double b = input.nextInt();
    double c = input.nextInt();
    double x1 = 0;
    double x2 = 0;
    if(a!=0){
      double D = b*b - 4*a*c;
      if(D>=0){
       x1 = (-b + Math.sqrt(D))/2*a;
       x2 = (-b - Math.sqrt(D))/2*a;
        System.out.println(x1 + ", " + x2);
      } else{
        System.out.println("Imaginary values");
      }
    }else if(b!=0){
      x1 = (-c)/b;
      System.out.println("x: " + x1);
    } else if(c!=0){
      System.out.println("No values");
    } else{
      System.out.print("Many values");
    }
  }
}