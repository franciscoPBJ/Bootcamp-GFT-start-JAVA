package base.retorno.bootcamp;

public class Retorno {
    public static double area(double lado){
        return lado * lado;
    }
    public static float area(float lado1, float lado2){
        return lado1 * lado2;
    }
    public static double area(double ladoMaior, double ladoMenor, int altura ){
        return (ladoMaior+ladoMenor)*altura/2;
    }
}
