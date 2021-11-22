/*Tom Lazore
Lab 5.3
This program asks user to input the nth degree of numbers in the fibonacci sequence.
It calculates and outputs however many numbers the user wants displayed.
*/

import java.util.Scanner;//imports scanner so user can enter input

class FibNumber{
   public static void main(String[]args){
      Scanner keyboard = new Scanner(System.in);
      
      //Creates variable for user to enter amount that numbers will be output
      int sequence; 
      System.out.print("How many numbers do you want the sequence to output?: ");
      sequence = keyboard.nextInt(); 
      
       int number = 3;//Beginning number in the sequence since the first two numbers in the sequence are 1
       int nextFib;//Temporary variable to add previous sum to the next sequence
       int FIB1 = 1;//Constant for first number in the sequence
       int FIB2 = 1;//Constant for second number in the sequence
       
       //Runs if user enters a number less than or equal to 0
       if (sequence <= 0){
         System.out.println("Please enter a valid positive number");
         }
       //Runs if user enters 1
       else if(sequence == 1){
         System.out.println("The fibonacci sequence with a sequence of " + (number - 2)+ " number is:");
         System.out.println(FIB1);
         }
       //Runs if user enters 2
       else if(sequence == 2){
         System.out.println("The fibonacci sequence with a sequence of " + (number - 1) + " numbers is:");
         System.out.println(FIB1);
         System.out.println(FIB2);
         }
       //Runs if user enters a number greater than 2
       else{
         System.out.println("The fibonacci sequence with a sequence of " + (sequence) + " numbers is:");//Tells user how many numbers in the sequence will be displayed
         //outputs the first two numbers in the sequence
         System.out.println(FIB1);
         System.out.println(FIB2);
         
         //Loops to add the previous two sums to the next sequence
         while(number <= sequence){
            nextFib = FIB1 + FIB2;
            ++number;
            FIB2 = FIB1;
            FIB1 = nextFib;
            System.out.println(nextFib);
            }
            }
            
         System.out.println("Thanks for using my program!");
     

   }//ends main         
}//ends class
         
