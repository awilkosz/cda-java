/*Nom du répertoire : TP6
Nom du projet : Tp6Exo3
Nom de la classe : Tp6Exo3*/
package tp6;

import java.util.Scanner;

public class Tp6Exo3 {

	public static void main(String[] args) {
		Scanner saisie = new Scanner(System.in);
		String text = "";
		String textInverse = "";
		
		do
		{
			System.out.println("Saisir un texte: ");
			text = saisie.nextLine();
		}while(text.length() > 30);
		
		for(int i = text.length()-1; i >= 0; i--)
		{
			textInverse += text.charAt(i);
		}
		
		System.out.println(textInverse);
		saisie.close();
	}

}
