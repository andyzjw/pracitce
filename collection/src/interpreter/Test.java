package interpreter;

public class Test {
	public static void main(String[] args) {
		int result = new Minus().interpreter(new Context(5,new Plus().interpreter(new Context(1, 1))));
		System.out.println(result);
		
	}
}
