import java.util.Scanner;

public class fortTeller {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

     Scanner input = new Scanner(System.in);
     
     //Introduction
	 System.out.println("Welcome to the Fortune Teller App");
	 System.out.println("Are you ready to learn what your future holds?");
	 
	 //User Input - Need exception if integers are used
	 System.out.println("Please tell me your first name");
	 String responseFirstname = input.nextLine();
	 System.out.println("Hello " + responseFirstname);
	  
	 //Need a way to put name in the sentence with proper spacing
	 System.out.println("Please tell me your last name");
	 String responseLastname = input.nextLine();
	 System.out.println("Very nice to meet you");
	 
	 //Age, month, color, siblings input //Need to make word answers only accept letters
	 //Need number inputs to only accept numbers
	 System.out.println("Now that we know each other a little better, I have a few more questions for you");
	 System.out.println("So how old are you?");
	 String responseAge = input.nextLine();
	 
	 System.out.println("Please enter your birth month in number format/n For example, April would be entered as 4");
	 String responseMonth = input.nextLine();
	
	 //While loop for ROYGBIV
	 	 String responseColor = ();
	 do {
	 System.out.println ("What is your favorite ROYGBIV color?");
     System.out.println ("Type \"Help\" for a list of colors.");
	 if (responseColor.equals("help")){
	   System.out.println("Please pick one: Red, Orange, Yellow, Green, Blue, Indigo, Violet");  
	 }
	 } while(responseColor.equals("help"));
	 input.close();
	 
	 System.out.println("How many siblings do you have?");
	 String responseSiblings = input.nextLine();
	 //need if statement for number of siblings
	 // need conditionals for all the items above
	 
	 System.out.println("Are you ready for your fortune?");
	 }
	 }
	 
	 
	 //Need:
	 //Switches and statement below to print
	  //*[First Name]* *[Last Name}* will retire in *[# of years]* with * [bank balance]* in the bank,
	 //a vacation home in *location, and travel by *[mode of transportation]*
	 