/*Nom du répertoire : TP4
Nom du projet : Tp4Exo4
Nom de la classe : Tp4Exo4*/
package tp4;

import java.util.Scanner;

public class Tp4Exo4 {

	public static void main(String[] args) {
		Scanner saisie = new Scanner(System.in);
		
		System.out.print("Saisir un nombre");
		int nombre = saisie.nextInt();
		
		System.out.println("Affichage des " + nombre + " premiers nombres premiers");
		int nbP = 0;
		int inc = 2;
		
		while(nbP < nombre)
		{
			if(estPremier(inc) == true)
			{
				System.out.println(inc);
				nbP++;
			}
			inc++;
		}
		
		
		saisie.close();
	}

	public static boolean estPremier(int n)
	{
		int nbDiv = 0;
		boolean f = false;
		
		for(int i=1; i <= n; i++)
		{
			if(n % i == 0)
				nbDiv++;
		}
		
		if(nbDiv == 2)
		{
			f = true;
		}
		return f;
		
	}
}

