// Para ler e escrever dados em Java, aqui na DIO padronizamos da seguinte forma:  
// - new Scanner(System.in): cria um leitor de Entradas, com métodos úteis com prefixo "next"; 
// - System.out.println:.imprime um texto de Saída (Output) e pulando uma linha.   

import java.util.Scanner; 
    
public class MesadaSobrinho {


public int calculaMesada(int entrada, int mesada){
    int valorMesada = entrada * mesada;
    return valorMesada;
  }

    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        int entrada = leitor.nextInt();
        int mesada = 50;
        
        // TODO: Crie a condição necessária para que o sobrinho saiba quanto dinheiro irá juntar nos meses da entrada
        System.out.println("Mesada de R$ " +  entrada * mesada + " se juntar por " + entrada + " meses.");
       

 

    }}