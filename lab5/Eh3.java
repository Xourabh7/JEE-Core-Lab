package lab5;

import java.util.Scanner;

public class Eh3 {

	public static void main(String[] args) throws EmployeeException{
		try {
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter Salary: ");
			int n=sc.nextInt();
			if(n<3000) {
				throw new  EmployeeException("Salary below 3000");		
				}
		}finally {
			
		}

	}

}
