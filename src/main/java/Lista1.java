import java.util.Scanner;

public class Lista1 {
    public void numero1(int numero){
        Scanner input = new Scanner(System.in);
        int quantiaNegativos = 0;
        for (int i = 0; i < numero; i++){
            System.out.println("Digite um numero");
            if (input.nextInt() < 0) quantiaNegativos++;
        }
        System.out.println("Quantidade de numeros negativos: " + quantiaNegativos);
    }
    public void numero2(){
        Scanner input = new Scanner(System.in);
        int R = 0, S = 0, T = 0;
        for (int i = 0; i < 3; i++){
            if (i == 0){
                System.out.println("Digite o valor de R: ");
                R = input.nextInt();
            }
            else if (i == 1){
                System.out.println("Digite o valor de S: ");
                S = input.nextInt();
            }
            else{
                System.out.println("Digite o valor de T: ");
                T = input.nextInt();
            }
        }
        System.out.println("Maior valor: " + Math.max(Math.max(R, S), T));
    }
    public void numero3(){
        //System.out.println(1000 * 999 / 2);
        int soma = 0;
        for (int i = 1; i < 1000; i++) soma += i;
        System.out.println("A soma de 1 a 999 vale: " + soma);
    }
    public void numero4(){
        System.out.println("Imprimindo multiplos de 3;");
        for (int i = 1; i < 101; i++) if (i % 3 == 0) System.out.println(i);
    }
    public int numero5(int N){
        if (N < 0){
            System.out.println("Não é possivel calcular fatorial de valores negativos");
            return -1;
        }
        int resultado = 1;
        for (int i = N; i > 0; i--) resultado *= i;
        return resultado;
    }
    public void numero6(){
        int antePenultimo, numeroAnt = 0, numero = 1;
        System.out.println(numeroAnt++ + "\n" + numero);
        do{
            System.out.println(numero);
            antePenultimo = numero;
            numero += numeroAnt;
            numeroAnt = antePenultimo;
        } while (numero <= 100);
    }
    public void numero7(){
        int[] dados = new int[4];
        int lido;
        Scanner leitor = new Scanner(System.in);
        while (true){
            System.out.println("Insira a nota: ");
            lido = leitor.nextInt();
            if (lido < 0 || lido > 100) break;
            if (lido <= 25) dados[0]++;
            else if (lido <= 50) dados[1]++;
            else if (lido <= 75) dados[2]++;
            else dados[3]++;
        }
        System.out.println("Pessimas: " + dados[0] + "\nRuins: " + dados[1] + "\nBoas: " + dados[2] + "\nOtimas: " + dados[3]);
    }
    public void numero8(){
        Scanner scanner = new Scanner(System.in);
        boolean matrizQuadrada = true, iMudou = true;
        System.out.print("Insira a ordem da matriz: ");
        int ordem = scanner.nextInt();
        int[][] matriz = new int[ordem][ordem];
        int valorMatriz = 0, soma = 0, diagPrin = 0, diagSec = 0;
        for (int i = 0; i < ordem; i++){
            for (int j = 0; j < ordem; j++){
                System.out.print("Insira o elemento " + (j+1) + " da coluna " + (i+1)+ ": ");
                int valor = scanner.nextInt();
                matriz[i][j] = valor;
                soma += valor;
                if (j == i) diagPrin += valor;
                if (j + i == ordem - 1) diagSec += valor;
            }
            if (valorMatriz != 0 && soma != valorMatriz) matrizQuadrada = false;
            valorMatriz = soma;
            soma = 0;
        }
        if (matrizQuadrada && diagPrin == valorMatriz && diagSec == valorMatriz){
            for (int i = 0; i < ordem; i++) {
                for (int j = 0; j < ordem; j++) soma += matriz[j][i];
                if (soma != valorMatriz) {
                    matrizQuadrada = false;
                    break;
                }
                soma = 0;
            }
        } else matrizQuadrada = false;
        if (matrizQuadrada) System.out.println("\nA matriz é um quadrado mágico");
        else System.out.println("\nA matriz não é quadrado mágico");
    }
}
