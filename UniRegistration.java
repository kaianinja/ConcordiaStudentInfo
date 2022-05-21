// -------------------------------------------------------
// Assignment #2
// Written by: Cleopatr-Aliak Manoukian 40211001
// For COMP 248 Section ECDX-LAB � Fall 2021
// --------------------------------------------------------
import java.util.Scanner;
import java.lang.Math;
public class UniRegistration
//start of class
{ 
	/*--------------------------------------------------------------------------------------------------------------
	 * This program welcomes back new Concordia student and collects information on new Concordia students.After 
	 * determining if the student is new, the program asks the new student their full name, their date of birth, 
	 * their department and weither they have taken the vaccine or not. The program then generates a 7 digit student
	 * ID for the student. It then shows an ending message stating that the student is registered succesfully and
	 * gives them their randomly generated student ID. IF the student has not taken the vaccine, the program 
	 * encourages them to get it soon. Finally, the program thanks the user for using the program.
	 ---------------------------------------------------------------------------------------------------------------*/
	
	
	//Following method from provided site to create a method to generate a random integer within a specified range.
	int randomWithRange(int min, int max)
	{

	    int range = (max - min) + 1;     
	    return (int)(Math.random() * range) + min;
	}
	
	public static void main(String[] args)
	{
		//Declaring variables
		String Answer, fullName,fullName1,fullName2,lastName,firstName, dofBirth, vaccine,dep;
		int numComma, setter;
		
		
		//Creating object for class
		question1 obj1 = new question1();
		
		
		//Declaring Scanner
		Scanner KeyIn= new Scanner(System.in) ;
		
		
		//Welcome message
		System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
		System.out.println("\t     Welcome to Concordia University!");
		System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
		
		
		
		//Initial value of setter
		setter=0;
		
		//Start of while loop to control validity of answer
		while (setter==0)
			
		//start of while loop
		{
			System.out.print("\nAre you a new coming student at Concordia?(yes or no)");
			
			//Assigning Answer to user input
			Answer = KeyIn.next();
			
			//if statement stating what will be executed if the answer is no
			if (Answer.compareToIgnoreCase("NO")==0)
				
			//start of if statement
			{
				System.out.println("\nWelcome Back! Hope you have a great semester!");
				setter++;
				
			}//end of if statement
			else if (Answer.compareToIgnoreCase("YES")==0)
				
			//Start of else if statement
			{
				//Newline
				System.out.println(" ");
				System.out.print("Please enter your last name, then your first name.(Seperated by a comma)");
				
				//Collecting user input
				fullName= KeyIn.next();
				
				//Erasing all spaces int the provided string.
				fullName1=fullName.replaceAll(" ","");
				
				//Identifying position of the comma
				numComma= fullName1.indexOf(",");
				
				//isolating last name
				lastName= fullName1.substring(0,numComma);
				
				//isolating first name
				firstName= fullName1.substring(numComma+1);
				
				//Assigning fullName2 the full name with the first letter of the first and last name upper case and the rest of the letters lower case.
				fullName2 = firstName.substring(0,1).toUpperCase()+firstName.substring(1).toLowerCase()+" "+lastName.substring(0,1).toUpperCase()+lastName.substring(1).toLowerCase();
				System.out.print("Please enter your date of birth(YYYY-MM-DD):");
				
				//The value of Birth date is stored, but not used in this program. We are assuming the user is perfect and writes the date as asked above.
				dofBirth = KeyIn.next();
				while(true)
				{
					System.out.print("Do you have your Covid-19 vaccine passport?(true or false)");
					vaccine= KeyIn.next();
					//Making sure the user enters true or false.
					if (vaccine.compareToIgnoreCase("TRUE")==0 || vaccine.compareToIgnoreCase("FALSE")==0)
						break;
					else
						System.out.println("Sorry. Your input is invalid. Please try again.");
				}
				System.out.print("Please enter your department:");
				dep=KeyIn.next();
				System.out.println("Congratulations "+fullName2+"! You have succesfully registered at Concordia University");
				int rand = obj1.randomWithRange(1111111,9999999);
				System.out.println("Your student ID is: "+rand);
				if(vaccine.compareToIgnoreCase("FALSE")==0)
					System.out.println("Hope you will get your vaccine soon!");
				setter++;
				
				
				
			}//end of else if statement
			else
				System.out.println("Please enter a valid answer.");
			
		} //end of while loop
		//Closing Scanner
		KeyIn.close();
		
		//Closing message
		System.out.print("Thank you for using our program!");

	
	
	}//end of main

}//end of class
