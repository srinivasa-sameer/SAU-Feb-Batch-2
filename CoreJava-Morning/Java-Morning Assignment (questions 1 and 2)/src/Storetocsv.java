import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public class Storetocsv {
	public static void main(String[] args) {
	    String fileName = "./students.txt";
	    File file = new File(fileName); 
	    List<String> list = new ArrayList<String>();
	    String[] pair = new String[2];
	    try {
	    	FileReader f = new FileReader(file);
	        InputStreamReader isr = new InputStreamReader(new FileInputStream(f));
			String st; 
			  try {
				while ((st = isr.read()) != null) {
					pair = st.split(",");
					list.add(pair[0]);
					list.add(pair[1]); 
				  }
			} catch (IOException e) {
				e.printStackTrace();
			} 
		} catch (FileNotFoundException e) {
			
			e.printStackTrace();
		}
	    int n = list.size()/2;
	    HashMap<Integer,Integer> map = new HashMap();
	    for(int i=0;i<2*n;i+=2) {
	    	int a = Integer.parseInt(list.get(i));
	    	int b = Integer.parseInt(list.get(i+1));
	    	map.put(a, b);
	    }
	    
	    System.out.println(map);

        LinkedList<Map.Entry<Integer, Integer> > l = new LinkedList<Map.Entry<Integer, Integer> >(map.entrySet()); 
        Collections.sort(l, new Comparator<Map.Entry<Integer, Integer> >() { 
             public int compare(Map.Entry<Integer, Integer> m1, Map.Entry<Integer, Integer> m2) 
             { 
                         return (m2.getValue()).compareTo(m1.getValue()); 
             } 
          }); 
         HashMap<Integer, Integer> temp = new LinkedHashMap<Integer, Integer>(); 
         for (Map.Entry<Integer, Integer> aa : l) { 
             temp.put(aa.getKey(), aa.getValue()); 
         }
         System.out.println(temp);
         List<List<String>> csvData = getData(temp);
         for( List<String> s:csvData) {
            System.out.println(s);
         }
         try {
		        FileWriter csvWriter =  new FileWriter("TopFive.csv");
				for (List<String> rowData : csvData) {
					 csvWriter.append(String.join(",", rowData));
					 csvWriter.append("\n");
			    }
				csvWriter.flush();
				csvWriter.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
}
	private static  List<List<String>> getData(HashMap<Integer,Integer> temp) {
        List<String> header = Arrays.asList( "Rank", "Roll Number", "Total Marks(Max:300)") ;
        List<List<String>> list = new ArrayList<List<String>>();
        list.add(header);
        int rank = 1;   
        for(int r:temp.keySet()) {
        	List<String> record = Arrays.asList(String.valueOf(rank++),String.valueOf(r), String.valueOf(temp.get(r)));
        	list.add(record);
        	if(rank>5) {
        		break;
        	}
        }
        return list;
    }
}