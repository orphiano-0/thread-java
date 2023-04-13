package ThreadExerciseTester;

public class TestDeadlockExample1 {

	public static void main(String[] args) {
		final String resource1 = "Ren Dover";  
		final String resource2 = "Tessia Eralith";  
		Thread fThread = new Thread() {  
		      public void run() {  
		          synchronized (resource1) {  
		           System.out.println("Thread 1: Locked resource 1");  
		           	try { 
		           		Thread.sleep(100);
		           		} catch (Exception e) {}  
		           	synchronized (resource2) {  
		            System.out.println("Thread 1: Locked resource 2");  
		           }  
		         }  
		      }  
		    };  
		Thread sThread = new Thread() {  
		      public void run() {  
		        synchronized (resource2) {  
		          System.out.println("Thread 2: Locked resource 2");  
		  
		          try { 
		        	  Thread.sleep(100);
		        	  } catch (Exception e) {}  
		          synchronized (resource1) {  
		            System.out.println("Thread 2: Locked resource 1");  
		          }  
		        }  
		      }  
		    };  
		    
		    fThread.start();  
		    sThread.start();  
	}  
}       