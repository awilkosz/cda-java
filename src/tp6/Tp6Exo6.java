/*Nom du répertoire : TP6
Nom du projet : Tp6Exo6
Nom de la classe : Tp6Exo6*/
package tp6;

import javax.swing.JOptionPane;

public class Tp6Exo6 {

	public static void main(String[] args) {
		String grille1 = genereGrilleUnicode(128,255);
		String grille2 = genereGrilleUnicode(256,351);
		

		JOptionPane.showMessageDialog(null, grille1, "TABLEAU", JOptionPane.PLAIN_MESSAGE);
		JOptionPane.showMessageDialog(null, grille2, "TABLEAU", JOptionPane.PLAIN_MESSAGE);
	}
	
	public static String genereGrilleUnicode(int min, int max)
	{
		String grille = "<html><table border='1'>";
		grille = grille + "<tr><th>Dec</th><th>Hex</th><th>Car</th></tr>";
		
		for(int i=min; i<=max;i++)
		{
			grille = grille + "<tr><th>" + i + "</th><th>" + Integer.toHexString(i) + "</th><th>" + (char)i + " </th></tr>";
		}
		
		grille = grille + "</table></html>";
		return grille;
	}

}
