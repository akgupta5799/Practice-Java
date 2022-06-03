//Java program to check given character is vowel or consonants.

import java.util.Scanner;
class CheckCharacter
{
	public static void main(String[] args)
	{
		System.out.println("Enter a character: ");
		Scanner sc = new Scanner(System.in);
		char ch = sc.next().charAt(0);
		if(ch=='a'|| ch=='e'|| ch=='i'||ch=='o'|| ch=='u')
		{
			System.out.println("Vowel");
		}
		else 
		{
			System.out.println("Consonant");
		}

	}
}