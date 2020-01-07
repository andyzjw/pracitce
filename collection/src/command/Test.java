package command;

public class Test {
	public static void main(String[] args) {
		Receiver recevier = new Receiver();
		Command command = new MyCommand(recevier);
		
		Invoker invoker = new Invoker(command);
		invoker.action();
		
	}
}
