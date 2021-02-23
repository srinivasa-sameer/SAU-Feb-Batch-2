
public class Main {

	public static void main(String[] args) {

        SingletonDemo x = SingletonDemo.getInstance(); 
        SingletonDemo y = SingletonDemo.getInstance(); 
  
        x.str = (x.str).toUpperCase(); 
        System.out.println("X is " + x.str); 
        System.out.println("\n"); 
        y.str = (y.str).toLowerCase(); 
        System.out.println("Y " + y.str); 
	}

}
