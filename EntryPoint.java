import java.util.Scanner;
import java.util.Random;

public class EntryPoint{
	public static void main(String [] args){
		Scanner scan=new Scanner(System.in);
		Random rand= new Random();
		int n=Math.abs(rand.nextInt())%10+1;
		String lmao="";
		while (n--!=0){

		System.out.println("Please input the employee's first name:");
		String FirstName=scan.nextLine();
		System.out.println("Please input the employee's last name:");
		String LastName=scan.nextLine();
		System.out.println("Please input the employee's age:");
		int Age=scan.nextInt();
		System.out.println("Please input the employee's salary:");
		Double Salary=scan.nextDouble();

		String lol=FirstName+", "+LastName+", "+Age+", "+Salary;
		System.out.println("Employee's information: " + lol);
		System.out.println("You have "+n +" entries left.");
		lmao= lmao +"\n"+lol;
		}
		System.out.println("Employees: "+"\n"+ lmao);
	}
}