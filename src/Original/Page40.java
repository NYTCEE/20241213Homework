package Original;
import java.io.*;

public class Page40 {
	public static void main(String[]args) {
		if(args.length !=1) {
			System.out.println("請指定正確的檔案名稱");
			System.exit(1);
		}
		try {
			try (BufferedReader br = new BufferedReader(new FileReader(args[0]))) {
				String str;
				while((str= br.readLine())!=null) {
					System.out.println(str);
				}
			}
		}catch(IOException e) {
			System.out.println("輸出入錯誤");
		}
	}
}