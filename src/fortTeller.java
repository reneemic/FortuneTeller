import java.util.Scanner;

public class fortTeller {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
     Scanner input = new Scanner(System.in);
	
     //Introduction
	 System.out.println("I am Madame Strange");
	 System.out.println("Give me a little information about yourself");
	 System.out.println("and I will tell you what the future holds");
	
	 
	 //User Input for first name
	 System.out.println("Please tell me your first name");
	 String responseFirstname = input.nextLine();
	 
	 // User input for last name
	 System.out.println("Please tell me your last name");
	 String responseLastname = input.nextLine();
	 
	 //Concatination for personalized greeting
	 System.out.println("Hello " + responseFirstname   +  " "  +   responseLastname);
	 System.out.println("Very nice to meet you");
	 
	 System.out.println("Madame Strange needs more information to do you fortune");
	 
	 //Used While Loop to get print help option.  
	 //If/Else statement with String = Car to provide export information for fortune
	 String responseColor;
	 do {
		   System.out.println("What is your favorite ROYGBIV color?.");
		   System.out.println("Type \"help\" to list options.");
		   responseColor = input.nextLine();
		   if(responseColor.toLowerCase().equals("help")) {
		   System.out.println("Options: red, orange, yellow, green, blue, indigo, violet");
		   }
		 } while(responseColor.equals("help"));
		   
	 
	  String car = (""); {
	   } if (responseColor.toLowerCase().equals("red")) {
	    car = "a Yugo";
	   } else if (responseColor.toLowerCase().equals("orange")){
	    car = "public transportation";
	   } else if (responseColor.toLowerCase().equals("yellow")) {
	    car = "a VW bus";
	   } else if (responseColor.toLowerCase().equals("green")) {
	     car = "a Lamborghini";
	   } else if (responseColor.toLowerCase().equals("blue")) {
	     car = "a Mitsubishi Eclipse";
	   } else if (responseColor.toLowerCase().equals("indigo")){
         car = "a rusty bicycle";
       } else if (responseColor.toLowerCase().equals("violet")){
         car = "a 1977 Chrysler LeBaron";
	   }
	 
	 //boolean with if/else modulus to determine output
	 System.out.println("So how old are you?");
	 int responseAge = input.nextInt();
	 int retirementYrs;
	 boolean isEven = (responseAge % 2) == 0;
	 if (isEven) {
	 retirementYrs = 31;
	 }
	 else{
	 retirementYrs = 200;
        }
	
	//Birth Month I used a Multi case switch to determine bank balance 
	 System.out.println("Please enter your birth month in number format. For example, April would be entered as 4");
	 int responseMonth = input.nextInt();
	 String balance = (""); {
	 switch (responseMonth) {
	 case 1: case 2: case 3: case 4: 
		 balance = "$15000.04"; 
     break;		 
	 case 5: case 6: case 7: case 8:
		 balance = "$-858.18";
		 break;
	 case 9: case 10: case 11: case 12: 
		 balance = "$158.18";
		 break;
	 }
			 
	 //if/else statement for Siblings to determine retirement place
	 System.out.println("How many siblings do you have?");
	 int responseSiblings = input.nextInt();
	 String place = ("");{
	 if (responseSiblings == 0) {
	 place = "in Kabul, Afghanistan";
	 } else if (responseSiblings == 1) {
		place = " in New Delhi, India";
	}else if (responseSiblings == 2) {
	 place = "in Ann Arbor, MI";
	}else if (responseSiblings == 3) {
		place = "Atlantis";
	} else if (responseSiblings > 3) {
		place = "a Private Island off the coast of Fiji";
		 
	}
	
	 
	 	 
	
     System.out.println(responseFirstname  + " " +  responseLastname +  " you will retire in "  + retirementYrs + " years "  +  " with "  + balance + " in the bank " +
     			" ,a vacation home "  +  place  + " and use  " + car + " to get around.");
	
	 }
	 }
	 }
	 }



	


	
	 
	
       
	
	 
	
	
	 
	 
	 