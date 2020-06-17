package proyecto;

import proyecto.logica.*;

public class Cliente {
    public static void main(String[] args) {
        Figura f = new Circulo();

        f.agregarPunto(new Punto(0, 5));
        f.agregarPunto(new Punto(10, 0));

        f.calcularArea();
        f.calcularPerimetro();

        System.out.println(f.getArea());
        System.out.println(f.getPerimetro());
        f.dibujar();
    }
}