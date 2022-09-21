package comp1000_pa1;
import.java.util.Scanner;
public class PA1a {
public static void main(String[] args) {
Scanner x = new Scanner (System.in);
int yards ;
int feet  ;
int inches ;

System.out.println("enter amount of yards");
yards = x.nextInt();

System.out.println("enter amount of feet");
feet = x.nextInt();

System.out.println("enter amount of inches");
inches = x.nextInt();

int sumInt = yards * 36;
System.out.println(sumInt + " inches");

int sumInt2 = feet * 12;
System.out.println(sumInt2 + " inches");

int sumInt3 = sumInt + sumInt2 + inches;
System.out.println(sumInt3 + " inches in total");
  
}
}
