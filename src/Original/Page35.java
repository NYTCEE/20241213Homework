package Original;
import java.io.*;

public class Page35 {
	public static void main(String[]args) {
		try (FileWriter fw = new FileWriter("test1.txt");
			 PrintWriter pw = new PrintWriter(new BufferedWriter(fw))) {
			
			pw.println("Hello!");
			pw.println("GoodBye!");
			System.out.println("資料已經寫入檔案了");
		} catch (IOException e) {
			System.out.println("輸出入錯誤");
		}
	}
}