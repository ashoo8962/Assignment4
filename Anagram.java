import java.util.Arrays;
import java.util.Scanner;
public class Anagram {

	public static void main(String[] args) {
		Scanner scan =new Scanner(System.in);
		System.out.println("Enter Strings for Anagram  ");
		System.out.println("Enter String 1 :");
		String str1=scan.nextLine();
		System.out.println("Enter String 2 :");
		String str2=scan.nextLine();	    
		    str1 = str1.toLowerCase();
		    str2 = str2.toLowerCase();
		    if(str1.length() == str2.length()) 		    {
			      char[] charArray1 = str1.toCharArray();
			      char[] charArray2 = str2.toCharArray();
			      Arrays.sort(charArray1);
			      Arrays.sort(charArray2);
			      boolean flag = Arrays.equals(charArray1, charArray2);

			      if(flag) {
			        System.out.println(str1 + " and " + str2 + " are anagram.");
			      }
			      else {
			        System.out.println(str1 + " and " + str2 + " are not anagram.");
			      }			      
		   }		    
		    else {
		      System.out.println(" You Entered areNot anagram");
		 }
	}

}
