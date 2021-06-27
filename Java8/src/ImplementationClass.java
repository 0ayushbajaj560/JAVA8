
public class ImplementationClass implements FunctionalInterfaceDemo{

	public static void main(String[] args) {
		
		// This is the implementation of function interface with java8.
		FunctionalInterfaceDemo demo=()->{  
            System.out.println("Hello World");  
        };  
        demo.printHello();
        
        ImplementationClass implementationClass = new ImplementationClass();
        implementationClass.printHello();
	}

	// This is the implementation of function interface without java8, just like normal interfaces.
	@Override
	public void printHello() {

		System.out.println("Hello");
	}
}
