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
		}											// 파일 생성
		public void saveToFile(String str) {
			try  {
				fileOut.write(str.getBytes());
			} catch (IOException e) {
				e.printStackTrace();
			}
		}											// 파일 저장
	
		public static void FileUSD (String usd, String usd_type, int won, int realReturnUSD, int USDcharge) {
			String today = "";
			fO.printDate(today);
			fO.printReport("Dollar", "달러", won, realReturnUSD, USDcharge);			
		}
													// dollar 파일에 저장
		public static void FileEUR (String eur, String eur_type, int won, int realReturnEUR, int EURcharge) {
			String today = "";
			fO.printDate(today);
			fO.printReport("Euro", "유로", won, realReturnEUR, EURcharge);								
		}
													// EURO 파일에 저장
		public static void FileJPY (String jpy, String jpy_type, int won, int realReturnJPY, int JPYcharge) {
			String today = "";
			fO.printDate(today);
			fO.printReport("Jpy", "엔", won, realReturnJPY, JPYcharge);													
		}
		  											// JPY 파일에 저장
		public static void printDate (String date) {
			String str1 = sd.format(d);
			str1= String.format("\t < %s >\n",str1);
			fO.saveToFile(str1);					//시스템 날짜와 시간을 출력
		}
		
		public static void printReport (String type, String type1, int won, int change_mon, int changemon_charge) {
			String str;
			str = String.format("%s - %s : %d원, %s : %d%s, %s : %d원\n",
					"To " + type, "요청금액", won, "환전금액" , change_mon, type1, "거스름돈", changemon_charge);
			fO.saveToFile(str);						// 각 항목을 출력
		}
	}
