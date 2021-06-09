package Sampleprograms;

public class ReverseString {

	public static void main(String[] args) {
		//Reverse a string using two variables.
		
		String str = "India";
		//converting stri nt to array
		char [] ch=str.toCharArray();
		//reversing a string
          for(int i= ch.length-1;i>=0;i--)
          {
        	  System.out.print(ch[i]);
          }
	}

}
