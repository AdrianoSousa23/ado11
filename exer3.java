import java.util.Scanner;
class Main {
  static Scanner ler = new Scanner(System.in);
  public static void main(String[] args){ 
  int votosAluno1 = 0;
  int votosAluno2 = 0;
  int votosAluno3 = 0;
  String aluno1,aluno2,aluno3;
    System.out.println("informe o primeiro aluno" );
  aluno1 = ler.nextLine();
    System.out.println("informe o segundo aluno" );
  aluno2 = ler.nextLine();
    System.out.println("informe o terceiro aluno" );
  aluno3 = ler.nextLine();
int opcao = menuVotacoes(aluno1, aluno2, aluno3);

  do{
    switch(opcao){
      case 1: 
        for(int cont = 1; cont != opcao; cont++){
           votosAluno1 = ler.nextInt();
          votosAluno1 = votosAluno1 + cont;
          break;
          
        }
      case 2: 
        for(int cont2 = 1; cont2 != opcao; cont2++){
          votosAluno2 = ler.nextInt();
          votosAluno2 = votosAluno2 + cont2;
          break;
        }
      case 3:
        for(int cont3 = 1; cont3 != opcao ; cont3++){
          votosAluno3 = ler.nextInt();
          votosAluno3 = votosAluno3 + cont3;
          break;
        }
    }
    
    System.out.print("\nVoce escolheu " + opcao);
    opcao = menuVotacoes(aluno1, aluno2, aluno3);
      }
    while(opcao != 0);
    avaliarResultado(votosAluno1,votosAluno2,votosAluno3);
    opcao = menuVotacoes(aluno1, aluno2, aluno3);
    }
   public static int menuVotacoes(String aluno1, String aluno2, String aluno3){
     System.out.println("\nvotação representante de sala: ");
     System.out.println("1. " + aluno1);
     System.out.println("2. " + aluno2);
     System.out.println("3. " + aluno3);
     System.out.println("0. Encerrar ");
     int opcao = ler.nextInt();
     return opcao;
   }
public static void avaliarResultado (int votosAluno1, int votosAluno2, int votosAluno3){
  while(aluno1 && votosAluno1 > votosAluno2 && votosAluno1 > votosAluno3){
    if(aluno2 && votosAluno2 > votosAluno1 && votosAluno2 > votosAluno3){
      System.out.println("Representante " + aluno1 + "votos " + votosAluno1);
      System.out.println("Vice- presidente " + aluno2 + "votos " + votosAluno2);
    }
    }
  }
        public static void limparTela() {
    System.out.print("\n\npressione <enter> para voltar ao menu.\n");
    new Scanner(System.in).nextLine();
    System.out.print("\033[H\033[2J");
    System.out.flush();  
    }
}

