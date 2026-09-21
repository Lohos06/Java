void main() {
    Fer fer1 = new Fer("Alpes", 4);

    float tauxCarbonne = fer1.getTauxCarbonne();
    System.out.println(tauxCarbonne);

    String type = fer1.getType();
    System.out.println(type);

    fer1.decarbonnation(3.5F);

    tauxCarbonne = fer1.getTauxCarbonne();
    System.out.println(tauxCarbonne);

    type = fer1.getType();
    System.out.println(type);

    String forme = fer1.getForme();
    System.out.println(forme);

    fer1.forger("épée");

    forme = fer1.getForme();
    System.out.println(forme);

    fer1.fonte();

    forme = fer1.getForme();
    System.out.println(forme);


    Chat Oji = new Chat("Oji");
    Nourriture croquettes = new Nourriture("croquettes");
    Nourriture croquettesDeMetal = new Nourriture(fer1.getType());

    String etat = Oji.getEtat();
    System.out.println(etat);

    Oji.manger(croquettes);

    etat = Oji.getEtat();
    System.out.println(etat);

    Oji.manger(croquettesDeMetal);

    etat = Oji.getEtat();
    System.out.println(etat);
}
