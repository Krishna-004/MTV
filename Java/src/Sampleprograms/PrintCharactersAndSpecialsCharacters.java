package Sampleprograms;

public class PrintCharactersAndSpecialsCharacters {

	public static void main(String[] args) {
		
		String s ="abc@123$xyz";
		char [] ch =s.toCharArray();
		String alpha="";
		String num="";
		String sp="";
		for(int i=0;i<ch.length;i++)
		{
			
			if(ch[i]>='A'&&ch[i]<='z')
			{
				alpha = alpha+ch[i];
			}
			else if(ch[i]>='0'&& ch[i]<='9')
			{
				num =num+ch[i];
			}
			else
			{
				sp =sp+ch[i];
			}
		}

	System.out.println(alpha+""+ num+""+ sp);
	}

}
