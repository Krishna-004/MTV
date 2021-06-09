import java.util.Scanner;

public class ReverseString {

	public static void main(String[] args) {
		String str;
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a name");
		str = scan.nextLine();
		char [] ch = str.toCharArray();
		for(int i = ch.length-1; i>=0; i --)
		{
			System.out.print(ch[i]);
		}
	}

}
