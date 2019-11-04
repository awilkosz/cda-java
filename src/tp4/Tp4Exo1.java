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
		
		System.out.println("moyenne de ces 4 notes : " + (moyenne / 4));
		saisie.close();
	}

}
