import java.util.Scanner;


public class ex05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int i = 0 , sum=0;
		int num ;
		System.out.println("정수를 입력하고 마지막에 -1을 입력하세요.");
		do{
		
		num=sc.nextInt();
		if(num==-1){
			break;
		}
		sum=sum+num;
		i++;
	}while(true);
	System.out.printf("정수의 개수는  %d개이며 합은 %d이고 평균은 %.2f입니다.",i,sum,(double)sum/i);

}
}