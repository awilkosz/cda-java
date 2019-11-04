package tp4;

public class Tp4Exo9 {

	public static void main(String[] args) {
		long pions = 1;
		
		
		for(int i=1; i <= 64; i++)
		{
			if(i == 64)
				pions = (long) Math.pow(2, 63);
			
			System.out.println("Nombres de pions sur la case " + i + " : " + pions);
			pions = pions + pions;
		}
	}

}
