import java.util.Scanner;

public class RecursiveMethod
{
	public static void main(String args[]){
        Scanner scnr = new Scanner(System.in); 
		
        System.out.println("Please enter the factorial to calculate (integer): ");
        int factorialNum = scnr.nextInt();
		long answer = factorial(factorialNum);
        System.out.println(factorialNum + " Factorial = " + answer);
	}

	
	public static long factorial(int num){
		if(num == 0)
			return 1;
		else
			return num*(factorial(num - 1));
	}

}