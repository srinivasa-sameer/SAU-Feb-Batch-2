import java.io.*;
import java.util.*;
class WithoutThread
{  
      static void wordcount(String string)  
        {  
            int count=0,i=0;
            char words[]= new char[string.length()];     
            while(i<string.length())  
            {  
                words[i]= string.charAt(i);  
                if( ((i>0) &&  (words[i]!=' ') && (words[i-1]==' ')) || ((words[0]!=' ')&&(i==0)) )  
                    count++;  
                i++;
            } 
            System.out.println("Without any thread");
            System.out.println("Number of Words: " + count);  
        }  
  public static void main(String[] args) 
   {  
            String string ="He wondered if he should disclose the truth to his friends. It would be a risky move."
            		+ " Yes, the truth would make things a lot easier if they all stayed on the same page, but the truth might fracture the group leaving everything in even more"
            		+ " of a mess than it was not telling the truth."
            		+ " It was time to decide which way to go.\r\n";
            long start = System.currentTimeMillis();
            wordcount(string);
            long end = System.currentTimeMillis();
            long time = end - start;
            System.out.println("Time Taken: "+time+ " ms");
   }  
}  