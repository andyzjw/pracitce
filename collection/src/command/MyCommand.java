package command;

public class MyCommand implements Command {
	
	public MyCommand(Receiver recevier) {
		this.recevier = recevier;
	}

	private Receiver recevier;
	
	@Override
	public void exe() {
		recevier.action();
	}

}
