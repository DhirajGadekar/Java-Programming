/*
 Program 1 : Write a program in which students should enter marks of 5 different subjects. If all subject
	     having above passing marks add them and provide to switch case to print grades(first class
	     second class), if student get fail in any subject program should print “You failed in exam”
 */

import java.io.*;

class Result {

	public static void main(String[] agrs)throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		System.out.println("Enter Subject 1 mark");
		int sub1= Integer.parseInt(br.readLine());

		System.out.println("Enter Subject 2 mark");
		int sub2 = Integer.parseInt(br.readLine());

		System.out.println("Enter Subject 3 mark");
		int sub3 = Integer.parseInt(br.readLine());

		System.out.println("Enter Subject 4 mark");
		int sub4 = Integer.parseInt(br.readLine());

		System.out.println("Enter Subject 5 mark");
		int sub5 = Integer.parseInt(br.readLine());

		int total = (sub1+sub2+sub3+sub4+sub5);

		int percentage = (total * 100)/500;

		int num = 0;

		if(sub1 < 35 || sub2 < 35 || sub3 < 35 || sub4 < 35 || sub5 < 35){

			num = 0;
		}else if(percentage >= 35 && percentage <= 59 ){

			num = 1;
		}else if(percentage >= 60 && percentage <= 100){

			num = 2;
		}

		switch(num){

			case 1 :
				System.out.println("Second Class");
				break;
			case 2 :
				System.out.println("First Class");
				break;
			default :
				System.out.println("Fail");
				break;

		}


	}
}
