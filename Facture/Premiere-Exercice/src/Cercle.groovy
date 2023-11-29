public class Cercle extends Forme {

    String nom = "Je suis un Cercle  ma surface est de :"
    double rayon

    Cercle(double rayon) {
        this.rayon = rayon
    }

    @Override

    double formule() {

        return rayon * rayon * 3.14
    }

    void affichage() {

        println(nom + " " + this.formule())
    }

}
