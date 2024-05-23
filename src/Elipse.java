public class Elipse extends FigurasGeo{

    int radioMayor;
    int radioMenor;

    public Elipse(){

    }
    public Elipse(int radioMayor, int radioMenor){
        this.radioMayor = radioMayor;
        this.radioMenor = radioMenor;
    }

    public int getRadioMayor(){
        return radioMayor;
    }
    public void setRadioMayor(int radioMayor){
        this.radioMayor = radioMayor;
    }
    public int getRadioMenor(){
        return radioMenor;
    }
    public void setRadioMenor(int radioMenor){
        this.radioMenor = radioMenor;
    }

    //Metodo
    public double calcularArea(){
        return Math.PI * radioMayor * radioMenor;
    }
    public double calcularPerimetro(){
        return 2 * Math.PI * Math.sqrt(((radioMayor * radioMayor) + (radioMenor * radioMenor)) / 2);

        // Richard Soria Insano
        //Hola
    }

}

