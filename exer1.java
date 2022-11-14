import java.util.Scanner;
class Main {
  static Scanner ler = new Scanner(System.in);
  public static void main(String[] args) {
  
    int opcao = menuCalculos();
    double n1 = 0;
    double n2 = 0;
    double num = 0;
    double exp = 0;
    do{
      switch(opcao) {
        case 1:
          System.out.println("\nDigite um valor" );
          n1 = ler.nextInt();
          System.out.println("\nDigite o segundo valor" );
          n2 = ler.nextInt();
          double somar = soma(n1,n2);
          System.out.println(" \no resultado da soma e " + somar);
          break;
          
        case 2: 
          System.out.println("\nDigite um valor" );
          n1 = ler.nextInt();
          System.out.println("\nDigite o segundo valor" );
          n2 = ler.nextInt();
          double menos = subtracao(n1,n2);
          System.out.println("\n o resultado da subtração e " + menos);
          break;
          
        case 3:
          System.out.println("\nDigite um valor" );
          n1 = ler.nextInt();
          System.out.println("\nDigite o segundo valor" );
          n2 = ler.nextInt();
          double vezes = multiplicar(n1, n2);
          System.out.println(" \no resultado da multiplicação e " + vezes);
          break;
          
        case 4:
          System.out.println("\nDigite um valor" );
          n1 = ler.nextInt();
          System.out.println("\nDigite o segundo valor" );
          n2 = ler.nextInt();
          double divisao = dividir(n1, n2);
          System.out.println(" \no resultado da divisão e " + divisao);
          break;
          
        case 5:
          System.out.println("\nDigite um valor" );
          num = ler.nextInt();
          System.out.println("\nDigite o segundo valor" );
          exp = ler.nextInt();
          double p = potencia(num, exp);
          System.out.println("\n o resultado da potencia e " + p);
          break;
          
        case 6:
          System.out.println("\nDigite um valor" );
          num = ler.nextInt();
          double r = raiz(num);
          System.out.println("\n o resultado da raiz e " + r);
          break;
          
        default :
        System.out.println("\nOpção invalida"); 

      }
      System.out.println("\nvoce escolheu " + opcao);
      opcao = menuCalculos();
    }
      while (opcao != 0);
  }
  public static int menuCalculos(){
    System.out.println("\nQual calculo deseja fazer : ");
    System.out.println("\n1. Somar "); 
    System.out.println("2. Subtrair ");
    System.out.println("3. Multiplicar ");
    System.out.println("4. Dividir ");
    System.out.println("5. Potência ");
    System.out.println("6. Raiz Quadrada ");
    System.out.println("0. Sair ");
    
    int opcao = ler.nextInt();
    
    return opcao;
  }
  public static double soma (double n1, double n2 ){
    double somar = n1 + n2;
    return somar;
  }
  
    public static double subtracao (double n1, double n2){
    double subtrair = n1 - n2;
    return subtrair;
}
  
  public static double multiplicar (double n1, double n2){
    double vezes = n1 * n2;
    return vezes;
  }
  
  public static double dividir (double n1, double n2){
    double divisao = n1 / n2;
    return divisao;
  }
  
   public static double potencia (double num, double exp){
    double p = Math.pow(num, exp);
    return p;
   }
  
   public static double raiz (double num){
    double r = Math.sqrt(num);
    return r;
   }
}