/*
 Program 2 : Calculator
 */

import java.util.*;

class calculator{
	
	static void Add(int x,int y){

		int ans = x + y;
		System.out.println("Add = " + ans);
	}

	static void Sub(int x,int y){

		int ans = x - y;
		System.out.println("Add = " + ans);
	}

	static void Mult(int x,int y){

		int ans = x * y;
		System.out.println("Add = " + ans);
	}

	static void Div(int x,int y){

		int ans = x / y;
		System.out.println("Add = " + ans);
	}
	public static void main(String[] args){
		
		Scanner obj = new Scanner(System.in);

		System.out.println("Enter the Values : ");

		int x = obj.nextInt();
		int y = obj.nextInt();

		Add(x,y);
		Sub(x,y);
		Mult(x,y);
		Div(x,y);
	}
}
