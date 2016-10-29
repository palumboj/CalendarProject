package homework1Package;
import java.util.Scanner;

public class Calendar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Declaring Variables
		
		int daysInMonth;
		int month = 1;
		int jan1Date;
		int year;
		
		//Requesting Data from User
		
		//Year Input
		Scanner keyboard = new Scanner(System.in);
		System.out.print("Please enter the year:");
		year = keyboard.nextInt();
		
		//Day of the week that jan 1 starts on input
		System.out.println("Day of the week code:");
		System.out.println("0- Sun  1- Mon  2- Tue  3- Wed  4- Thu  5- Fri  6- Sat");
		System.out.print("Please enter the day of the week code that January 1st falls on:");
		jan1Date = keyboard.nextInt();
		
		//Testing for leap year
		boolean leapYear;
		if(year%4 == 0){
			leapYear = true;
		}
		else{
			leapYear = false;
		}
		
		/*Loop for each month
		 * The loop checks the variable month for its value using if and else if statements
		 * Each if statement corresponds to a month of the year (jan = 1, feb = 2, etc ...)
		 * In each if statement, there is another loop that prints the days of the week
		 * 
		 */
		
		while(month <= 12){
			if(month == 1){
				daysInMonth = 31;
				System.out.println("January "+ year);
				System.out.println("Sun  Mon  Tue  Wed  Thu  Fri  Sat");
			}
			else if(month == 2){
				if(leapYear == true){
					daysInMonth = 29;
				}
				else{
					daysInMonth = 28;
				}
				System.out.println("February "+ year);
				System.out.println("Sun  Mon  Tue  Wed  Thu  Fri  Sat");
			}
			else if(month == 3){
				daysInMonth = 31;
				System.out.println("March "+ year);
				System.out.println("Sun  Mon  Tue  Wed  Thu  Fri  Sat");
			
			}
			else if(month == 4){
				daysInMonth = 30;
				System.out.println("April "+ year);
				System.out.println("Sun  Mon  Tue  Wed  Thu  Fri  Sat");
		
			}
			else if(month == 5){
				daysInMonth = 31;
				System.out.println("May "+ year);
				System.out.println("Sun  Mon  Tue  Wed  Thu  Fri  Sat");
			
			}
			else if(month == 6){
				daysInMonth = 30;
				System.out.println("June "+ year);
				System.out.println("Sun  Mon  Tue  Wed  Thu  Fri  Sat");
			}
			else if(month == 7){
				daysInMonth = 31;
				System.out.println("July "+ year);
				System.out.println("Sun  Mon  Tue  Wed  Thu  Fri  Sat");
			}
			else if(month == 8){
				daysInMonth = 31;
				System.out.println("August "+ year);
				System.out.println("Sun  Mon  Tue  Wed  Thu  Fri  Sat");
			}
			else if(month == 9){
				daysInMonth = 30;
				System.out.println("September "+ year);
				System.out.println("Sun  Mon  Tue  Wed  Thu  Fri  Sat");
			}
			else if(month == 10){
				daysInMonth = 31;
				System.out.println("October "+ year);
				System.out.println("Sun  Mon  Tue  Wed  Thu  Fri  Sat");
			}
			else if(month == 11){
				daysInMonth = 30;
				System.out.println("November "+ year);
				System.out.println("Sun  Mon  Tue  Wed  Thu  Fri  Sat");
			}
			else if(month == 12){
				daysInMonth = 31;
				System.out.println("December "+ year);
				System.out.println("Sun  Mon  Tue  Wed  Thu  Fri  Sat");
			}
			month++;
		}
		keyboard.close();
		
	}
}

