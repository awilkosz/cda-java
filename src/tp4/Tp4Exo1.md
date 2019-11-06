ALGORITHME CalculeMoyenne
ROLE
	//L'utilisateur saisit le nombre de notes qu'il souhaite saisir, puis les notes, enfin, le proramme affiche la moyenne
Variables
	ENTIER: nbNotes, i
	REEL: moyenne, note
DEBUT
	nbNotes <- saisir("Combien de notes ?")
	moyenne <- 0
	
	POUR i ALLANT_DE 0 à nbNotes
		afficher("note " + chaine(i))
		note <- saisir()
		moyenne <- moyenne + note
	FIN_POUR
	
	afficher("Moyenne de ces " + chaine(nbNotes) + " notes " + chaine(moyenne / nbNotes))
FIN