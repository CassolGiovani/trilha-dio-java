import java.util.Scanner;

public class SimulacaoBancaria {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); 
        double saldo = 0; 
        // Loop infinito para manter o programa em execução até que o usuário decida sair
        while (true) { 

          System.out.println("ESCOLA UMA OPÇÃO");
          System.out.println("1- Depositar" + 
                        "\r\n" + 
                        "2- Sacar" + 
                        "\r\n" + 
                        "3- Consultar Saldo" + 
                        "\r\n" + 
                        "0- Encerrar" + 
                        "");
          
            int opcao = scanner.nextInt();
        switch(opcao){
          case 1:
          System.out.println("Insira o valor a ser depositado: ");
          double deposito = scanner.nextDouble();
          saldo += deposito;
          System.out.println("Saldo atual: "+saldo);
          break;
          case 2:
          System.out.println("Insira o valor que deseja sacar: ");
          double saque = scanner.nextDouble();
          if(saque > saldo){
            System.out.println("Saldo insuficiente.");
          } else if(saque <= saldo){
            saldo-=saque;
            System.out.println("Saldo atual: "+saldo);
          }
          break;
          case 3:
          System.out.println("Saldo atual: "+saldo);
          break;
          case 0:
          scanner.close();
          System.out.println("Programa encerrado.");
          System.exit(0);
          break;
          // Exibe mensagem de opção inválida se o usuário escolher uma opção inválida:
          default :
                    System.out.println("Opção inválida. Tente novamente.");
          
        }
        }
    } 
}