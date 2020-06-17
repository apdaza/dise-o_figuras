package proyecto.logica;

public class Rectangulo extends Figura {

    @Override
    public void dibujar() {
        System.out.println("Dibujando un rectangulo");

    }

    @Override
    public void calcularArea() {
        Punto temp = new Punto(this.puntos[0].getX(), this.puntos[1].getY());
        this.area = this.puntos[0].calcularDistancia(temp) * temp.calcularDistancia(this.puntos[1]);
    }

    @Override
    public void calcularPerimetro() {
        Punto temp = new Punto(this.puntos[0].getX(), this.puntos[1].getY());
        this.perimetro = (this.puntos[0].calcularDistancia(temp) * 2) + (temp.calcularDistancia(this.puntos[1]) * 2);

    }
    
}