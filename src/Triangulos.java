public class Triangulos extends FigurasGeo {

    Double base;
    Double altura;


    public Triangulos() {
        super("", 3);
    }

    public Triangulos(Double base, Double altura) {
        this.base = base;
        this.altura = altura;

    }

    public Double getBase() {
        return base;
    }

    public void setBase(Double base) {
        this.base = base;
    }

    public Double getAltura() {
        return altura;
    }
    public void setAltura(Double altura) {
        this.altura = altura;
    }

    //Metodos

    public Double calcularArea() {
        return (base*altura)/2;
    }
    public Double calcularPerimetro() {
        return (2*base)+2*altura;
    }

}
