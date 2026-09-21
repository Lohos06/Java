public class Fer {

    String origine;
    boolean forge;
    String forme;
    float tauxCarbonne;
    String type;

    public Fer(String origine, float tauxCarbonne) {
        this.origine = origine;
        this.tauxCarbonne = tauxCarbonne;
        this.forme = null;
        this.forge = false;
        this.type = null;
        typeMetal();
    }


    public String getOrigine() {
        return this.origine;
    }

    public float getTauxCarbonne() {
        return this.tauxCarbonne;
    }

    public String getForme () {
        return this.forme;
    }

    public String getType() {
        typeMetal();
        return this.type;
    }

    public void typeMetal() {
        if (this.tauxCarbonne <= 1) {
            this.type = "acier";
        } else {
            this.type = "fer";
        }
    }

    public void decarbonnation (float pourcentage) {
        this.tauxCarbonne = this.tauxCarbonne - pourcentage;
        typeMetal();
    }

    public void carbonnation (float pourcentage) {
        this.tauxCarbonne = this.tauxCarbonne + pourcentage;
        typeMetal();
    }

    public String forger (String forme) {
        if (this.forge) {
            return "Deja forgé";
        } else {
            this.forme = forme;
            this.forge = true;

            return "Forge de " + forme;
        }
    }

    public void fonte() {
        this.forme = null;
        this.forge = false;
    }
}
