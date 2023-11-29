static void main(String[] args) {

    def carre=new Carre(10)
    def rectangle=new Rectangle(5,10)
    def cercle=new Cercle(180)

     List listforme=[carre,rectangle,cercle]
    listforme.each {it.affichage()
        println("GIT")

    }

}
