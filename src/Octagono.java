public class Octagono extends FigurasGeo{

    Double apotema;
    Double lado;

    public Octagono(){
        super("", 8);
    }

    public Octagono(String nombre, int numLados, Double apotema, Double lado) {
        super(nombre, 8);
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
        return 4*apotema*lado;
    }
    public double calcularPerimetro(){
        return lado*getNumLados();
    }

}
