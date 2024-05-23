public class Circulos extends FigurasGeo {

    Double radio;

    public Circulos() {}

    public Circulos(Double radio) {
        this.radio = radio;
    }


    public Double getRadio() {
        return radio;
    }
    public void setRadio(Double radio) {
        this.radio = radio;
    }

    //Metodos

    public double calcularArea() {
        return Math.PI * radio * radio;
    }
    public double calcularPerimetro() {
        return 2 * Math.PI * radio;
    }

}
