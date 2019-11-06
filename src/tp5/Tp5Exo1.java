package tp5;

import java.util.Scanner;

public class Tp5Exo1 {

	public static void main(String[] args) {
		// 1a
		int tab[] = new int [5];
		int max = 0;
		int nbZeros = 0;
		Scanner saisie = new Scanner(System.in);
		
		for(int i=0; i<5;i++)
		{
			System.out.println("Saisir une valeur : ");
			tab[i] = saisie.nextInt();
		}
		
		for(int val : tab)
		{
			if(val > max)
			{
				max = val;
			}
			
			if(val == 0)
			{
				nbZeros++;
			}
		}
		
		System.out.println("Plus grand élément : " + max);
		System.out.println("Nombre de zéros : " + nbZeros);
		
		//1b
		int tab2[][] = new int [2][3];
		max = 0;
		nbZeros = 0;
		
		for(int j=0; j<2; j++)
		{
			for(int k=0; k < 3; k++)
			{
				System.out.println("Saisir une valeur : ");
				tab2[j][k] = saisie.nextInt();
				
				if(tab2[j][k] > max)
					max = tab2[j][k];
				
				if(tab2[j][k] == 0)
					nbZeros++;
			}
		}
		
		System.out.println("Plus grand élément : " + max);
		System.out.println("Nombre de zéros : " + nbZeros);
		
		saisie.close();
	}

}
