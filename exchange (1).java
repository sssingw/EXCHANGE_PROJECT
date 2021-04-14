
public class exchange {

	public static void main(String[] args) {
		
		RunExchangeClass runClass = new RunExchangeClass();
		Inputclass inputclass = new Inputclass();
			
		while (true) {
			
			int kor = inputclass.inputFromConsolewon();
			int type = inputclass.inputFromConsoletype();     // inputclass에서 받은 원화와 타입
			
			if (type == constvalue.AGAIN) {
				continue;
			}
			if (type == constvalue.CHANGE_TYPE_USD) {
				System.out.println();
				runClass.changeToUSD(kor);
			} else if (type == constvalue.CHANGE_TYPE_EUR) {
				System.out.println();
				runClass.changeToEUR(kor);
			} else if (type == constvalue.CHANGE_TYPE_JPY) {
				System.out.println();
				runClass.changeToJPY(kor);
			} else if (type == constvalue.Exit) {
				break;
			}													// 입력받을 타입을 비교해 해당 메서드 호출
			
			System.out.println();
			System.out.println("----------------------------------");
		}
	}
}
