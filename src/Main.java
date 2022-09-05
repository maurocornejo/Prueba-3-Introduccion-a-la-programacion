public class Main {
    public static void main(String[] args) {

        Coche miCoche = new Coche();

        miCoche.agrgarPuerta();

        System.out.println(miCoche.puertas);

        suma(10, 30, 67);
    }
    public static void suma(int a, int b, int c) {

        System.out.println(a + b + c);

    }
}

class Coche {

    public int puertas = 4;

    public void agrgarPuerta(){

        this.puertas++;
    }
}