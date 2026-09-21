public class Chat {

    String nom;
    String etat;

    public Chat (String nom){
        this.nom = nom;
        this.etat = "saint";
    }

    public String getNom () {
        return nom;
    }
    public String getEtat () {
        return etat;
    }

    public String manger(Nourriture nourriture){
        if (nourriture.getNom() == "Fer pur" || nourriture.getNom() == "Acier" || nourriture.getNom() == "Fonte" || nourriture.getNom() == "Cementite" || nourriture.getNom() == "Graphite" || nourriture.getNom() == "Carbone pur") {
            this.etat = "malade";
        }
        return this.etat;
    }
}
