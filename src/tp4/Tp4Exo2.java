package tp4;

import java.util.Scanner;

public class Tp4Exo2 {

	public static void main(String[] args) {
		Scanner saisie = new Scanner(System.in);
		
		int i = 0;
		double moyenne = 0;
		double note = 0;
		
		do
		{
			System.out.println("Note " + (i+1));
			note = saisie.nextDouble();
			if(note >= 0)
			{
				moyenne += note;
				i++;
			}
		} while(note >= 0);
		
		System.out.println("moyenne de ces " + i + " notes : " + (moyenne / i));
		saisie.close();

	}

}
