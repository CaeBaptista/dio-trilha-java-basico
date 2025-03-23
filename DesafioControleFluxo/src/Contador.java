import java.util.Scanner;
public class Contador {

    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        
        // Ler os numeros
        System.out.print("Digite o primeiro número: ");
        int numero1 = scanner.nextInt();
        
        System.out.print("Digite o segundo número: ");
        int numero2 = scanner.nextInt();
        
        try {
            
            processarContagem(numero1, numero2);
        } catch (ParametrosInvalidosException e) {
            
            System.out.println(e.getMessage());
        } finally {
            scanner.close();
        }
    }
    
    public static void processarContagem(int numero1, int numero2) throws ParametrosInvalidosException {
        // Validar se o primeiro número é maior que o segundo
        if (numero1 > numero2) {
            throw new ParametrosInvalidosException("O segundo parâmetro deve ser maior que o primeiro");
        }
        
        int quantidadeInteracoes = numero2 - numero1;

        for (int numeroIncrementado = 1;  numeroIncrementado <= quantidadeInteracoes; numeroIncrementado++) {
            System.out.println("Imprimindo o número " + numeroIncrementado);
        }
    }
}