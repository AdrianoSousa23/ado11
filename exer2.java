import java.util.Random;
import java.util.Scanner;
class Main {
  static Scanner ler = new Scanner(System.in);
  public static void main(String[] args){ 
  int sorteado = 0;
  int numUsuario = 0;
  int tentativa = 1;
  String resposta = "";
  int sorte = numeroAleatorio();

    System.out.println("Numero sorteado " + sorte);

    limparTela();
    
    do{
     numUsuario = ler.nextInt();
     resposta = ganhou(sorteado, numUsuario, tentativa);

     System.out.println(resposta);
     tentativa++;
      
    }while ((resposta.equals("maior") || resposta.equals("menor")) && tentativa <= 10);
   }
public static int numeroAleatorio () {
  Random rdn = new Random();
  int n = rdn.nextInt(0, 1000);
  return n;
 }
  public static String ganhou (int sorteado, int numUsuario, int tentativa) {
  String sit = "";
    if (tentativa == 10 && numUsuario != sorteado){
      sit = "perdeu";
    }else if (numUsuario == sorteado){
      sit = "ganhou";
    }else if (numUsuario < sorteado){
      sit = "menor";
    }else{
      sit = "maior";
    }
    return sit;
 }
    public static void limparTela() {
    System.out.print("\n\npressione <enter> para voltar ao menu.\n");
    new Scanner(System.in).nextLine();
    System.out.print("\033[H\033[2J");
    System.out.flush();  
  }
}