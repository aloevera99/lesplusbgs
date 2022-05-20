public class Vehicule {
    public int nb_roues;

    public static void main(String[] args) {

        Voiture voiture1 = new Voiture("Dacia", "Bleu",true);
        System.out.println("Voiture 1 : " + voiture1.demarrer());
        System.out.println("Voiture 1 : " + voiture1.arret());

        Voiture voiture2 = new Voiture("Lotus", "Verte", false);
        System.out.println("Voiture 2 : " + voiture2.demarrer());


    }
}
