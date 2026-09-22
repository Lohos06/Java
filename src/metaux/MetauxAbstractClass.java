package metaux;

public class MetauxAbstractClass {

    String origine;
    String forme;
    float temperatureFonte;

    public String getOrigine() {
        System.out.println(this.origine);
        return this.origine;
    }
    public String getForme() {
        System.out.println(this.forme);
        return this.forme;
    }
    public float getTemperatureFonte() {
        System.out.println(this.temperatureFonte);
        return this.temperatureFonte;
    }


    public void setOrigine(String origine) {
        this.origine = origine;
    }
    public void setForme(String forme) {
        this.forme = forme;
    }
    public void setTemperatureFonte(float temperatureFonte) {
        this.temperatureFonte = temperatureFonte;
    }


}
