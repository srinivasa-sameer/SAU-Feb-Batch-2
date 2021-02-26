import java.io.*;
import java.util.*;
class WordCountSingleThread implements Runnable 
{  
    String string;
    public WordCountSingleThread(String str)
    {
        this.string=str;
    }
    public void run()
	{
		int count=0,i=0;  
        char words[]= new char[string.length()]; 
        long start = System.nanoTime();
        while(i<string.length())  
        {
            words[i]= string.charAt(i);  
            if( ((i>0)&&(words[i]!=' ')&&(words[i-1]==' ')) || ((words[0]!=' ')&&(i==0)) )  
                count++; 
            i++;
        }
        long end = System.nanoTime();
        System.out.println("Single Thread:");
        System.out.println(count +" words."); 
        long time = end - start;
        System.out.println("Time Taken: "+time+" ns");
    } 
}  
class SingleThread
{
    public static void main(String[] args) 
       {  
    	String string ="He wondered if he should disclose the truth to his friends. It would be a risky move."
        		+ " Yes, the truth would make things a lot easier if they all stayed on the same page, but the truth might fracture the group leaving everything in even more"
        		+ " of a mess than it was not telling the truth."
        		+ " It was time to decide which way to go.\r\n";
            Thread t1 = new Thread(new WordCountSingleThread(string));
            t1.start();
        }
}  
