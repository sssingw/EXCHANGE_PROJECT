import java.util.Scanner;

public class Inputclass {

	
	public int inputFromConsolewon() {
		
		Scanner sc = new Scanner (System.in);
		System.out.print("원화를 입력하세요\n");
		
		int input_kormoney = sc.nextInt();
		return input_kormoney;	
	}										//원화 입력받기

	public int inputFromConsoletype() {
		
		Scanner sc = new Scanner (System.in);
		System.out.println("어떤 돈으로 환전하시겠습니까?\n"
							+ "1. USD\n"
							+ "2. EUR\n"
							+ "3. JPY\n"
							+ "4. Exit\n"
							+ "0. input money again");
		
		int inputnum = sc.nextInt();
		return inputnum;		
	}										//환전타입 입력받기
}