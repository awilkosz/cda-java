package tp5;

public class Tp5Exo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int matrice1[][] = {{2, 3, -1}, {6, 1, -2}};
		int matrice2[][] = {{4, -5}, {-3, 0}, {1, 2}};
		int calc = 0;
		int i, j;
		
		for(i=0; i<2; i++)
		{
			calc = 0;
			for(j=0; j<3; j++)
			{
				calc += matrice1[i][j] * matrice2[j][i]; 
			}
			System.out.println(calc);
		}
		
	}

}
