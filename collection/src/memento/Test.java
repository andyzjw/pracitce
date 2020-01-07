package memento;

import java.util.Scanner;

public class Test {
	public static void main(String[] args) {
		Original original = new Original("first");
		Storage storage = new Storage(original.createMemento());
		
		System.out.println("========================="+original.getValue());
		
		original.setValue("second");
		
		System.out.println("========================="+original.getValue());
		
		original.restoreMemento(storage.getMemento());
		
		System.out.println("========================="+original.getValue());
		
	}
}
