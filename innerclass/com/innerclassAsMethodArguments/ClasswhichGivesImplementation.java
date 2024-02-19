package com.innerclassAsMethodArguments;

public class ClasswhichGivesImplementation {
	
	public static void main(String[] args) {
		
		ClassUsingInterfaceObjectAsInput i = new ClassUsingInterfaceObjectAsInput();
		
		//creating anonymous inner class for the interface object
		i.methodUsingInterfaceAsInput(new ParentInterface() {
			@Override
			public void method() {
				System.out.println("method overriden using inner class");
			}
		});
		
		// output
		//method overriden using inner class
		
		
		
		
		
	}
	
	
	

}
