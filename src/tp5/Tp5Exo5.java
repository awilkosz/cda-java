package tp5;

import java.util.Scanner;

public class Tp5Exo5 {

	public static void main(String[] args) {
		Scanner saisie = new Scanner(System.in);
		
		System.out.println("Saisissez un mot : ");
		String mot = saisie.next();
		String motInverse = "";

		for(int i = mot.length()-1; i >= 0; i--)
		{
			motInverse += mot.charAt(i);
		}
		
		System.out.println(motInverse + " " + mot);

		if(mot.equals(motInverse))
			System.out.println("Le mot " + motInverse + " est un palindrome");
		else
			System.out.println("Le mot " + motInverse + " n'est pas un palindrome");
		
		saisie.close();
	}

}
