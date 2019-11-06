/*Nom du répertoire : TP5
Nom du projet : Tp5Exo6
Nom de la classe : Tp5Exo6*/
package tp5;

import java.util.Scanner;

public class Tp5Exo6 {

	public static void main(String[] args) {
		Scanner saisie = new Scanner(System.in);
		
		System.out.println("Saisir un nombre entier: ");
		int nb = saisie.nextInt();
		
		String bin = Integer.toString(nb, 2);
		String hex = Integer.toString(nb, 16);
		
		System.out.println("Valeur de " + nb + " en base de 2 " + bin + " en base de 16 " + hex);
		saisie.close();
	}

}
