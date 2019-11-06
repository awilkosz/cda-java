package tp6;

import java.util.Arrays;
import java.util.Scanner;

public class Tp6Exo4 {

	public static void main(String[] args) {
		Scanner saisie = new Scanner(System.in);
		String tab_char[] = new String[30];

		for(int i=0; i<30;i++)
		{
			System.out.println("Saisir une chaine de caractères : ");
			tab_char[i] = saisie.next();
		}
		
		Arrays.sort(tab_char);
		
		for(String str: tab_char)
			System.out.println(str);
		
		saisie.close();
	}

}
