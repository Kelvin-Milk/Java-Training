import java.util.Scanner;

public class Vetor01 {
    private Vetor01() {
        Scanner teclado = new Scanner(System.in);

        int vetor[] = new int[50];       
        int opcao = 0;
        int posFim = 0;
        
        do {
            System.out.println("Opção: ");
            opcao = teclado.nextInt();
            switch (opcao) {
                case 1:
                posFim = incluir(vetor, posFim, teclado);
                break;
                case 2:
                encontrar(vetor, posFim, teclado);
                break;
                case 3:
                alterar(vetor, teclado);
                break;
                case 4:
                posFim = excluir(vetor, posFim, teclado);
                break;
                case 5:
                mostrar(vetor, posFim);
                break;
                case 6:
                ordenar(vetor, posFim);
                break;				
                case 7:
                break;
                default:
                System.out.println("Opção inválida.");
            
            }    
                  
        } while (opcao != 7);   
        
        System.out.println("Fim");        

        teclado.close();
    }

    private int incluir(int vetor[], int posFim, Scanner teclado) {
        if (posFim < vetor.length) {
            System.out.print("Valor a incluir: ");
            vetor[posFim] = teclado.nextInt();
            System.out.println("Incluído em vetor[" + posFim + "].");
            posFim++;
        } else {
            System.out.println("Não incluído (vetor cheio).");
        }
        return posFim;
    }

    private void encontrar(int vetor[], int posFim, Scanner teclado) {
        int valor = 0;
        System.out.println("Valor a encontrar: ");
        valor = teclado.nextInt();
        for (int i = 0; i < vetor.length; i++) {
            if (vetor[i] == valor && i < posFim) {
                System.out.println(valor + " está em vetor[" + i + "].");
            }
        }                     
    }

    private void alterar(int vetor[], Scanner teclado) {
        int valor = 0;
        int alterado = 0;
        System.out.println("Valor a alterar: ");
        alterado = teclado.nextInt();
        System.out.println("Novo valor: ");
        valor = teclado.nextInt();
        for (int i = 0; i < vetor.length; i++) {
            if (vetor[i] == alterado) {
                vetor[i] = valor;
                break;
            }
        }                        
    }

    private int excluir(int vetor[], int posFim, Scanner teclado) {
        int valor = 0;
        System.out.println("Valor a excluir: ");
        valor = teclado.nextInt();
        for (int i = 0; i < posFim; i++) {
            if (vetor[i] == valor) {
                for (int j = i; j < posFim; j++) {
                    vetor[j] = vetor[j + 1];                    
                }                        
            }
        }
        posFim--;
        return posFim;              
    }

    private void mostrar(int vetor[], int posFim) {
        for (int i = 0; i < posFim; i++) {
            System.out.println("vetor[" + i + "] " + vetor[i]);
        }
    }

    private void ordenar(int vetor[], int posFim) {
        int bolha = 0;
        for (int i = 0; i < posFim; i++) {
            int auxiliar = 0;
            if (auxiliar < posFim) {
                for (int j = 0; j < posFim - 1; j++) {
                    if (vetor[j] > vetor[j + 1]) {
                        bolha = vetor[j];
                        vetor[j] = vetor[j + 1];
                        vetor[j + 1] = bolha;
                        auxiliar = 0;
                    }
                    else {
                        auxiliar++;
                    }
                }
            }
        }                    
    }

    public static void main(String[] args) {
        new Vetor01();
    }
}
