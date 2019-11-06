/*Nom du répertoire : TP5
Nom du projet : Tp5Exo4
Nom de la classe : Tp5Exo4*/
package tp5;

import java.util.Scanner;

public class Tp5Exo4 {

	public static void main(String[] args) {
		Scanner saisie = new Scanner(System.in);
		
		System.out.println("Combien de notes : ");
		int nbNotes = saisie.nextInt();
		double tab[] = new double [nbNotes];
		double moyenne = 0;
		int nbNotesSup = 0;
		
		for(int i=0; i<nbNotes; i++)
		{
			System.out.println("note " + (i+1));
			tab[i] = saisie.nextDouble();
			moyenne += tab[i];
		}
		
		moyenne = moyenne / nbNotes;
		System.out.println("Moyenne de ces " + nbNotes + " notes : " + moyenne);
		
		for(double val: tab)
		{
			if(val > moyenne)
				nbNotesSup++;
		}
		
		System.out.println("Nombres de notes supérieures à la moyenne : " + nbNotesSup);
		saisie.close();
	}

}
