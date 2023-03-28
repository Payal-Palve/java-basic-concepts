package javafullstack;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Switch_case {

	public static void main(String[] args) throws NumberFormatException, IOException {
		InputStreamReader ins=new InputStreamReader(System.in);
		BufferedReader br=new BufferedReader(ins);
		System.out.println("enter a number 1 to 7");
		int choice = Integer.parseInt(br.readLine());
		
		switch(choice)
		{
		case 1:System.out.println("Monday");
		      break;
		case 2:System.out.println("Tuesday");
	          break;
		case 3:System.out.println("Wednesday");
	          break;
		case 4:System.out.println("Thursday");
	          break;
		case 5:System.out.println("Friday");
	          break;
		case 6:System.out.println("Saturday");
	          break;
		case 7:System.out.println("Sunday");
	          break;
		default:System.out.println("wrong input");
		}
	}

}
