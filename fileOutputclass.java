import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;


	public class fileOutputclass {
		public static outputClass oc = new outputClass();
		public static fileOutputclass fO = new fileOutputclass();
		public static Calendar cd = Calendar.getInstance();
		public static SimpleDateFormat sd = new SimpleDateFormat ("YYYY-MM-dd HH:mm:ss");
		public static Date d = new Date();
		
	
		private OutputStream fileOut = null;
		
		public fileOutputclass() {
			try {
				fileOut = new FileOutputStream("C:\\Users\\Seongwon\\Desktop\\exchange.txt");
			} catch(FileNotFoundException e) {
				e.printStackTrace();
			}
		}											// ���� ����
		public void saveToFile(String str) {
			try  {
				fileOut.write(str.getBytes());
			} catch (IOException e) {
				e.printStackTrace();
			}
		}											// ���� ����
	
		public static void FileUSD (String usd, String usd_type, int won, int realReturnUSD, int USDcharge) {
			String today = "";
			fO.printDate(today);
			fO.printReport("Dollar", "�޷�", won, realReturnUSD, USDcharge);			
		}
													// dollar ���Ͽ� ����
		public static void FileEUR (String eur, String eur_type, int won, int realReturnEUR, int EURcharge) {
			String today = "";
			fO.printDate(today);
			fO.printReport("Euro", "����", won, realReturnEUR, EURcharge);								
		}
													// EURO ���Ͽ� ����
		public static void FileJPY (String jpy, String jpy_type, int won, int realReturnJPY, int JPYcharge) {
			String today = "";
			fO.printDate(today);
			fO.printReport("Jpy", "��", won, realReturnJPY, JPYcharge);													
		}
		  											// JPY ���Ͽ� ����
		public static void printDate (String date) {
			String str1 = sd.format(d);
			str1= String.format("\t < %s >\n",str1);
			fO.saveToFile(str1);					//�ý��� ��¥�� �ð��� ���
		}
		
		public static void printReport (String type, String type1, int won, int change_mon, int changemon_charge) {
			String str;
			str = String.format("%s - %s : %d��, %s : %d%s, %s : %d��\n",
					"To " + type, "��û�ݾ�", won, "ȯ���ݾ�" , change_mon, type1, "�Ž�����", changemon_charge);
			fO.saveToFile(str);						// �� �׸��� ���
		}
	}
