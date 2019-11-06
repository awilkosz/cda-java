ALGORITHME TriangleEtoiles
ROLE
	//L'algorithme affiche un triangle s'étendant sur le nombre de ligne fourni en donnée
Variables
	ENTIER: i, j, nbLignes
DEBUT
	nbLignes <- saisir("Combien de lignes :")
	
	POUR i ALLANT_DE 1 à nbLignes
		POUR j ALLANT_DE 0 à i
			afficher("*")
		FIN_POUR
		afficher("\n")
	FIN_POUR
FIN