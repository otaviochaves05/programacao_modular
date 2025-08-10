import java.util.Scanner;

public class Exercicio1 {
    public static void main(String[] args) throws Exception {
        menu();
    }

    static void menu() {
        System.out.println("------------------------------------Menu-------------------------------------");
        System.out.println("|1 - Dividir dois numeros                                                   |");
        System.out.println("|2 - Ler 3 numeros e mostrar qual e o maior deles                           |");
        System.out.println("|3 - Ler e armazenas N numeros                                              |");
        System.out.println("|4 - Mostrar a soma dos numeros armazenados                                 |");
        System.out.println("|5 - Contar quantos dos numeros armazenados sao pares e quantos sao impares |");
        System.out.println("|0 = Sair                                                                   |");
        System.out.println("-----------------------------------------------------------------------------");
        int opcao = lerInteiro("Escolha qual operacao deseja:");
        int[] numeros = null;
        switch (opcao) {
            case 1:
                dividirDoisNumeros();
                menu();
                break;
            case 2:
                System.out.println(verificaMaiorNumero(lerConjuntoDeInteirosDefinidos(3)));
                break;
            case 3:
                numeros = lerConjuntoDeInteirosIndefinidos();
                System.out.println(numeros);
                menu();
                break;
            case 4:
                numeros = lerConjuntoDeInteirosIndefinidos();
                System.out.println(somaNumeros(numeros));
                menu();
            case 5:
                numeros = lerConjuntoDeInteirosIndefinidos();
                int[] resposta = verificaParImpar(numeros);
                System.out.println("Pares: " + resposta[0] + "\n" + "Impares: " + resposta[1]);
            case 0:
                System.out.println("Saindo...");
                break;
        }
    }

    static int lerInteiro(String msg) {
        Scanner sc = new Scanner(System.in);
        System.out.println(msg);
        return Integer.parseInt(sc.nextLine());
    }

    static int dividirDoisNumeros() {
        int n1 = lerInteiro("Digite o primeiro numero");
        int n2 = lerInteiro("Digite o segundo numero");
        return n1 / n2;
    }

    static int[] lerConjuntoDeInteirosDefinidos(int n) {
        int[] numeros = new int[n];
        for (int i = 0; i < numeros.length; i++) {
            numeros[i] = lerInteiro("Digite: ");
        }
        return numeros;
    }

    static int[] lerConjuntoDeInteirosIndefinidos() {
        int n = lerInteiro("Quantos numeros deseja armazenar?");
        int[] conjunto = new int[n];
        for (int i = 0; i < conjunto.length; i++) {
            conjunto[i] = lerInteiro("Digite: ");
        }
        return conjunto;
    }

    static int verificaMaiorNumero(int[] numeros) {
        int maior = numeros[0];
        for (int i = 0; i < numeros.length; i++) {
            if (numeros[i] > maior) {
                maior = numeros[i];
            }
        }
        return maior;
    }

    static int somaNumeros(int[] numeros) {
        int soma = 0;
        for (int i = 0; i < numeros.length; i++) {
            soma += numeros[i];
        }
        return soma;
    }

    static int[] verificaParImpar(int[] numeros) {
        int pares = 0;
        int impares = 0;
        for (int i = 0; i < numeros.length; i++) {
            if (numeros[i] % 2 == 0) {
                pares++;
            } else {
                impares++;
            }
        }
        return new int[] { pares, impares };
    }

}
