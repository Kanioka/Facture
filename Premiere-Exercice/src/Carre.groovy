public class Carre extends Forme {

    String nom = "Je suis un carré  ma surface est de :"
    double cote

    Carre(double cote) {
        this.cote = cote
    }

    @Override
    double formule() {

        return cote * cote
    }

    void affichage() {
        println(nom + "=" + this.formule())
    }
}
