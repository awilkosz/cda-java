ALGORITHME TriangleEtoiles
ROLE
	//L'algorithme affiche un triangle s'�tendant sur le nombre de ligne fourni en donn�e
Variables
	ENTIER: i, j, nbLignes
DEBUT
	nbLignes <- saisir("Combien de lignes :")
	
	POUR i ALLANT_DE 1 � nbLignes
		POUR j ALLANT_DE 0 � i
			afficher("*")
		FIN_POUR
		afficher("\n")
	FIN_POUR
FIN