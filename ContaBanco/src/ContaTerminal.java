//  Um exemplo para exercitar conceitos de variaveis e entrada de dados.
import java.util.Scanner; 
public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
         
        double saldoDisponivel = 237.48; 
    
        // Recebendo os dados do usuario
        System.out.println("Por favor, digite o Nome do Cliente !");
        String nomeDocliente = scanner.nextLine();
    
        System.out.println("Por favor, digite o número da Agência !");
        String agenciaDoCliente = scanner.nextLine();

        System.out.println("Por favor, digite o número da Conta !");
        int numeroDaConta = scanner.nextInt();

        // Exibe a mensagem formatada
        String mensagem = "Olá " + nomeDocliente +" Obrigado por criar uma conta em nosso banco, sua agência é "+ agenciaDoCliente + ", conta "+ numeroDaConta + " e seu saldo de R$:"+saldoDisponivel+" já está disponível para saque.";
        
        System.out.println(mensagem);

        scanner.close();
    } 
}

