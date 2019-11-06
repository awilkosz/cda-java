/*Nom du r�pertoire : TP4
Nom du projet : Tp4Exo7
Nom de la classe : Tp4Exo7*/
package tp4;

import java.util.Scanner;

public class Tp4Exo7 {

	public static void main(String[] args) {
		Scanner saisie = new Scanner(System.in);
		
		System.out.println("Donner une valeur entre -2147483648 et +2147483647 inclue");
		int n = saisie.nextInt();
		
		String bin = Integer.toString(n, 2); 
		
		System.out.println("Donner un num�ro de bit compris entre 0 et 31");
		int bit = saisie.nextInt();
		
		if(bit < 0 || bit > bin.length()-1)
			System.out.println("Le nombre est trop grand ou trop petit");
		else
			System.out.println("Dans l'�criture binaire du nombre " + n + ", le bit num�ro " + bit + " est � " + bin.charAt(bit));
		
		
		saisie.close();

	}

}
