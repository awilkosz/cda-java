/*Nom du répertoire : TP6
Nom du projet : Tp6Exo5
Nom de la classe : Tp6Exo5*/
package tp6;

import javax.swing.JOptionPane;

public class Tp6Exo5 {

	public static void main(String[] args) {
		char valeur_car;
		int valeur_dec;
		String valeur_hexa;
		
		String grille = "<html><table border='1'>";
		grille = grille + "<tr><th>Dec</th><th>Hex</th><th>Car</th></tr>";
		
		for(int i=32; i<=127;i++)
		{
			valeur_dec = i;
			valeur_car = (char)valeur_dec;
			valeur_hexa = Integer.toHexString(valeur_dec);
			grille = grille + "<tr><th>" + valeur_dec + "</th><th>" + valeur_hexa + "</th><th>" + valeur_car + " </th></tr>";
		}
		
		grille = grille + "</table></html>";
		
		JOptionPane.showMessageDialog(null, grille, "TABLEAU", JOptionPane.PLAIN_MESSAGE);
	}

}
