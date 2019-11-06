/*Nom du répertoire : TP2
Nom du projet : Tp2Exo2
Nom de la classe : Tp2Exo2*/

package tp2;
import javax.swing.JOptionPane;
import java.util.Scanner;

public class Tp2Exo2 {

	public static void main(String[] args) {
		Scanner saisie = new Scanner(System.in);
		
		String texte1 = JOptionPane.showInputDialog(null, "Taper une valeur :");
		String texte2 = JOptionPane.showInputDialog(null, "Taper une autre valeur :");
		
		int valeur1 = Integer.parseInt(texte1);
		int valeur2 = Integer.parseInt(texte2);
		
		JOptionPane.showMessageDialog(null, "Résultat = "+ (valeur1 + valeur2));
		saisie.close();
	}

}
