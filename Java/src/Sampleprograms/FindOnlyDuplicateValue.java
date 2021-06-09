package Sampleprograms;

import java.util.HashSet;

public class FindOnlyDuplicateValue {

	public static void main(String[] args) {
		String str = "iamback";
		char [] ch = str.toCharArray();
		HashSet<Character> set = new HashSet<Character>();
		for(int i= 0;i<ch.length;i++)
		{
			set.add(ch[i]);
		}
         System.out.println(set);	
	
	      for(Character character : set)
	      {
	    	  int count=0;
	    	  for(int i=0;i<ch.length;i++)
	    	  {    
	    		 
	    		 if(character==ch[i]) {
	    			 count++;
	    		 }
	    	  }
	               if(count>1)
	          System.out.println(character+" ="+ count);     
	      
	      }
	
	}
	

}
