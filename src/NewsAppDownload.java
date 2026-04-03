
 class NewsDownloader implements Runnable{
	 private String sourceName;
	 private int delaySeconds;
	 public NewsDownloader(String sourceName, int delaySeconds) {
		 this.sourceName = sourceName;
		 this.delaySeconds = delaySeconds;
	 }
	 public void run() {
		 try{
			 System.out.println("Downloading From: " + sourceName);
			 Thread.sleep(delaySeconds * 1000);
			 System.out.println(sourceName + " Download completed");
		 }
		 catch(InterruptedException e) {
			 System.out.println(sourceName + " Interrupted!");
		 }
	 }
 }
public class NewsAppDownload {
	public static void main(String[] args) {
		Thread t1 = new Thread(new NewsDownloader("BBC" , 2));
		Thread t2 = new Thread(new NewsDownloader("CNN" , 1));
		Thread t3 = new Thread(new NewsDownloader("Reuters" , 3));
		
		t1.setName("Thread-BBC");
		t2.setName("Thread-CNN");
		t3.setName("Thread-Reuters");
		
		t1.start();
		t2.start();
		t3.start();
		
		
		try {
			t1.join();
			t2.join();
			t3.join();
		}catch(InterruptedException e) {
			System.out.println("Main Thread Interrupted");
		}
		System.out.println("All articles downloaded. App is ready!");
	}

}
