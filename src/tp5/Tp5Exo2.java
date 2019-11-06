package tp5;

public class Tp5Exo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int matrice1[][] = {{2, 3, -1}, {6, 1, -2}};
		int matrice2[][] = {{4, -5}, {-3, 0}, {1, 2}};
		int calc = 0;
		int i = 0;
		int i2 = 0;
		int j2 = 0;
		int c = 0;
		int len1 = matrice1.length;
		int len2 = matrice2.length;
		System.out.println(len2);
		if(len1 == matrice2[0].length)
		{
			int matriceRes[][] = new int[matrice1.length][matrice2[0].length];
			while(i < 2)
			{
				calc = 0;
				
				for(int j=0; j<len2; j++)
				{
					calc += matrice1[i][j] * matrice2[j][i2];
				}
				c++;
				i2++;
				
				System.out.println(calc);
				matriceRes[i][j2] = calc;
				j2++;
				
				if(c == 2)
				{
					i++;
					c = 0;
					i2 = 0;
					j2 = 0;
				}
			}
			for(int a=0; a<matriceRes.length;a++)
			{
				for(int b=0; b<matriceRes[a].length; b++)
					System.out.println(matriceRes[a][b]);
			}
		}
		else
			System.out.println("Calcul impossible, le nombre de colonne d'une matrice n'est pas égal au nombre de rangées de l'autre");
	}

}
