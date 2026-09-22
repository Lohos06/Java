import metaux.Fer;
import metaux.Or;
import java.util.Scanner;  // Import the Scanner class

void main() {

    Scanner myObj = new Scanner(System.in);

    System.out.println("Quel est vote nom ?");
    String forgeronNom = myObj.next();
    System.out.println("Quel est votre maitrise de la forge (entre 1 et 10) ?");
    int forgeronMaitrise = myObj.nextInt();

    Forgeron forgeron = new Forgeron(forgeronNom, forgeronMaitrise);

    System.out.println("Quel metal choisissez vous ? (Fer | Or)");
    String metalChoisi = myObj.next();
    System.out.println("D'ou vient votre minerai ?");
    String origine = myObj.next();


    if (metalChoisi == "Fer") {
        System.out.println("Quel est le taux de carbonne de votre Fer ?");
        float tauxCarbonne = myObj.nextFloat();
        Fer metal = new Fer(origine, tauxCarbonne);
    } else if (metalChoisi == "Or") {
        Or metal = new Or(origine);
    }
}
