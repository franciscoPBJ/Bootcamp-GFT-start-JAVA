package base.metodos.bootcamp;

public class Main {
    public static void main(String[] args) {

        //Calculadora
        System.out.println("Calculando");
        Calculadora.soma(3,6);
        Calculadora.subtrair(6,5);
        Calculadora.multiplicar(4,5);
        Calculadora.dividir(3,6);

    //mensagem
        System.out.println("Mensagem");
        Mensagem.obterMensagem(6);
        Mensagem.obterMensagem(13);
        Mensagem.obterMensagem(18);

    }
}
