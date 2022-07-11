public class Main {
    public static void main(String[] args) {
        // 1era. salida del Programa
        var resultado = suma(10, 20, 30);
        System.out.println(resultado);

        // 2da. salida del Programa
        Coche miCoche = new Coche();
        miCoche.AgregarPuertas();
        System.out.println(miCoche.puertas);
    }

    public static int suma(int a, int b, int c) {
        return a + b + c;
    }
}

class Coche {
    public int puertas = 4;

    public void AgregarPuertas() {
        this.puertas++;
    }
}