
public class ImplementationClass implements FunctionalInterfaceDemo{

	public static void main(String[] args) {
		
		// This is the implementation of function interface with java8.
		FunctionalInterfaceDemo demo=(name)->{  
            System.out.println("Hi "+ name);  
        };  
        demo.printHello("Ayush");
        
        ImplementationClass implementationClass = new ImplementationClass();
        implementationClass.printHello("Ayush");
	}

	// This is the implementation of function interface without java8, just like normal interfaces.
	@Override
	public void printHello(String word) {

		System.out.println(word);
	}
}
