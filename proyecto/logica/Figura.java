package proyecto.logica;

public abstract class Figura implements Dibujable {
    protected Punto[] puntos = new Punto[2];
    protected int area;
    protected int perimetro;

    public abstract void calcularArea();

    public abstract void calcularPerimetro();

    public void agregarPunto(Punto p) {
        if (puntos[0] == null){
            puntos[0] = p;
        }else{
            puntos[1] = p;
        }
    }

    public int getArea(){
        return this.area;
    }

    public int getPerimetro() {
        return this.perimetro;
        
    }
}