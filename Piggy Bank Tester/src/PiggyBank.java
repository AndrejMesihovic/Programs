public class PiggyBank
{
// constant coin denomination
private static final double QUARTER_VALUE = .25;
private static final double DIMES_VALUE = 0.10;
private static final double NICKELS_VALUE = 0.05;
private static final double PENNIES_VALUE = 0.01;
 
// instance variables
private int pennies = 0;
private int nickels = 0;
private int dimes = 0;
private int quarters = 0;
private int totalValue = 0;
/**
* This is the constructor method for the piggy bank.
* This constructor will be called with the number of coins
* for each denomination.
*
* @param pennies
* @param nickels
* @param dimes
* @param quarters
*
*/

//default constructor that constructs an empty piggy bank (finish initializing instance variables)
public PiggyBank()
{
pennies = 0;
nickels = 0;
dimes = 0;
quarters = 0;

}
//parameterized constructor that constructs a piggy bank with coins (finish initializing instance variables)
public PiggyBank (int pennies, int nickels, int dimes, int quarters)
{
this.pennies = pennies;
this.nickels = nickels;
this.dimes = dimes;
this.quarters = quarters;

}

// This method returns the total number of coins in the piggy bank
public int numCoins()
{
return pennies + nickels + dimes + quarters;
}

// This methods returns the value of the coins in the piggy bank (complete the method implementation)
public double totalValue()
{
double totalValue = (double)( (pennies * PENNIES_VALUE) + (nickels * NICKELS_VALUE) + (dimes * DIMES_VALUE) + (quarters * QUARTER_VALUE) - 0.5);
return totalValue;
}

// Amount in quarters returned
public int getQuarters( )
{
return quarters;
}

// Amount in dimes returned  
public int getDimes( )
{
return dimes;
}

// Amount in nickels returned  
public int getNickels( )
{
return nickels;
}

// Amount in pennies returned
public int getPennies()
{
return pennies;
}

// This toString method will return a string containing
// the current number of coins in the piggy bank.
// piggy bank.
public String toString()
{
return "Total coins in the piggy bank = " + numCoins();
}
}