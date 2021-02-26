import java.io.*;
import java.util.*;
class TwoThreads
{
    public static void main(String[] args) 
       {  
            String string1 ="It was going to rain. The weather forecast didn't say that, but the steel plate in his hip did."
            		+ " He had learned over the years to trust his hip over the weatherman."
            		+ " It was going to rain, so he better get outside and prepare.\r\n";
            		
            String string2 ="The boy walked down the street in a carefree way, playing without notice of what was about him. "
            		+ "He didn't hear the sound of the car as his ball careened into the road. He took a step toward it, and in doing so sealed his fate.";

            
            Thread t1 = new Thread(new WordCountFirstThread(string1));
            Thread t2 = new Thread(new WordCountSecondThread(string2));
            
            System.out.println("Two Threads");
            long start = System.nanoTime();
            t1.start();
            t2.start();
            long end = System.nanoTime();
            long time = end - start;
            System.out.println("Time taken: "+time+ " ns");
        }
}  
class WordCountFirstThread implements Runnable 
{  
    String string1;
    public WordCountFirstThread(String str1)
    {
        this.string1=str1;
    }
    public void run()
	{
		int count=0;  
        char words[]= new char[string1.length()];     
        for(int i=0;i<string1.length();i++)  
        {
            words[i]= string1.charAt(i);  
            if( ((i>0)&&(words[i]!=' ')&&(words[i-1]==' ')) || ((words[0]!=' ')&&(i==0)) )  
                count++; 
        }
        System.out.println("String 1 contains " + count + " words."); 
    } 
}  
class WordCountSecondThread implements Runnable 
{  
    String string2;
    public WordCountSecondThread(String str2)
    {
        this.string2=str2;
    }
    public void run()
	{
		int count=0;  
        char words[]= new char[string2.length()];     
        for(int i=0;i<string2.length();i++)  
        {
            words[i]= string2.charAt(i);  
            if( ((i>0)&&(words[i]!=' ')&&(words[i-1]==' ')) || ((words[0]!=' ')&&(i==0)) )  
                count++; 
        }
        System.out.println("String 2 contains " + count +" words."); 
    } 
}  