package Sampleprograms;

import java.util.LinkedHashSet;

public class RemoveDuplicateWordssWithThreeVariabless {

	public static void main(String[] args) {
		String s ="welcome to hyderabad welcome to Andhra Pradesh";
		String[] str = s.split(" ");
		LinkedHashSet<String> set = new LinkedHashSet<String>();
		for(int i=0;i<str.length;i++)
		{
			set.add(str[i]);
		}   
		   String res ="";
           for(String word: set)
           {
        	   res =res+ " " +word;
        	   
           

	}
           System.out.print(res);
	}

}
