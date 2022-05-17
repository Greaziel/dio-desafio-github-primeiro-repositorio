package introducao;

public class Emprestimo {

    public static Double getDuasParcelas(){
        return 0.30;
    }

    public static Double getTresParcelas(){
        return 0.45;
    }

    public static Double getQuatroParcelas(){
        return 0.60;
    }

    public void calcular(Double valor, int parcelas){
        Double valorFinal;
       if(valor != 0){
           if(parcelas == 2){
                valorFinal = valor * getDuasParcelas() + valor;
               System.out.println("Valor final é: " + valorFinal);
           }
           else if (parcelas == 3){
               valorFinal = valor * getTresParcelas() + valor;
               System.out.println("Valor final é: " + valorFinal);
           }
           else if(parcelas == 4){
                valorFinal = valor + getQuatroParcelas() + valor;
               System.out.println("Valor final é: " + valorFinal);
           } else {
               System.out.println("Quantidade de Parcelas invalidas!");
           }
       }
    }
}
