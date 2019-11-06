/*Nom du répertoire : TP3
Nom du projet : Tp3Exo4
Nom de la classe : Tp3Exo4*/
package tp3;

import java.util.Scanner;
import javax.swing.JOptionPane;

public class Tp3Exo4 {

	public static void main(String[] args) {
		Scanner saisie = new Scanner(System.in);
		
		String heures = JOptionPane.showInputDialog(null, "Saisir les heures :");
		String minutes = JOptionPane.showInputDialog(null, "Saisir les minutes:");
		String secondes = JOptionPane.showInputDialog(null, "Saisir les secondes:");
		
		int h = Integer.parseInt(heures);
		int m = h * 60 + Integer.parseInt(minutes);
		int s = Integer.parseInt(secondes);

		JOptionPane.showMessageDialog(null, "Résultat = "+ (m * 60 + s));
		saisie.close();

	}

}
