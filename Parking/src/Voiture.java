public class Voiture extends Vehicule{
    public String marque;
    public String couleur;

    void voiture(String marque, String couleur){
        this.couleur = couleur;
        this.marque = marque;
        super.nb_roues = 4;
    }

}
