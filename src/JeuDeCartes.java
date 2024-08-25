import java.util.*;
enum Couleur {
    CARREAUX, COEUR, PIQUE, TREFLE
}

// Enum pour les valeurs des cartes
enum Valeur {
    AS, DEUX, TROIS, QUATRE, CINQ, SIX, SEPT, HUIT, NEUF, DIX, VALET, DAME, ROI
}
// Classe représentant une carte
class Carte {
    Couleur couleur;
    Valeur valeur;

    public Carte(Couleur couleur, Valeur valeur) {
        this.couleur = couleur;
        this.valeur = valeur;
    }

    @Override
    public String toString() {
        return valeur + " de " + couleur;
    }
}
class RandomOrders {
    private List<Couleur> randomColors;
    private List<Valeur> randomValues;

    public RandomOrders(List<Couleur> randomColors, List<Valeur> randomValues) {
        this.randomColors = randomColors;
        this.randomValues = randomValues;
    }

    public List<Couleur> getRandomColors() {
        return randomColors;
    }

    public List<Valeur> getRandomValues() {
        return randomValues;
    }
}

public class JeuDeCartes {

    // Méthode pour générer un ordre aléatoire des couleurs
    public static List<Couleur> ordreAleatoireCouleurs() {
        List<Couleur> couleurs = Arrays.asList(Couleur.values());
        Collections.shuffle(couleurs);
        return couleurs;
    }

    // Méthode pour générer un ordre aléatoire des valeurs
    public static List<Valeur> ordreAleatoireValeurs() {
        List<Valeur> valeurs = Arrays.asList(Valeur.values());
        Collections.shuffle(valeurs);
        return valeurs;
    }

    public static RandomOrders generateRandomOrders() {
        List<Couleur> couleurs = new ArrayList<>(Arrays.asList(Couleur.values()));
        Collections.shuffle(couleurs);

        List<Valeur> valeurs = new ArrayList<>(Arrays.asList(Valeur.values()));
        Collections.shuffle(valeurs);

        return new RandomOrders(couleurs, valeurs);
    }

    // Méthode pour créer un jeu de cartes selon l'ordre des couleurs et des valeurs
    public static List<Carte> creerJeuDeCartes() {
        List<Carte> jeuDeCartes = new ArrayList<>();
        for (Couleur couleur : Couleur.values()) {
            for (Valeur valeur : Valeur.values()) {
                jeuDeCartes.add(new Carte(couleur, valeur));
            }
        }
        return jeuDeCartes;
    }

    // Méthode pour tirer une main de 10 cartes de manière aléatoire
    public static List<Carte> tirerMain(List<Carte> jeuDeCartes) {
        Collections.shuffle(jeuDeCartes);
        return jeuDeCartes.subList(0, 10);
    }

    // Méthode pour trier une main de cartes par couleur puis valeur
    public static List<Carte> trierMain(List<Carte> main, List<Couleur> ordreCouleurs, List<Valeur> ordreValeurs) {
        main.sort((c1, c2) -> {
            int compareCouleur = ordreCouleurs.indexOf(c1.couleur) - ordreCouleurs.indexOf(c2.couleur);
            if (compareCouleur == 0) {
                return ordreValeurs.indexOf(c1.valeur) - ordreValeurs.indexOf(c2.valeur);
            }
            return compareCouleur;
        });
        return main;
    }

    public static void main(String[] args) {
        //List<Couleur> ordreCouleurs = ordreAleatoireCouleurs();
        //List<Valeur> ordreValeurs = ordreAleatoireValeurs();
        RandomOrders RandomOrder = generateRandomOrders();
        // Affichage de l'ordre aléatoire des couleurs
        System.out.println("Ordre aléatoire des couleurs : " + RandomOrder.getRandomColors());

        // Affichage de l'ordre aléatoire des valeurs
        System.out.println("Ordre aléatoire des valeurs : " + RandomOrder.getRandomValues());

        List<Carte> jeuDeCartes = creerJeuDeCartes();
        List<Carte> main = tirerMain(jeuDeCartes);

        System.out.println("\nMain non triée :");
        for (Carte carte : main) {
            System.out.println(carte);
        }

        trierMain(main, RandomOrder.getRandomColors(), RandomOrder.getRandomValues());

        System.out.println("\nMain triée :");
        for (Carte carte : main) {
            System.out.println(carte);
        }
    }
}
