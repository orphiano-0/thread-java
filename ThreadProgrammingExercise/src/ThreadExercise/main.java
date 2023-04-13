package ThreadExercise;

public class main {
	public static void main(String[] args) {
		Storage storage = new Storage();
		Counter counter = new Counter(storage);
		Printer printer = new Printer(storage);
		
		new Thread(counter, "Counter").start();
		new Thread(printer, "The current value in the sequence is ").start();
	}
}
