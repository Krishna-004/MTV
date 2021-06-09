package Sampleprograms;

import java.util.HashSet;

public class CountOnlyDuplicateWords {

	public static void main(String[] args) {
String str ="welcome to hyderabad welcome to Andhra Pradesh";
	    
		String []str1 = str.split(" ");
		HashSet<String> set = new HashSet<String>();
         for(int i=0;i<str1.length;i++)
         {
        	 set.add(str1[i]);
         }
         System.out.println(set);
         int count1=0;
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
	
	if(count>1) {
		count1++;
	}
	
	
	}
        System.out.println( count1);
	}

}
