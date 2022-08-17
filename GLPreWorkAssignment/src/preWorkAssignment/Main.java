package preWorkAssignment;
import java.util.Scanner;
public class Main {

	//Find palindrome of the number
	public void checkPalindrome(int input) {
	//initialization
	int r;//remainder
	int s=0;
	int t=input;
	while(input>0) {
		r=input%10;
		input=input/10;
		s=s*10+r;
 	               }
	   if(t==s) {
		   System.out.println("The entered number is Palindrome");
	   }
	   else {
		   System.out.println("The entered number is not palindrome");
	        }
	   System.out.println(" ");
	}
	
	//Print Pattern for a given no.
	public void printPattern(int userInput) {
	
		for(int i=0; i<userInput; i++){
			for(int j=i;j<userInput;j++) {
			System.out.print("*");
			}
		System.out.println();
		}
		System.out.println();
	}
	
	
	//Check whether the no is a  prime number
	public void checkPrimeNumber(int userValue) {
		int count=0;
		for (int i=1; i<=userValue; i++) {
             if(userValue%i==0) {
            	count++;
             }
		 }              
                    if(count>2) {
            		System.out.println("The entered number " +" " + userValue +" " + "is not  a prime number");
            	           }
                                
                  else if(count <=2 ) {
                	System.out.println("The entered number " +" " + userValue +" " + "is  a prime number");
                                      }
                   System.out.println();
	} 

	//Print Fibonacci series of size n with first two numbers as 0, 1
	public void printFibonacciSeries(int inputValue) {
		int n1=0;
		int n2=1;
		int n3;
		
		System.out.print(n1);
		System.out.print(" ");
		System.out.print(n2);
		
		for(int i=0; i<inputValue;i++)
		{
			n3=n1+n2;
			System.out.print(" "+n3);	
			n1=n2;
			n2=n3;			
		}
		System.out.println();	
		System.out.println();	
	}
	
	//Main Method
	public static void main(String[] args) {
		//object created
		 Main obj = new Main();

         int choice;
         Scanner sc = new Scanner(System.in);
        
         
         do {

        	 System.out.println("Enter your choice from below list.\n" +
        	                    "1. Find palindrome of number.\n"+ 
        			            "2. Print Pattern for a given no.\n" +
        	                    "3. Check whether the no is a  prime number.\n"+ 
        			            "4. Print Fibonacci series.\n" + 
        	                     "--> Enter 0 to Exit.\n");
        	 System.out.println();
        	 
        	 choice = sc.nextInt();
        	
        	 
        	 switch (choice) {
             case 0:
        	 choice = 0;
        	 break;
        	   
             case 1: {
             System.out.println("Enter a number to check if its Palindrome or not:");
             int input=sc.nextInt();
             obj.checkPalindrome(input);
            	     }
             break;

            	 
             case 2: {
             System.out.println("Please enter a number to display the pattern");
             int userInput=sc.nextInt();
             obj.printPattern(userInput);
                     }
             break;

    
             case 3: {        
             System.out.println("Please enter a number to check if its prime or not");
             int userValue=sc.nextInt();
             obj.checkPrimeNumber(userValue);
                     }
             break;

            	 
             case 4: {
             System.out.println("Please enter a number to print the fibonacci series");
             int inputValue=sc.nextInt();
             obj.printFibonacciSeries(inputValue);
           
            	     }
             break;

             default:
             System.out.println("Invalid choice. Enter a valid no.\n");
            	 }        	        	         	
        	         	 
         }       
            while (choice != 0);//this condition true do the above steps 

            System.out.println("Exited Successfully!!!");
                  
            sc.close();
	}

}
