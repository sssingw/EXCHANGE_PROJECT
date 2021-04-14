import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class RunExchangeClass {
	
		public outputClass oc = new outputClass();
		public fileOutputclass fO = new fileOutputclass();
		Calendar cd = Calendar.getInstance();
		SimpleDateFormat sd = new SimpleDateFormat ("YYYY-MM-dd HH:mm:ss");
		Date d = new Date();
			
		public void changeToUSD(int won) {			
			double dollar = won / constvalue.USD_rate;
			int realReturnUSD = (int)dollar;			
			if (this.checkBalanceUSD(realReturnUSD) == true) {
				double r = Math.round((dollar - (int)dollar) * constvalue.USD_rate);
				int change_dollar_kor = ((int) r / 10) * 10;
				int USDcharge = (int)change_dollar_kor;
				
				oc.outputResultUSD(realReturnUSD);
				oc.outputResultWON(USDcharge);
				
				constvalue.BALANCE_USD -= dollar;	
				fO.FileUSD("Dollar", "달러", won, realReturnUSD, USDcharge); 
													//dollar의 보유액 확인, 환전액과 거스름돈 출력하는 메서드 호출
			} else {
				this.Errormessage(constvalue.USDError);
			}										//보유액 부족이면 에러메세지 출력
		}		
		public void changeToEUR(int won) {
			double euro = won / constvalue.EUR_rate;
			int realReturnEUR = (int)euro;			
			if (this.checkBalanceEUR(realReturnEUR) == true) {
				double r1 = Math.round((euro - (int)euro) * constvalue.EUR_rate);
				int change_euro_kor = ((int)r1 / 10) * 10;
				int EURcharge = (int)change_euro_kor;
				
				oc.outputResultEURO(realReturnEUR);
				oc.outputResultWON(EURcharge);
				
				constvalue.BALANCE_EUR -= euro;	
				fO.FileEUR("Euro", "유로", won, realReturnEUR, EURcharge);
													//Euro의 보유액 확인, 환전액과 거스름돈 출력하는 메서드 호출
			} else {
				this.Errormessage(constvalue.EURError);
			}										//보유액 부족이면 에러메세지 출력
		}		
		public void changeToJPY(int won) {
			double jpy = won / constvalue.JPY_rate;
			int realReturnJPY = (int)jpy;		
			if (this.checkBalanceJPY(realReturnJPY) == true) {
				double r2 = Math.round((jpy - (int)jpy) * constvalue.JPY_rate);
				int change_jpy_kor = ((int)r2 / 10) * 10;
				int JPYcharge = (int)change_jpy_kor;
				
				oc.outputResultJPY(realReturnJPY);
				oc.outputResultWON(JPYcharge);
				
				constvalue.BALANCE_JPY -= jpy;
				fO.FileJPY("Jpy","엔", won, realReturnJPY, JPYcharge);	
													//Jpy의 보유액 확인, 환전액과 거스름돈 출력하는 메서드 호출
			} else {
				this.Errormessage(constvalue.JPYError);
			}										//보유액 부족이면 에러메세지 출력
		}		
		public boolean checkBalanceUSD(int requestUSD) {			
			if (requestUSD <= constvalue.BALANCE_USD) {
				return true;
			} else {
				return false;
			}										//dollar의 보유액과 비교해 반환
		}		
		public boolean checkBalanceEUR(int requestEUR) {			
			if (requestEUR <= constvalue.BALANCE_EUR) {
				return true;				
			} else {
				return false;
			}										//Euro의 보유액과 비교해 반환
		}		
		public boolean checkBalanceJPY(int requestJPY) {
			if (requestJPY <= constvalue.BALANCE_JPY) {
				return true;
			} else {
				return false;
			}										//Jpy의 보유액과 비교해 반환
		}		
		public void Errormessage(int errorcode) {	
			switch(errorcode) {
			case (constvalue.USDError) :
				System.out.println("보유 달러가 부족합니다.");
				break;
			case (constvalue.EURError):
				System.out.println("보유 유로가 부족합니다.");
				break;
			case (constvalue.JPYError):
				System.out.println("보유 엔화가 부족합니다.");
				break;
			}					// 에러코드를 int타입으로 변환한 상수를 switch 이용해 에러메세지 출력
		}		
}
