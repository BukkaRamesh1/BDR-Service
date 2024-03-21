package Exception;

public class DeadLock implements Runnable {
	
     private Thread t; 
	private String threadName;
	
	
	DeadLock(String name){
		threadName = name;
		System.out.println("creating : "+threadName);
	}
	
	@Override
	public void run() {
		// TODO Auto-generated method stub
		// business logic 
		System.out.println("Running : "+threadName);
		try {
		for(int i = 4; i> 0; i--) {
			System.out.println("Thread: " + threadName + ", " +i);
			Thread.sleep(50);
		}
		}catch(InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("Thread: " + threadName + " exited");
		
	}
	
	
	public void  start() {
		System.out.println(" Starting "+threadName);
		if(t == null) {
			t = new Thread(this, threadName);
			t.start();
		}
	}
	
	public static void main(String[] args) {
		 DeadLock r1 = new DeadLock("Thread-1");
		 r1.start();
		 
		 DeadLock r2 = new DeadLock("Thread-2");
		 r2.start();
	}
	
	
//	private static final Object res1 =  new Object();
//	private static final Object res2 =  new Object();
//
//	/*
//	 * 
//	 *   Thread  () -- new 
//	 *   Start() --> this runnnable state
//	 *   run() --> running mode 
//	 *   sleep() --> wait /
//	 *   Dead -- 
//	 *   
//	 *    
//	 *    two ways 
//	 *    
//	 *    impement runnable interfacer 
//	 *    
//	 * 
//	 * 
//	 * 
//	 */
//	public static void main(String[] args) {
//		
//		Thread t1 = new Thread(() -> {
//			synchronized (res1) {
//				System.out.println("Thread 1 is holding res 1");
//				try {
//					
//					Thread.sleep(100);
//				}catch(InterruptedException e) {
//					e.printStackTrace();
//				}
//				System.out.println("Thread 1 waiting for res 2");
//			}synchronized (res2){
//				
//				
//				System.out.println("Thread 1 is holding res1 and res2");
//			}
//			
//		});
//		
//		
//		Thread t2 = new Thread(() -> {
//			synchronized (res2) {
//				System.out.println("Thread 2 is holding res 2");
//				try {
//					
//					Thread.sleep(100);
//				}catch(InterruptedException e ) {
//					e.printStackTrace();
//				}
//				System.out.println("Thread 2 waiting for res 1");
//
//			}synchronized (res1){
//				System.out.println("Thread 2 holding for res1 and res 2");
//			}
//			
//		});
//		
//		
//		
//		t1.start();
//		t2.start();
//	}

	
	

}
