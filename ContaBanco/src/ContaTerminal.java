
import java.util.Scanner;
public class ContaTerminal {
    public static void main(String[] args) throws Exception {
    
         Scanner txt = new Scanner(System.in);

          String nome;

             System.out.print("Digite o seu nome: ");
             nome = txt.nextLine();
          
             System.out.print("Digite a sua agência: ");
             String agc;
            agc = txt.nextLine();

            System.out.print("Digite a sua conta: ");
            String contaStr = txt.nextLine();
            int conta = Integer.parseInt(contaStr);

            System.out.print ("Digite o saldo da conta: ");
            String saldoStr = txt.nextLine();
            double saldo = Double.parseDouble(saldoStr);

           txt.close();

             System.out.println( "Olá " + nome + ", sua agência é: " + agc + ", conta :" + conta + " e o saldo disponível para saque é: " + saldo);

             


    }
}
