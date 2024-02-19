/**
 * 
 */
package com.innerclassAsMethodArguments;

/**
 * @author 91888
 *
 */
public class ClasswhichGivesImplementation {
	
	public static void main(String[] args) {
		
		ClassUsingInterfaceObjectAsInput i = new ClassUsingInterfaceObjectAsInput();
		
		//giving the inner class as methodInput
		i.methodUsingInterfaceAsInput(new ParentInterface() {
			@Override
			public void method() {
				System.out.println("method running as a inner class");
			}
		});
		
		
		
		
	}
	
	
	

}
