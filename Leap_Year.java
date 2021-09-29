import java.util.Scanner;
class Leap_Year
{
	public static void main(String args[]){
	Scanner input=new Scanner(System.in);
	System.out.println("Enter the The Year For Checking Leap Year: ");
	int year= input.nextInt();
	Boolean isLeapyear=(year%4==0 && year%100 !=0) || (year%400==0);
	System.out.println(year+ " is a leap Year? " +isLeapyear); 
}

}