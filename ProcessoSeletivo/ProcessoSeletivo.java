
// aqui esta ok nao tenho muitas duvidas apesar de na oentender muito sobre as palavras reserdadas
// como void, static, class en mcomo utilizalas corretamente
import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;
public class ProcessoSeletivo{
    public static void main(String[] args){
        String[] candidatos = {"FELIPE", "JULIA", "CESAR", "MARIA", "MARCOS", "CAIO", "GIOVANI", "MARIANA", "MATHEUS", "ADELAR"};
        for(String candidato : candidatos){
            entrandoEmcontato(candidato);

        }
    }
    static void entrandoEmcontato(String candidato){
        int tentativasRealizadas =1;
        boolean continuarTentando = true;
        boolean atendeu = false;
        do {
            atendeu = atender();
            continuarTentando = !atendeu;
            if(continuarTentando)
                tentativasRealizadas++;
            else
            System.out.println("CONTATO REALIZADO COM SUCESSO!");       
        } while (continuarTentando && tentativasRealizadas < 3 );
          if (atendeu) {
            System.out.println("CONSEGUIMOS CONTATO COM " + candidato + " NA " + tentativasRealizadas + " TENTATIVA");
          }else 
          System.out.println("NAO CONSEGUIMOS CONTATO COM " + candidato + ", NUMERO MAXIMO DE TENTATIVAS "+ tentativasRealizadas);
    }
    //metodo auxiliar
    static boolean atender(){
        return new Random().nextInt(3)==1;
    }
    
    static void imprimirSelecionados(){
        String[] candidatos = {"FELIPE", "JULIA", "CESAR", "MARIA", "MARCOS", "CAIO", "GIOVANI", "MARIANA", "MATHEUS", "ADELAR"};
        System.out.println("Informando candidatos selecionados por ordem de indice");
        for(int i=0; i < candidatos.length; i++){
        System.out.println("O candidato de n: " + (i+1) + " e o " + candidatos[i]);
        }
    }

    static void selecionarCandidatos(){
        String[] candidatos = {"FELIPE", "JULIA", "CESAR", "MARIA", "MARCOS", "CAIO", "GIOVANI", "MARIANA", "MATHEUS", "ADELAR"};
        int candidatosSelecionados = 0;
        int candidatoAtual = 0;
        double salarioBase = 2000.00;

        while(candidatosSelecionados < 5 && candidatoAtual < candidatos.length){
            String candidato = candidatos[candidatoAtual];
            double salarioPretendido = valorPretendido();

            System.out.println("o candidato" + candidato + "Solicitou esse valor de salario" + salarioPretendido );
        if(salarioBase >= salarioPretendido){
	        System.out.println("O candidato"+candidato+"foi selecionado para a vaga");
            candidatosSelecionados++;	
        }
        candidatoAtual++;
        }
    }
        // isso qui ok eu entendi é para dar um valor aleatorio, no momento nao me interessa muito
    static double valorPretendido(){
        return ThreadLocalRandom.current().nextDouble(1800, 2200);
    }
    // isso aqui eu sei fazer esta ok também
    static void analisarCandidatos(double salarioPretendido){
        double salarioBase = 2000.00;
        if (salarioBase > salarioPretendido) {
            System.out.println("Ligar para candidato");
        
        }else if(salarioBase == salarioPretendido){
            System.out.println("Ligar e apresentar contra proposta");

        }else {
            System.out.println("Aguardar o resultado dos demais candidatos");
            
        }

    }
}