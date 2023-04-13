package ThreadExercise;

public class Counter implements Runnable{
	Storage store;
	public Counter(Storage storage) {
	store = storage;
	}
	@Override
	public void run() {
		synchronized(store) {
			for(int i = 0; i <= 10; i++) {
				while(!store.isPrinted()) {
					try {
						store.wait();
						Thread.sleep(1000);
					} catch(Exception e) { }
				}
				store.setValue(i);
				store.setPrinted(false);
				store.notify();
			}
		}
	}

}
