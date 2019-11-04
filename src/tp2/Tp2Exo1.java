package tp2;
import java.util.Scanner;

public class Tp2Exo1 {

	public static void main(String[] args) {
		Scanner saisie = new Scanner(System.in);
		
		int valeur1;
		int valeur2;
		System.out.print("Saisir un entier : ");
		valeur1 = saisie.nextInt();
		System.out.print("Saisir un autre entier : ");
		valeur2 = saisie.nextInt();
		System.out.print("Résultat = "+ (valeur1 + valeur2));
		saisie.close();

	}

}
