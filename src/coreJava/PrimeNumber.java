package coreJava;

import java.util.Scanner;

public class PrimeNumber {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);  
	    System.out.print("Enter a number : ");  
	    int num = s.nextInt();  
		s.close();
		boolean flag = false;
		for(int i=2; i<=num/2; i++){
			if(num%2 == 0)
			{
			flag = true;
			}
		}
		
		if(!flag){
			System.out.println(num + "is a prime number");
		}
		else
			System.out.println(num + "is not prime number");
		}
	}


