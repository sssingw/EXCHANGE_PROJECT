import java.util.Scanner;

public class Inputclass {

	
	public int inputFromConsolewon() {
		
		Scanner sc = new Scanner (System.in);
		System.out.print("��ȭ�� �Է��ϼ���\n");
		
		int input_kormoney = sc.nextInt();
		return input_kormoney;	
	}										//��ȭ �Է¹ޱ�

	public int inputFromConsoletype() {
		
		Scanner sc = new Scanner (System.in);
		System.out.println("� ������ ȯ���Ͻðڽ��ϱ�?\n"
							+ "1. USD\n"
							+ "2. EUR\n"
							+ "3. JPY\n"
							+ "4. Exit\n"
							+ "0. input money again");
		
		int inputnum = sc.nextInt();
		return inputnum;		
	}										//ȯ��Ÿ�� �Է¹ޱ�
}