package introducao;

public class Calculadora {

    public void somar(Double a, Double b){
        System.out.println("A soma é: " + (a + b));;
    }
    public void subtrair(Double a, Double b){
        System.out.println("A subtração é: " + (a - b));
    }
    public void multiplicar(Double a, Double b){
        System.out.println("A multiplicação é: " + (a * b));
    }
    public void dividir(Double a, Double b) {
        if (a == 0 || a < 0) {
            System.out.println("Numéro inválido");
        } else {
            System.out.println("A divisao é: " + (a / b));
        }
    }
}
