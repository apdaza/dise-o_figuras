package proyecto.logica;

public class Punto {
    private int x;
    private int y;

    public Punto(int x, int y){
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return this.x;
    }
    
    public int getY() {
        return this.y;
    }

    public int calcularDistancia(Punto p) {
        return (int) Math.sqrt(Math.pow((p.x - this.x), 2.0) + Math.pow((p.y - this.y), 2.0));
    }
}