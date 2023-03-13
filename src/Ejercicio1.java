
import entidades.Animal;
import entidades.Perro;
import entidades.Gato;
import entidades.Caballo;
public class Ejercicio1 {
    public static void main(String[] args) {
        Animal p1 = new Perro("Stich", "Carnivoro", 15, "Doberman");
        p1.Alimentarse();
        Animal p2 = new Perro("Teddy", "Croquetas", 10, "Chihuahua");
        p2.Alimentarse();
        Animal g1 = new Gato("Pelusa", "Galletas", 15, "Siamés");
        g1.Alimentarse();
        Animal c1 = new Caballo("Spark", "Pasto", 25, "Fino");
        c1.Alimentarse();
    }
}
