package state;

public class Context {
	private State state;

	
	public Context(State state) {
		this.state = state;
	}

	public State getState() {
		return state;
	}

	public void setState(State state) {
		this.state = state;
	}
	
	public void method(){
		if("state1".equals(this.state.getValue())){
			this.state.method1();
		}else if("state2".equals(this.state.getValue())){
			this.state.method2();
		}
		
	}
	
	
	
}
