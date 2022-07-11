public class Main {
    public static void main(String[] args) {
        // 1era. salida del Programa
        suma(10, 20, 30);

        // 2da. salida del Programa
        Coche miCoche = new Coche();
        miCoche.AgregarPuertas();
        System.out.println("El numero de puertas del coche es: " + miCoche.puertas);
    }

    public static void suma(int a, int b, int c) {
        int resultado =  a + b + c;
        System.out.println(resultado);
    }
}

class Coche {
    public int puertas = 4;

    public void AgregarPuertas() {
        this.puertas++;
    }
}