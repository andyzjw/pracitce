package visitor;

public class Test {
	public static void main(String[] args) {
		Visitor vis = new MyVisitor();
		
		Subject sub = new MySubject();
		
		vis.visit(sub);
				
	}
}
