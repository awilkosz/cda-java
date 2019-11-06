/*Nom du répertoire : TP6
Nom du projet : Tp6Exo2
Nom de la classe : Tp6Exo2*/
package tp6;

import java.util.Scanner;

public class Tp6Exo2 {

	public static void main(String[] args) {
		Scanner saisie = new Scanner(System.in);
		
		System.out.println("Saisir un texte: ");
		String text = saisie.nextLine();

		text = text.replaceAll("e", "");
		System.out.print(text);
		saisie.close();
	}

}
