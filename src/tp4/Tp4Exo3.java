/*Nom du répertoire : TP4
Nom du projet : Tp4Exo3
Nom de la classe : Tp4Exo3*/
package tp4;

import java.util.Scanner;

public class Tp4Exo3 {

	public static void main(String[] args) {
		Scanner saisie = new Scanner(System.in);
		
		System.out.print("Combien de lignes :");
		int nbLignes = saisie.nextInt();
		
		for(int i = 1; i <= nbLignes; i++)
		{
			for(int j = 0; j < i; j++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
		saisie.close();
	}

}
