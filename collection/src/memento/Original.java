package memento;

public class Original {
	public String value;

	public Original(String value) {
		this.value = value;
	}

	public String getValue() {
		return value;
	}

	public void setValue(String value) {
		this.value = value;
	}
	
	public Memento createMemento() {
		return new Memento(this.value);
	}
	
	public void restoreMemento(Memento memento) {
		this.value = memento.getValue();
	}
	
}
