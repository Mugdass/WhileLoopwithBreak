/*******************
Name: Matas Backevicius

Date: Apr 15, 2021

Notes: This is the w2 assignment while loop with a continue operator
in the loop if one condition is not met, and a break operant to end the loop,
 if the 'if' condition is not met.
*******************/


  
  import java.util.Scanner;
class WhileLoopWithBreak {
  public static void main(String[] args) {
    int n;
   
               
    Scanner input = new Scanner(System.in);
    
    
    while (true) {            /* what we're doing here is determing while these statements are true*/
      System.out.println("How old were you last year?");
      System.out.println("If u say 0, that's the end of loop!");
      System.out.println("if u give me a number other than 0, we'll continue!");
      n = input.nextInt();
                              /*we'll print a list of these statement which are inout questions*/
      
      if (n != 0) {      // here we must have a loop that's if this condition is met,
                           /*then the loop ends, zo number 0, ends the loop*/
        System.out.println("Great! And how old are you this year?");
        int n1 = input.nextInt();
          System.out.println("And if u add both numbers you get? ");
          int n2= input.nextInt();
          System.out.println(n1 + n);
          
          
          System.out.println("Alright");
          System.out.println("Now take the total of days in a year: 365.24 and * by "  + (n1));
          System.out.println("What number you get?");
          int n3=input.nextInt();
          System.out.println("If you wrote " + (n1 * 364.24));
          System.out.println("That's correct, because " +(n1) + " * 365.24 is " +(n1* 364.24) + " days ");
          System.out.println("and actually this is how OLD YOU ARE!");
         
            /*we ask user to enter an asnwer to our quetions, which is an integer number*/
         /* based on that given answer by the user we continue our loop
                   to calculate the integers given by the user*/
            
            
      continue;        /*if the 0 condition is met, then we have this "continue"
                            operator to continue our loop to the else statement*/

              }
      else {
      System.out.println("The end!");       
      
                                   /* else sttement only printed
                   when the if condition is not met, in this case when the answer by the user is :0 */
                   
      System.out.println("Your Choice!");
      System.out.println("Thank you!");
        break;
      }                                   /* and we have 'break' in the end 
                             because that's where we want our loop to end immediately. */
    }
  }
}