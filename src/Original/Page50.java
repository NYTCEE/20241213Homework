package Original;

public class Page50 {
	public static void main(String[]args) {
		CarP50 car1 =new CarP50("一號車");
		Thread th1 =new Thread(car1);
		th1.start();
		for(int i=0;i<5;i++) {
			System.out.println("正在進行main()的處理工作");
		}
	}
}
class CarP50 implements Runnable{
    
	private final String name;
	public CarP50(String nm) {
		 name=nm;
	}

    @Override
	public void run() {
		for(int i=0;i<5;i++) {
			System.out.println("正在進行"+name+"的處理");
		}
	}
}