

// Desafio : Salvando Músicas

import java.util.Scanner;
public class Program {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        String arquivoDoPc = leitor.next();
         if(arquivoDoPc.endsWith(".mp3")){
           System.out.println("Salvar");
         }else{
           System.out.println("Deletar");
         }
    }
}



// Desafio: Pontos na carteira

import java.util.Scanner;    
public class App {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        int velocidade = leitor.nextInt();
        int multas = leitor.nextInt();        
        if(velocidade>80){
            multas ++;
        }
        System.out.printf((multas<=2) ? multas+" multas. Nao levou pontos na carteira" : multas+" multas. Levou pontos na carteira");
    }
}



// Desafio: Imóveis disponíveis

import java.util.Scanner;
public class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    String entrada = scanner.nextLine();  
    String[] dados = entrada.split("/");  
    String classificacao = dados[0];
    int valorAluguel = Integer.parseInt(dados[1]);
    String disponibilidade = dados[2];
    String saida = "Imovel: " + classificacao + " R$" + valorAluguel + " " + disponibilidade;
    System.out.println(saida);
  }
}



// Desafio: Dc Monalds

import java.util.Scanner;
public class Program {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        String ingredientes = leitor.next();
        String ordemIngred[] = new String[3];
        ordemIngred = ingredientes.split(";");
        for(String produtos : ordemIngred) System.out.println(produtos);
        leitor.close();
    }
}


// Desafio: Camarote do Blue Cold Ice Cubes

import java.util.Scanner;
public class Program {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        int tamanhoDaFila = leitor.nextInt();
        int pessoasNoCamarote = 0;
        for(int i=0; i<=tamanhoDaFila; i++){
          if(i % 2 != 0){
            pessoasNoCamarote++;
          }
        }  
          System.out.println(pessoasNoCamarote + " pessoas no camarote");
    }
}



































