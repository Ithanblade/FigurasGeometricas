public class Cuadrilateros extends FigurasGeo {

    Double largo;
    Double ancho;

    public Cuadrilateros() {
        super("", 4);
    }

    public Cuadrilateros(Double largo, Double ancho) {
        this.largo = largo;
        this.ancho = ancho;
    }

    public Double getLargo() {
        return largo;
    }
    public void setLargo(Double largo) {
        this.largo = largo;
    }
    public Double getAncho() {
        return ancho;
    }
    public void setAncho(Double ancho) {
        this.ancho = ancho;
    }

    //Metodos

    public double calcularArea() {
        return largo * ancho;
    }
    public double calcularPerimetro() {
        return largo + ancho;
    }
}
