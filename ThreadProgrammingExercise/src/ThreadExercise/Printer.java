package ThreadExercise;

public class Printer implements Runnable{
	
	Storage store;
	public Printer(Storage storage) {
		this.store = storage;
	}
	@Override
	public void run () {
		synchronized(store) {
			for(int i = 0; i <= 10; i++) {
				while(store.isPrinted()) {
					try {
						store.wait();
					} catch(Exception e) { }
				}
				System.out.println(Thread.currentThread().getName() + " " + store.getValue());
				store.setPrinted(true);
				store.notify();
			}
		}
	}

}
