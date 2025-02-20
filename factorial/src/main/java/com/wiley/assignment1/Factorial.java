package com.wiley.assignment1;

import java.io.InputStream;
import java.io.PrintStream;
import java.util.Scanner;


public class Factorial {
	
	 private Scanner scanner;
	 private PrintStream printStream;
	 private int num;
	 

	 public Factorial(InputStream inputStream, PrintStream printStream) {
	      this.scanner = new Scanner(inputStream);
	      this.printStream = printStream;
	 }
	 
	 public int isInputNumberValid()  {

		//YOUR CODE STARTS HERE

		 try{
			 this.num = Integer.parseInt(this.scanner.nextLine().trim());
		 }catch(NumberFormatException e){
			 //if unable to convert the input to an int (ex: 147 ?)
			 this.printStream.print("Invalid entry. Please enter an integer between 1 and 10, inclusive.");
			 return -1;   // Will exit in calculateFactorial()
		 }

		 if (num>0 && num<=10){
			 this.printStream.print(num+" is a valid entry. ");
			 return num;
		 } else{
			 this.printStream.print("Invalid entry. Please enter an integer between 1 and 10, inclusive.");
			 return -1;
		 }

		//YOUR CODE ENDS HERE
		 
			
	 }
	
	 
	 private void calculateFactorial(int num) {
		

		int result = 1;
		//YOUR CODE STARTS HERE

 		while (num>1){
			 //factorial calculation num*(num-1)*(num-2)...
			 result*=num;
			 num--;
		}

		//YOUR CODE ENDS HERE
		this.printStream.print("The Factorial is: " + result);		
		
	 }
	 
	 public void calculateFactorial() {
		 /*
		 Do not change this method.
		 */
		 	
		 int input = this.isInputNumberValid();
		 if(input != -1)
		 {
			 calculateFactorial(input);
		 }
		 
	 }
	

	 public static void main(String[] args) { 
		/*
		 Do not change this method.
		 */
		Factorial fact = new Factorial(System.in,System.out);
		System.out.println("Enter an integer between 1 and 10, inclusive.");
		fact.calculateFactorial();	
	 }

	
}
