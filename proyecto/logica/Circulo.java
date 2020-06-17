package proyecto.logica;

public class Circulo extends Figura {

    @Override
    public void dibujar() {
        System.out.println("dibujando un circulo");

    }

    @Override
    public void calcularArea() {
        this.area = (int)(Math.pow(puntos[0].calcularDistancia(this.puntos[1]), 2) * Math.PI);

    }

    @Override
    public void calcularPerimetro() {
        this.perimetro = (int)(puntos[0].calcularDistancia(this.puntos[1]) * Math.PI * 2);

    }
    
}