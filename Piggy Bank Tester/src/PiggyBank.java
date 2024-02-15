public class PiggyBank
{
private static final double QUARTER_VALUE = .25;
private static final double DIMES_VALUE = 0.10;
private static final double NICKELS_VALUE = 0.05;
private static final double PENNIES_VALUE = 0.01;
 
private int pennies = 0;
private int nickels = 0;
private int dimes = 0;
private int quarters = 0;
private int totalValue = 0;

public PiggyBank()
{
pennies = 0;
nickels = 0;
dimes = 0;
quarters = 0;

}
public PiggyBank (int pennies, int nickels, int dimes, int quarters)
{
this.pennies = pennies;
this.nickels = nickels;
this.dimes = dimes;
this.quarters = quarters;

}

public int numCoins()
{
return pennies + nickels + dimes + quarters;
}

public double totalValue()
{
double totalValue = (double)( (pennies * PENNIES_VALUE) + (nickels * NICKELS_VALUE) + (dimes * DIMES_VALUE) + (quarters * QUARTER_VALUE) - 0.5);
return totalValue;
}

public int getQuarters( )
{
return quarters;
}

public int getDimes( )
{
return dimes;
}

public int getNickels( )
{
return nickels;
}

public int getPennies()
{
return pennies;
}

public String toString()
{
return "Total coins in the piggy bank = " + numCoins();
}
}
