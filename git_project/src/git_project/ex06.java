package git_project;
import java.util.Scanner;


public class ex06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int sum = 0;
		System.out.print("정수를 10개 입력하세요.\n");
		
		
		for(int i=1;i<=10;++i){
			int a = sc.nextInt();
			if(a<=0){
				continue;
			}
			
			sum=sum+a;
		}
		System.out.printf("양수의 합은:%d ",sum);
	}

}
