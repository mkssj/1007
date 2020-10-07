import java.util.Scanner;


public class ex02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int i=0;
		System.out.print("(A~D,F):");
		String s = sc.nextLine();
		
		if(s.equals("A")||s.equals("B")){
			System.out.print("참 잘하였습니다.");
		}
		else if(s.equals("D")){
			System.out.print("좀 더 노력하세요.");
		}
		else if(s.equals("F")){
			System.out.print("다음 학기에 다시 수강하세요.");
		}else{
			System.out.print("잘못된 학점입니다.");
		}
	}

}
