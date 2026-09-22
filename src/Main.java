import metaux.Fer;
import metaux.Or;

void main() {
    Forgeron Edward = new Forgeron("Edward", 1);

    Fer fer = new Fer("Alpes", 4);
    Or or = new Or("Caslav");

    Edward.fonte(fer);
    fer.getForme();

}
