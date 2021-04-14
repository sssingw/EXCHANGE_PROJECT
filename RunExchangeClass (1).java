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
				fO.FileUSD("Dollar", "�޷�", won, realReturnUSD, USDcharge); 
													//dollar�� ������ Ȯ��, ȯ���װ� �Ž����� ����ϴ� �޼��� ȣ��
			} else {
				this.Errormessage(constvalue.USDError);
			}										//������ �����̸� �����޼��� ���
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
				fO.FileEUR("Euro", "����", won, realReturnEUR, EURcharge);
													//Euro�� ������ Ȯ��, ȯ���װ� �Ž����� ����ϴ� �޼��� ȣ��
			} else {
				this.Errormessage(constvalue.EURError);
			}										//������ �����̸� �����޼��� ���
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
				fO.FileJPY("Jpy","��", won, realReturnJPY, JPYcharge);	
													//Jpy�� ������ Ȯ��, ȯ���װ� �Ž����� ����ϴ� �޼��� ȣ��
			} else {
				this.Errormessage(constvalue.JPYError);
			}										//������ �����̸� �����޼��� ���
		}		
		public boolean checkBalanceUSD(int requestUSD) {			
			if (requestUSD <= constvalue.BALANCE_USD) {
				return true;
			} else {
				return false;
			}										//dollar�� �����װ� ���� ��ȯ
		}		
		public boolean checkBalanceEUR(int requestEUR) {			
			if (requestEUR <= constvalue.BALANCE_EUR) {
				return true;				
			} else {
				return false;
			}										//Euro�� �����װ� ���� ��ȯ
		}		
		public boolean checkBalanceJPY(int requestJPY) {
			if (requestJPY <= constvalue.BALANCE_JPY) {
				return true;
			} else {
				return false;
			}										//Jpy�� �����װ� ���� ��ȯ
		}		
		public void Errormessage(int errorcode) {	
			switch(errorcode) {
			case (constvalue.USDError) :
				System.out.println("���� �޷��� �����մϴ�.");
				break;
			case (constvalue.EURError):
				System.out.println("���� ���ΰ� �����մϴ�.");
				break;
			case (constvalue.JPYError):
				System.out.println("���� ��ȭ�� �����մϴ�.");
				break;
			}					// �����ڵ带 intŸ������ ��ȯ�� ����� switch �̿��� �����޼��� ���
		}		
}
