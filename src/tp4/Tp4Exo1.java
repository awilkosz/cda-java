/*Nom du r�pertoire : TP4
Nom du projet : Tp4Exo1
Nom de la classe : Tp4Exo1*/
package tp4;

import java.util.Scanner;

public class Tp4Exo1 {

	public static void main(String[] args) {
		Scanner saisie = new Scanner(System.in);
		
		System.out.print("Combien de notes ?");
		int nbNotes = saisie.nextInt();
		double moyenne = 0;
		
		for(int i = 0; i < nbNotes; i++)
		{
			System.out.println("Note " + (i+1));
			double note = saisie.nextDouble();
			moyenne += note;
		}
		
		System.out.println("moyenne de ces" + nbNotes + " notes : " + (moyenne / nbNotes));
		saisie.close();
	}

}
