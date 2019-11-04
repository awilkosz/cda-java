package tp4;

import javax.swing.JOptionPane;

public class Tp4Exo5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int code = 12345;
		
		String texte; 
		int saisie; 
		
		boolean flag = true;
		int nbEssais = 5;
		
		while(flag == true && nbEssais > 0)
		{
			texte = JOptionPane.showInputDialog(null, "Veuillez saisir le code :");
			saisie = Integer.parseInt(texte);
			
			if(saisie == code)
			{
				JOptionPane.showMessageDialog(null, "Code validé");
				flag = false;
			}
			else
				nbEssais--;
		}
		
		if(nbEssais == 0)
			JOptionPane.showMessageDialog(null, "Vous avez épuisé tous vos essais");
	}

}
