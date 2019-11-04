package tp4;

import java.util.Scanner;

public class Tp4Exo6 {

	public static void main(String[] args) {
		Scanner saisie = new Scanner(System.in);
		
		System.out.println("Donner une valeur entre 1 et 100 inclue");
		int n = saisie.nextInt();
		String addition = "";
		int somme = 0;
		
		if(n < 1 || n > 100)
			System.out.println("Nombre trop grand ou trop petit !");
		else
		{
			int i = 1;
			while(n > 0)
			{
				if(addition == "")
					addition = (i) + " + ";
				else
					addition = addition + " + " + (i);
				somme += i;
				i = i + 2;
				n--;
			}
			
			System.out.println(addition + " = " + somme);
		}
		
		
		saisie.close();
	}

}
