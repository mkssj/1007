package git_project;
import java.util.Scanner;


public class ex01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.print("점수를 입력하시오: ");
		int i=sc.nextInt();
		
		if(i>=80){
			System.out.println("축하합니다! 합격입니다.");
		}else{
			System.out.println("불합격입니다.");
		}
	}

}
