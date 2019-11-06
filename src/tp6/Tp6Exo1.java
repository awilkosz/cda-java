/*Nom du répertoire : TP6
Nom du projet : Tp6Exo1
Nom de la classe : Tp6Exo1*/
package tp6;

import java.util.Scanner;

public class Tp6Exo1 {

	public static void main(String[] args) {
		Scanner saisie = new Scanner(System.in);
		
		System.out.println("Saisir un texte: ");
		String text = saisie.nextLine();
		int counte = 0;
		

		for(int i=0; i < text.length(); i++)
		{
			char ch = text.charAt(i);
			if(ch == 'e')
				counte++;
		}
		
		System.out.print("Nombre de 'e' : " + counte);
		saisie.close();
	}

}
