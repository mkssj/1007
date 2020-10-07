package git_project;
import java.util.Scanner;


public class ex10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=0;

		int sum=0;

		System.out.println("1부터 n까지의 합 중에서 5000을 넘지 않는 가장 큰 합은?");

		for(n=1; sum<=5000; n++){

			sum += n; 

			if(sum>5000) {

				

				sum -= n; 

				n = n-1;

				break;

			}

		}

		System.out.println("1부터 "+n+"까지의 합이 "+sum+"입니다.");

	}

}