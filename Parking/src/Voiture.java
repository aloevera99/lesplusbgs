public class Voiture extends Vehicule{
    public String marque;
    public String couleur;
    public Boolean sportive;

    public Voiture(String marque, String couleur, Boolean sportive){
        this.couleur = couleur;
        this.marque = marque;
        this.sportive = sportive;
        super.nb_roues = 4;

        if(sportive == true){
            System.out.println("Je suis une voiture sportive ! ");
        }else
            System.out.println("Je ne suis pas une voiture sportive ! ");
    }

    public String demarrer(){
        return  "Je demarre la voiture";
    }

    public String arret(){
        return "Je m'arrete";
    }

}
