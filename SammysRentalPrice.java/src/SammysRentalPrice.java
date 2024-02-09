import javax.swing.JOptionPane;

public class SammysRentalPrice {
	public static void main (String []args) {
		
		final int RENT_PER_HOUR = 40;
		final int RENT_PER_ADDITIONAL_MIN = 1;
		final int MINUTES_IN_AN_HOUR = 60;
		
		String input = JOptionPane.showInputDialog("Enter the number of minutes you rented the equipment");
		int hours = Integer.parseInt(input);
		int remain = hours % MINUTES_IN_AN_HOUR;
		hours = hours / MINUTES_IN_AN_HOUR;
		//int remain = hours % MINUTES_IN_AN_HOUR;
		int totalCost = 0;
		
		if(remain > 40)
		{
			totalCost = hours * RENT_PER_HOUR + RENT_PER_HOUR;
		}
		else
		{
			totalCost = hours * RENT_PER_HOUR + remain * RENT_PER_ADDITIONAL_MIN;

		}
		
		System.out.println("$" + totalCost + " is the total cost.");
		
		
		System.exit(0);
	}
}

