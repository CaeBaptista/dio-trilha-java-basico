import java.util.Locale;
import java.util.Scanner;


public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        System.out.println(" Olá cliente, por favor digite seu nome " );
        String nomeCliente = scanner.next();

        System.out.println("Por favor digite seu número ");
        int numero = scanner.nextInt();

        System.out.println("Por favor digite sua agência ");
        double agencia = scanner.nextDouble();

        System.out.println("Por favor digite seu saldo ");
        double saldo = scanner.nextDouble();


        System.out.println("Olá " + nomeCliente  + ", obrigado por criar uma conta em nosso banco,  " );
        System.out.println(" sua agência é  " + agencia + ", conta  " + numero + " e seu saldo " + saldo + " ja esta disponível para saque. ");



    }
}
