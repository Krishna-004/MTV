package Sampleprograms;

import java.util.HashSet;

public class PrintOnlyUniqueWords {

	public static void main(String[] args) {
String str ="welcome to hyderabad welcome to Andhra Pradesh";
	    
		String []str1 = str.split(" ");
		HashSet<String> set = new HashSet<String>();
         for(int i=0;i<str1.length;i++)
         {
        	 set.add(str1[i]);
         }
         System.out.println(set);

        for(String word : set)
        {
        	int count =0;
        	 for(int i=0;i<str1.length;i++)
        	 {
        		 if(word.equals(str1[i]))
        		 {
        			 count++;
        		 }
        }
	
	if(count<2)
	
	System.out.println(word +"="+ count);
	}

	}

}
