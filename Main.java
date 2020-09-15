import java.util.Scanner; 

/**
 *
 * @author 
 */
public class Main {

  /**
   * The method that is executed when you hit the run button.
   * @param args the command line arguments
   */
  public static void main(String[] args) {
    // Create a Scanner for user input 
    Scanner input = new Scanner(System.in); 

    // prompt the user to enter the amount of money they spent and create variable for the amount the user spent  
    System.out.println("Please enter the amount the customer spent"); 
    double amount_spent = input.nextDouble();  

    // creating variables for amount spent with the disscount 
    double First_Dis = amount_spent - (amount_spent/100)*10; 
    double Second_Dis = amount_spent - (amount_spent/100)*20; 
    double Third_Dis = amount_spent - (amount_spent/100)*30;
    double Forth_Dis = amount_spent - (amount_spent/100)*40;

    // creating variables to the amount saved with the disscount 
    double A_save = (amount_spent/100)*10; 
    double B_save = (amount_spent/100)*20;
    double C_save = (amount_spent/100)*30;
    double D_save = (amount_spent/100)*40; 

    // create variables for the amount after disscount is applied 
    double total_A = amount_spent - A_save;
    double total_B = amount_spent - B_save;
    double total_C = amount_spent - C_save; 
    double total_D = amount_spent - D_save; 

    // find the disscount percentage based off how much they spent 
    if (amount_spent >= 0.01 && amount_spent <= 40.00) {
      System.out.println("Your disscount is 10%"); 
      System.out.println("you will save " + A_save); 
      System.out.println("your new total is " + total_A);
    } if (amount_spent >= 40.01 && amount_spent <= 80.00) {
      System.out.println("Your disscount is 20%");
      System.out.println("you will save " + B_save);
      System.out.println("your new total is " + total_B);
    } if (amount_spent >= 80.01 && amount_spent <= 120.00) {
      System.out.println("Your disscount is 30%"); 
      System.out.println("you will save " + C_save);
      System.out.println("your new total is " + total_C); 
    } if (amount_spent >= 120.01) {
      System.out.println("Your disscount is 40%"); 
      System.out.println("you will save " + D_save);
      System.out.println("your new total is " + total_D);
    }





  }
}
