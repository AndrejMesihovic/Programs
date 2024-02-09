public class CashierTest {
public static void main(String args[]) {

String input = javax.swing.JOptionPane.showInputDialog("Enter the amount due in dollars and cents: $");
String received = javax.swing.JOptionPane.showInputDialog("Enter the amount recieved : $");

double in = Double.parseDouble(input);
double r = Double.parseDouble(received);

Cashier out = new Cashier (in, r);

System.out.printf("The charged amount: $%1.2f\n", in);
System.out.printf("The amount recieved: $%1.2f\n", r);
System.out.printf("The customer should recieve: ");
System.out.printf("%1.0f dollars\n", out.getDollars());
System.out.printf("%1.0f quarters\n", out.getQuarters());
System.out.printf("%1.0f dimes\n", out.getDimes());
System.out.printf("%1.0f nickels\n", out.getNickels());
System.out.printf("%1.0f pennies\n", out.getPennies());

System.exit(0);
}
}