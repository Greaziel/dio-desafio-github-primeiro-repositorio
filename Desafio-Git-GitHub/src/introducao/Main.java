package introducao;

public class Main {
    public static void main(String[] args) {

        Calculadora calculadora = new Calculadora();

        System.out.println("Exercício Calculadora");
        calculadora.somar(6d, 8d);
        calculadora.subtrair(20d, 7d);
        calculadora.multiplicar(6d, 8d);
        calculadora.dividir(20d, 2d);
        System.out.println();

        Mensagem mensagem = new Mensagem();

        System.out.println("Exercício Mensagem");
        mensagem.obterMenssagem(6);
        mensagem.obterMenssagem(14);
        mensagem.obterMenssagem(19);
        System.out.println();

        Emprestimo emprestimo = new Emprestimo();

        System.out.println("Exercício Enorestimo");
        emprestimo.calcular(100d, 2);
        emprestimo.calcular(120d, 3);
        emprestimo.calcular(150d, 4);
        emprestimo.calcular(500d, 5);
    }
}
