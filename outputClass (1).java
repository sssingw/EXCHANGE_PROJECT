import java.util.ArrayList;

public class outputClass {
	
	public void outputResultUSD(int dollar) {		
		System.out.println("<�޷��� ȯ�� ��� : " +(int)dollar + "�޷�>");
		int [] returnDollar_unit = {100,50,20,10,1};
			for (int i = 0; i < returnDollar_unit.length; i++) {				
				System.out.println(returnDollar_unit[i] + "�޷� : " + (int)dollar / returnDollar_unit[i] + "��");							
				dollar = dollar % returnDollar_unit[i];
			}
	}														//dollar ȯ������� ���� ������ ���� ���
	public void outputResultEURO(int euro) {		
		System.out.println("<���η� ȯ�� ��� : " +(int)euro + "����>");
		int [] returnEURO_unit = {500,200,100,50,20,10,1};
			for (int i = 0; i < returnEURO_unit.length; i++) {
				System.out.println(returnEURO_unit[i] + "���� : " + (int)euro / returnEURO_unit[i] + "��");				
				euro = euro % returnEURO_unit[i];
			}
	}														//EURO ȯ������� ���� ������ ���� ���
	public void outputResultJPY(int jpy) {		
		System.out.println("<��ȭ�� ȯ�� ��� : " +(int)jpy + "��>");
		int [] returnJPY_unit = {500,100,50,10,5,1};
			for (int i = 0; i < returnJPY_unit.length; i++) {
				System.out.println(returnJPY_unit[i] + "�� : " + (int)jpy / returnJPY_unit[i] + "��");				
				jpy = jpy % returnJPY_unit[i];
			}
	}														//JPY ȯ������� ���� ������ ���� ���
	public void outputResultWON(int charge) {		
		System.out.println();
		System.out.println("<�Ž����� : " + (int) + charge + "��>");
		int [] changekor_unit = {500,100,10};
			for (int i = 0; i < changekor_unit.length; i++) {
				System.out.println(changekor_unit[i] + "�� : " + (int)charge / changekor_unit[i] + "��");				
				charge = charge % changekor_unit[i];	
			}
	}														//ȯ�� �� ��ȭ �Ž����� ���� ���
}
