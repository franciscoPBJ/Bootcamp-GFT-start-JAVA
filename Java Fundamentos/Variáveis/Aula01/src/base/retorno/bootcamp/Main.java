package base.retorno.bootcamp;

public class Main {
    public static void main(String[] args) {

        double areaQuadrado = Retorno.area(10.5);
        System.out.println("Area: " + areaQuadrado);
        double areaRetangulo = Retorno.area(10.5f,2.5f);
        System.out.println("Area: " + areaRetangulo);
        double areaLosango = Retorno.area(10.5,2.5, 5);
        System.out.println("Area: " + areaLosango);


    }
}
