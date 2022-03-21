package com.coderscampus.objects;

import java.util.Scanner;

public class userInputs {
	
	//instance variable
	private Integer number;
	
	public void inputNumber()
	{
		//Scanner class
		System.out.println("Type a number between 50 and 300");
		Scanner input = new Scanner(System.in);
		Integer value = input.nextInt();
		if(value < 50 || value > 300)
		{
			value = null;
		}else {
			this.number = value;
		}	
		
		//close the scanner object
		input.close();
	}

}
