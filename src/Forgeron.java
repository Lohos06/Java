import metaux.MetauxAbstractClass;

public class Forgeron {

    String nom;
    int maitrise;

    Forgeron(String nom, int maitrise) {
        this.nom = nom;
        this.maitrise = maitrise;
    }

    public void fonte(MetauxAbstractClass Metal) {
        if (Metal.getForme() != "liquide") {
            Metal.setForme("liquide");
            System.out.println("Metal fondu");
        } else {
            System.out.println("Metal deja liquide");
        }
    }
}
