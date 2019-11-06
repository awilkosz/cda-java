ALGORITHME SurfacePerimetreCercle
ROLE
	//L'utilisateur saisit le rayon d'un cercle et le programme renvoie la surface et le périmètre du cercle
Variables
	ENTIER: r 
DEBUT
	r <- saisir("Saisir le rayon du cercle : ")
	afficher(surface(r))
	afficher(perimetre(r))
FIN

FONCTION surface(ENTIER rayon)
	PI <- 3.14159
	renvoyer PI * rayon ^ 2
FIN FONCTION

FONCTION perimetre(ENTIER rayon)
	PI <- 3.14159
	renvoyer 2 * PI * rayon
FIN FONCTION