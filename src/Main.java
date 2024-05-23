//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        FigurasGeo miFigura = new FigurasGeo();
        Circulos miFigura2 = new Circulos();
        Triangulos miFigura3 = new Triangulos();
        Cuadrilateros miFigura4 = new Cuadrilateros();

        Circulos miFigura5 = new Circulos(3.0);
        Triangulos miFigura6 = new Triangulos(6.0, 8.0);
        Cuadrilateros miFigura7 = new Cuadrilateros(5.0, 5.0);
        Cuadrilateros miFigura8 = new Cuadrilateros(5.0, 10.0);
/*
        //Figura2
        miFigura2.setNombre("Pileta CEC");
        System.out.println(miFigura2.getNombre());

        System.out.println("La nueva Pileta tendrá un radio de:");
        miFigura2.setRadio(4.0);
        System.out.println(miFigura2.getRadio());

        System.out.println("Y su área será: ");
        System.out.println(miFigura2.calcularArea());

        //Figura3
        miFigura3.setNombre("Señal de Transito");
        System.out.println(miFigura3.getNombre());

        System.out.println("La señal de transito tiene una base de:");
        miFigura3.setBase(0.5);
        System.out.println(miFigura3.getBase());

        System.out.println("La señal de transito tiene una altura de:");
        miFigura3.setAltura(0.6);
        System.out.println(miFigura3.getAltura());

        System.out.println("Su área es de: ");
        System.out.println(miFigura3.calcularArea());

        System.out.println("Y su perímetro es de: ");
        System.out.println(miFigura3.calcularPerimetro());

        //Figura4
        miFigura4.setNombre("Monitor DELL");
        System.out.println(miFigura4.getNombre());

        System.out.println("El monitor tiene un largo de:");
        miFigura4.setLargo(0.5);
        System.out.println(miFigura4.getLargo());

        System.out.println("El monitor tiene una ancho de:");
        miFigura4.setAncho(0.25);
        System.out.println(miFigura4.getAncho());

        System.out.println("Su área es de: ");
        System.out.println(miFigura4.calcularArea());

        System.out.println("Y su perímetro es de: ");
        System.out.println(miFigura4.calcularPerimetro());

        //Figura5
        miFigura5.setNombre("Pizza");
        System.out.println(miFigura5.getNombre());

        System.out.println("La pizza tiene un radio de:");
        System.out.println(miFigura5.getRadio());

        System.out.println("Su área es de: ");
        System.out.println(miFigura5.calcularArea());

        System.out.println("Y su perímetro es de: ");
        System.out.println(miFigura5.calcularPerimetro());

        //Figura6
        miFigura6.setNombre("Señal Peligro");
        System.out.println(miFigura6.getNombre());

        System.out.println("La señal tiene una base de:");
        System.out.println(miFigura6.getBase());

        System.out.println("El monitor tiene una ancho de:");
        System.out.println(miFigura6.getAltura());

        System.out.println("Su área es de: ");
        System.out.println(miFigura6.calcularArea());

        System.out.println("Y su perímetro es de: ");
        System.out.println(miFigura6.calcularPerimetro());*/

        Heptagono miFigura9 = new Heptagono();
        System.out.println(miFigura9.getNumLados());
        miFigura9.setNombre("Edificio");
        System.out.println(miFigura9.getNombre());



    }
}