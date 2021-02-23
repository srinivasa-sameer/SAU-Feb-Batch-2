public class SingletonDemo {

    private static SingletonDemo single = null; 
    public String str; 

    private SingletonDemo() 
    { 
        str = "Inside Singleton class"; 
    } 

    public static SingletonDemo getInstance() 
    { 
        if (single == null) 
            single = new SingletonDemo(); 
  
        return single; 
    } 
}