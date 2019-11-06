ALGORITHME CalculeMoyenne
ROLE
	//L'utilisateur saisit des notes jusqu'à ce qu'il saisisse -1, puis le proramme affiche la moyenne
Variables
	ENTIER: i
	REEL: moyenne, note
DEBUT
	i <- 0
	moyenne <- 0
	note <- 0
	
	REPETER
		afficher("note " + chaine(i))
		note <- saisir()
		SI note >= 0
			moyenne <- moyenne + note
			i <- i + 1
		FIN_SI
	JUSQU'A note < 0
	
	afficher("Moyenne de ces " + chaine(i) + " notes " + chaine(moyenne / nbNotes))
FIN