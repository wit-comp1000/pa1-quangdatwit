package comp1000_pa1;
import.java.util.Scanner;
public class PA1b {
	public static void main(String[] args) {
		// your code here
		Scanner x = new Scanner (System.in);
	int start ;
	
	System.out.println("enter starting amout of inches here");
    start = x.nextInt();
    int sumInt = start / 36;
    System.out.println(sumInt + " yard/s");
    int sumInt2 = start % 36;
    System.out.println(sumInt2 + " remaining inches");
    
    int sumInt3 = sumInt2 / 12;
    System.out.println(sumInt3 + " foot/feet");
    
    int sumInt4 = sumInt2 % 12;
    System.out.println(sumInt4 + " remaining inch/inches");		
	}

}
