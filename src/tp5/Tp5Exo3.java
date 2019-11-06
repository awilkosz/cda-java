package tp5;

import java.util.Arrays;
import java.util.Scanner;

public class Tp5Exo3 {

	public static void main(String[] args) {
		Scanner saisie = new Scanner(System.in);
		
		System.out.println("Saisir la taille du tableau: ");
		int taille = saisie.nextInt();
		int tab[] = new int [taille];
		
		for(int i=0; i<taille; i++)
		{
			System.out.println("Saisir une valeur: ");
			tab[i] = saisie.nextInt();
		}
		
		Arrays.sort(tab);
		for(int val: tab)
		{
			System.out.println(val);
		}
		saisie.close();
	}

}
