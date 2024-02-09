public class Cashier {

private final double DOLLAR_VALUE = 1;
private final double QUARTER_VALUE = 25;
private final double DIMES_VALUE = 10;
private final double NICKELS_VALUE = 5;
private final double PENNIES_VALUE = 1;
private double due;
private double rec;
private double change;

double dollarAmt;
double quarter;
double dime;
double nickel;
double penny;
double quarterChange;

public Cashier (double in, double r) {
this.due = in;
this.rec = r;

double dollar = rec - due;
dollarAmt = dollar / DOLLAR_VALUE;
double dollarChange = dollar % DOLLAR_VALUE;
dollarAmt = dollar - dollarChange;
change = ((dollar % DOLLAR_VALUE) * 100);

quarter = (change / QUARTER_VALUE);
double quarterChange = quarter % 1;
quarter = quarter - quarterChange;
change = (change % QUARTER_VALUE);

dime = (change / DIMES_VALUE);
double dimeChange = dime % 1;
dime = dime - dimeChange;
change = (change % DIMES_VALUE);

nickel = (change / NICKELS_VALUE);
double nickelChange = nickel % 1;
nickel = nickel - nickelChange;
change = (change % NICKELS_VALUE);

penny = penny / PENNIES_VALUE;
}

public double getDollars() {
return dollarAmt;
}

public double getQuarters() {
return quarter;
}

public double getDimes() {
return dime;
}

public double getNickels() {
return nickel;
}

public double getPennies() {
return change;
}

}