import java.util.Scanner;


public class ex03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String  s;
		System.out.print("학접을 입력하세요.((A~D,F:)");
		s = sc.nextLine();
		
		switch(s){
		case "A":
		case "B":
		System.out.printf("참 잘하였습니다.");
		break;
		case "D":
		case "C":
		System.out.printf("좀 더 노력하세요.");
		break;
		case "F":
		System.out.printf("다음 학기에 다시 수강하세요.");
		break;
		default:
	    System.out.print("잘못된 학점입니다.");
	    break;
		}
	}

}
