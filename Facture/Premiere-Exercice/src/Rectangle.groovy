public class Rectangle extends Forme {

    String nom="Je suis un rectagle  ma surface est de :"
    double longeur
    double largeur

    Rectangle(largeur, longeur) {
        this.largeur = largeur
        this.longeur = longeur
    }

    void affichage() {
        println(nom +" "+ this.formule())
    }

    @Override
    double formule() {
        return  longeur * largeur
    }
}