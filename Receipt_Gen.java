package assignment1;

import java.util.*; //Class needs to be imported

public class assignment1code2 
{
	public static void main(String[] args) 
	{
		//This scanner is created to show the client the answers of his input in the report
		Scanner receipt = new Scanner(System.in);
		
		/* Header that welcomes and invites the client to fill in the Vaccination Receipt*/
		System.out.println("Welcome to the Receipt Generator:\n");
		System.out.println("Please enter the client info:\n"); 
		
		System.out.println("First name ? ");
		/*Set input of the first name to begin with an Upper case letter and the rest are lower case letters*/
		String fn = receipt.nextLine(); //fn = first name
		String s1 = fn.substring(0,1);
		String s2 = s1.toUpperCase();
		String s3 = fn.substring(1).toLowerCase();
		String fn1 = s2 + s3;
		
		System.out.println("Last Name ? ");
		/*Set input of the last name to begin with an Upper case letter and the rest are lower case letters */
		String ln = receipt.nextLine(); //ln = last name
		String s4 = ln.substring(0,1);
		String s5 = s4.toUpperCase();
		String s6 = ln.substring(1).toLowerCase();
		String ln1 = s5 + s6;
		
		System.out.println("Address ? ");
		/*Set input of the address of the client */
		String address = receipt.nextLine();
		
		System.out.println("City ? ");
		/*Set input of the city to begin with an Upper case letter and the rest are lower case letters */
		String city = receipt.nextLine();
		String s7 = city.substring(0,1);
		String s8 = s7.toUpperCase();
		String s9 = city.substring(1).toLowerCase();
		String city1 = s8 + s9;
		
		System.out.println("Postal Code ? ");
		/*Set input of the Postal Code to be all upper case letters*/
		String ipostalcode = receipt.nextLine();
		String postalcode = ipostalcode.toUpperCase();
		
		System.out.println(""); //this line skipped to introduce the next
		
		System.out.println("Please enter the delivery info:\n"); //this line invites the client to enter the delivery information
		
		System.out.println("Day Of delivery (between 1 and 31) ? ");
		/*Set day of delivery from integer 1 to 31*/
		final int firstdod = 0;
		final int lastdod = 32;
		int dayofdelivery = receipt.nextInt();
		int dod = 0;
		if (dayofdelivery < lastdod && dayofdelivery > firstdod)
			dod = dayofdelivery;
		
		System.out.println("Month of delivery (between 1 and 12) ? ");
		/*Set month of delivery from integer 1 to 12*/
		final int firstmod = 0;
		final int lastmod = 13;
		int monthofdelivery = receipt.nextInt();
		int mod = 0;
		if (monthofdelivery < lastmod && monthofdelivery > firstmod)
			mod = monthofdelivery;
		
		System.out.println("Year of delivery (between 2020 and 2021) ? ");
		/*Set month of delivery from integer 2020 to 2021*/
		final int firstyod = 2019;
		final int lastyod = 2022;
		int yearofdelivery = receipt.nextInt();
		int yod = 0;
		if (yearofdelivery < lastyod && yearofdelivery > firstyod)
			yod = yearofdelivery;
		
		System.out.println("Distance from source to destination in kilometers ? ");
		/*Set distance as a double to display the digit after the decimal*/
		double distance = receipt.nextDouble();
		
		System.out.println("Value of the goods ? ");
		/*Set value of the goods as a double to display the digit after the decimal*/
		double valueofgoods = receipt.nextDouble();
		
		/*Computing delivery fees using the distance in kilometers, rounded to 2 decimals*/
		final double feeperkm = 0.55;
		double ideliveryfees = feeperkm * distance;
		double deliveryfees = Math.round(ideliveryfees * 100)/100.0;
		
		/*Computing TPS from value of goods and delivery, rounded to 2 decimals*/
		final double tps = 0.05;
		double itaxtps = (valueofgoods + deliveryfees) * tps;
		double taxtps = Math.round(itaxtps * 100)/100.0;
		
		/*Computing TVQ from value of goods and delivery, rounded to 2 decimals*/
		final double tvq = 0.09975;
		double itaxtvq = (valueofgoods + deliveryfees) * tvq;
		double taxtvq = Math.round(itaxtvq * 100)/100.0;
		
		/*Computing total of the bill, rounded to 2 decimals*/
		double itotal = valueofgoods + deliveryfees + taxtps + taxtvq;
		double total = Math.round(itotal * 100)/100.0;
		
		/*Header of the Receipt Generator*/
		System.out.println("\t\t\t\tMontr al Delivery Express\t   " + dod + "/" + mod + "/" + yod + "\n\n");
		
		
		System.out.println(fn1 + " " + ln1); //displays full name of the client
		System.out.println(address); //displays the address of the client
		System.out.println(city1 + ", QC, " + postalcode + "\n\n"); //displays the city, province of Qu bec, postal code of the client
		
		
		System.out.println("Sub-total\t\t\t\t\t\t\t   " + valueofgoods + " $"); //displays the sub total
		System.out.println("Delivery Fees (55 Cents * " + distance + " KM)\t\t\t\t   " + deliveryfees + " $"); //displays the delivery fees
		System.out.println("TPS   No 12345 6789 RT0001 - 5 %" + "\t\t\t\t   " + taxtps + " $"); //displays amount of TPS from value of goods and delivery fees
		System.out.println("TVQ   No 1234567890 TQ0020 - 9.975 %" + "\t\t\t\t   " + taxtvq + " $"); //displays amount of TVQ from value of goods and delivery fees
		System.out.println("Total\t\t\t\t\t\t\t\t   " + total + " $\n\n"); //displays the total of the bill
		
		
		System.out.println("Thank you for choosing Montr al Delivery Express.\n"); //displays a message thanking the client for choosing the delivery company
		
		System.out.println("Receipt generated successfully."); //displays a message of successful receipt generation
		
		receipt.close(); //close scanner
	} //end of main
} //end of public class
