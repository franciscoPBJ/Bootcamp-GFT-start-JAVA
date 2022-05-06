package base.metodos.bootcamp;

public class Calculadora {

    public static void soma (double number1, double number2){
        double resutado = number1 + number2;
        System.out.println("A soma de " + number1 + " mais " + number2 +" : " + resutado);
    }
    public static void subtrair (double number1, double number2){
        double resutado = number1 - number2;
        System.out.println("A soma de " + number1 + " menos " + number2 + " : " + resutado);
    }
    public static void multiplicar (double number1, double number2){
        double resutado = number1 * number2;
        System.out.println("A soma de " + number1 + " vezes " + number2 + " : " + resutado);
    }
    public static void dividir (double number1, double number2){
        double resutado = number1 / number2;
        System.out.println("A soma de " + number1 + " dividido por " + number2 + " : " + resutado);
    }
}
