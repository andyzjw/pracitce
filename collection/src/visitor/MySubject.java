package visitor;

public class MySubject implements Subject {

	@Override
	public void accept(Visitor visitor) {
		visitor.visit(this);
	}
	
	public String getSubject(){
		return "My love is you";
	}

}
