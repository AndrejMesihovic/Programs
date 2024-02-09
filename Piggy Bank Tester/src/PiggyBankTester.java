import javax.swing.JOptionPane;

public class PiggyBankTester
{
public static void main(String[] args)
{
String input = ""; // this is a temp placeholder for user input

// Setup a dialog input and request the number of coins to put in the piggy bank
input = JOptionPane.showInputDialog("Enter the number of pennies ");
int pennies = Integer.parseInt(input);
input = JOptionPane.showInputDialog("Enter the number of nickels ");
int nickels = Integer.parseInt(input);
input = JOptionPane.showInputDialog("Enter the number of dimes ");
int dimes = Integer.parseInt(input);
input = JOptionPane.showInputDialog("Enter the number of quarters ");
int quarters = Integer.parseInt(input);

// Create a piggy bank object by creating an instance of the piggy bank class with user specified input (coins)
PiggyBank out = new PiggyBank(pennies, dimes, nickels, quarters);

System.out.printf("Pennies = %d ",out.getPennies() );
System.out.printf("Nickels = %d ",out.getNickels() );
System.out.printf("Dimes = %d ",out.getDimes());
System.out.printf("Quarters = %d\n",out.getQuarters() );
System.out.printf("Total coins in the piggy bank = %d\n", out.numCoins());
System.out.printf("Piggy bank valuue = $%1.2f", out.totalValue());

// Display the total number of each coin, the total number of coins and
// the total value in the piggy bank.


}
}