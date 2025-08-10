import java.util.Scanner;

public class Exercicio3 {
    public static void main(String[] args) {
        int[] notasExercicio = lerLinhaDeInteiros("Digite as notas separadas por espaco: ");
        int[] notasProva = lerLinhaDeInteiros("Digite as notas das provas separadas por espaco");
        int notaTrabalho = lerInteiro("Nota do trabalho");
        double[] notasTratadas = calculaPesoNotas(notasExercicio, notasProva, notaTrabalho);
        somaNotas(notasTratadas);
    }

    static int lerInteiro(String msg) {
        Scanner sc = new Scanner(System.in);
        System.out.println(msg);
        return Integer.parseInt(sc.nextLine());
    }

    static String lerString(String msg) {
        Scanner sc = new Scanner(System.in);
        System.out.println(msg);
        return sc.nextLine();
    }

    static int[] lerLinhaDeInteiros(String msg) {
        String linha = lerString(msg);
        return converteStringParaArrayInt(linha);
    }

    static int[] converteStringParaArrayInt(String linha) {
        String[] s_numeros = linha.split(" ");
        int[] i_numeros = new int[s_numeros.length];
        for (int i = 0; i < s_numeros.length; i++) {
            i_numeros[i] = Integer.parseInt(s_numeros[i]);
        }
        return i_numeros;
    }

    static double[] calculaPesoNotas(int[] notasExercicio, int[] notasProva, int notaTrabalho) {
        double[] notasTratadas = new double[3];
        notasTratadas[0] = (calculaMedia(notasExercicio) * 10) * 0.2;
        notasTratadas[1] = calculaMedia(notasProva) * 0.6;
        notasTratadas[2] = (notaTrabalho * 5) * 0.2;
        return notasTratadas;
    }

    static double calculaMedia(int[] notas){
        double soma = 0;
        for (int i = 0; i < notas.length; i++) {
            soma += notas[i];
        }
        return soma / notas.length;
    }

    static void somaNotas(double[] notas){
        double soma = 0;
        for (int i = 0; i < notas.length; i++) {
            soma += notas[i];
        }
        System.out.println(soma);
    }
}
