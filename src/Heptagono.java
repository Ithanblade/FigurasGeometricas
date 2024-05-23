public class Heptagono extends FigurasGeo{

    Double apotema;
    Double lado;


    public Heptagono() {
        super("", 7);
    }

    public Heptagono(String nombre, int numLados, Double apotema, Double lado) {
        super(nombre, 7);
        this.apotema = apotema;
        this.lado = lado;

    }

    public Double getApotema() {
        return apotema;
    }
    public void setApotema(Double apotema) {
        this.apotema = apotema;
    }
    public Double getLado() {
        return lado;
    }
    public void setLado(Double lado) {
        this.lado = lado;
    }

    //Metodos perso


    public double calcularArea(){
        return (getNumLados()*apotema*lado)/2;
    }
    public double calcularPerimetro(){
        return lado*getNumLados();
    }


}
