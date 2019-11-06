ALGORITHME PlusGrandNombre
ROLE
	//L'utilisateur saisit 3 nombres entiers et la fonction plusGrand renvoie la plus grande valeur
Variables
	ENTIER: nb1, nb2, nb3
DEBUT
	nb1 <- saisir("Saisir le premier nombre entier : ")
	nb2 <- saisir("Saisir le deuxième nombre entier : ")
	nb3 <- saisir("Saisir le troisième nombre entier : ")
	
	afficher(plusGrand(nb1, nb2, nb3))
FIN

FONCTION plusGrand(ENTIER a, b, c)
	ENTIER  tab <- [a,b,c]
	Arrays<-Sort(tab)
	renvoyer tab[2]
FIN FONCTION