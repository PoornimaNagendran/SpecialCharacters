package guvipractise;
import java.util.Scanner;
public class SpecialCharacters {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		System.out.println("Count special characters");
		System.out.println("Enter the string");
		int count=0;
		String a=s.nextLine();
		for(int i=0;i<a.length();i++)
		{
			if(!(a.charAt(i)>47 && a.charAt(i)<58) && !(a.charAt(i)>=0 && a.charAt(i)<33) && !(a.charAt(i)>64 && a.charAt(i)<91) && !(a.charAt(i)>96 && a.charAt(i)<123))
				{
				count++;
			}
		}
		System.out.println("Count is "+count);
	}

}
