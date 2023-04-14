package Ejercicio9;

public class Poligono {
    protected int numeroLados;

    public Poligono(int numeroLados) {
        this.numeroLados = numeroLados;
    }

    public int getNumeroLados() {
        return numeroLados;
    }

    @Override
    public String toString() {
        return "Numero Lados = " + numeroLados;
    }

    //Declaramos el metodo area de modo abstracto
    public double area() {
        return 0;
    }
}
