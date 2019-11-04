package tp3;
import java.util.Scanner;

public class Tp3Exo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*EXO 1 : Réaliser un programme qui permet de traiter (lire et afficher) tous les types primitifs du langage JAVA, 
		ainsi   que les chaînes de caractères (String). 
		Rappel : Les types primitifs sont : boolean, byte, char, short, int, long, float et double.   
		Remarques :  La saisie d'une valeur réelle se fait en utilisant une virgule et non pas un point.    
		La saisie d'un booléen se fait en tapant false ou true (et non pas 0 ou 1).    
		Lecture.clavier.nextLine(); // Vide le tampon clavier. */
		Scanner saisie = new Scanner(System.in);
		
		boolean bool = saisie.nextBoolean();
		byte by = saisie.nextByte();
		char ch = saisie.next().charAt(0);
		short sho = saisie.nextShort();
		int i = saisie.nextInt();
		long lo = saisie.nextLong();
		float flo = saisie.nextFloat();
		double doub = saisie.nextDouble();
		String str = saisie.next();
		
		System.out.println(bool);
		System.out.println(by);
		System.out.println(ch);
		System.out.println(sho);
		System.out.println(i);
		System.out.println(lo);
		System.out.println(flo);
		System.out.println(doub);
		System.out.println(str);
		
		saisie.close();
	}

}
