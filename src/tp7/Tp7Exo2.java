/*Nom du répertoire : TP7
Nom du projet : Tp7Exo2
Nom de la classe : Tp7Exo2*/
package tp7;

import java.util.Arrays;
import java.util.Scanner;

public class Tp7Exo2 {

	public static void main(String[] args) {
		Scanner saisie = new Scanner(System.in);
		
		System.out.println("Saisir le premier nombre entier : ");
		int nb1 = saisie.nextInt();
		System.out.println("Saisir le deuxième nombre entier : ");
		int nb2 = saisie.nextInt();
		System.out.println("Saisir le troisième nombre entier : ");
		int nb3 = saisie.nextInt();
		
		System.out.println(plusGrand(nb1,nb2,nb3));
		saisie.close();
	}

	public static int plusGrand(int a, int b, int c)
	{
		int tab[] = {a, b, c};  
		Arrays.sort(tab);
		return tab[2];
	}
}
