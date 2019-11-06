/*Nom du répertoire : TP7
Nom du projet : Tp7Exo1
Nom de la classe : Tp7Exo1*/
package tp7;

import java.util.Scanner;

public class Tp7Exo1 {

	public static void main(String[] args) {
		Scanner saisie = new Scanner(System.in);
		System.out.println("Saisir le rayon du cercle : ");
		int r = saisie.nextInt();
		
		System.out.println(surface(r));
		System.out.println(perimetre(r));
		saisie.close();
	}

	public static double surface(int rayon)
	{
		return Math.PI * Math.pow(rayon, 2);
	}
	
	public static double perimetre(int rayon)
	{
		return 2 * Math.PI * rayon;
	}
}
