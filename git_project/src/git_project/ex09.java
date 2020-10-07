package git_project;
import java.util.Scanner;


public class ex09 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("1 = 1");

		int sum=1;

		for(int i=1; i<10; i++){

			System.out.print("1 * ");

			sum=sum*(i+1);

			for(int j=2; j<=i; j++){

				System.out.print(j);

				System.out.print(" * ");

			}

			System.out.print(i+1);

			System.out.print(" = "+sum);

			System.out.print("\n");

		}

	}



}