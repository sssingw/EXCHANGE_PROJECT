import java.util.ArrayList;

public class outputClass {
	
	public void outputResultUSD(int dollar) {		
		System.out.println("<달러로 환전 결과 : " +(int)dollar + "달러>");
		int [] returnDollar_unit = {100,50,20,10,1};
			for (int i = 0; i < returnDollar_unit.length; i++) {				
				System.out.println(returnDollar_unit[i] + "달러 : " + (int)dollar / returnDollar_unit[i] + "개");							
				dollar = dollar % returnDollar_unit[i];
			}
	}														//dollar 환전결과와 지폐 단위별 개수 출력
	public void outputResultEURO(int euro) {		
		System.out.println("<유로로 환전 결과 : " +(int)euro + "유로>");
		int [] returnEURO_unit = {500,200,100,50,20,10,1};
			for (int i = 0; i < returnEURO_unit.length; i++) {
				System.out.println(returnEURO_unit[i] + "유로 : " + (int)euro / returnEURO_unit[i] + "개");				
				euro = euro % returnEURO_unit[i];
			}
	}														//EURO 환전결과와 지폐 단위별 개수 출력
	public void outputResultJPY(int jpy) {		
		System.out.println("<엔화로 환전 결과 : " +(int)jpy + "엔>");
		int [] returnJPY_unit = {500,100,50,10,5,1};
			for (int i = 0; i < returnJPY_unit.length; i++) {
				System.out.println(returnJPY_unit[i] + "엔 : " + (int)jpy / returnJPY_unit[i] + "개");				
				jpy = jpy % returnJPY_unit[i];
			}
	}														//JPY 환전결과와 지폐 단위별 개수 출력
	public void outputResultWON(int charge) {		
		System.out.println();
		System.out.println("<거스름돈 : " + (int) + charge + "원>");
		int [] changekor_unit = {500,100,10};
			for (int i = 0; i < changekor_unit.length; i++) {
				System.out.println(changekor_unit[i] + "원 : " + (int)charge / changekor_unit[i] + "개");				
				charge = charge % changekor_unit[i];	
			}
	}														//환전 후 원화 거스름돈 단위 출력
}
