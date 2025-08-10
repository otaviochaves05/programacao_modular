import java.util.Scanner;

public class Exercicio2 {
    public static void main(String[] args) {
        int altura = lerInteiro("Altura: ");
        int largura = lerInteiro("Largura: ");
        int deslocamento = lerInteiro("Deslocamento: ");
        imprimeLinhaCompleta(largura, deslocamento);
        quebraDeLinha();
        for (int i = 0; i < altura - 2; i++) {
            imprimeLinhaIncompleta(largura, deslocamento);
        }
        imprimeLinhaCompleta(largura, deslocamento);
        quebraDeLinha();
    }

    static int lerInteiro(String msg) {
        Scanner sc = new Scanner(System.in);
        System.out.println(msg);
        return Integer.parseInt(sc.nextLine());
    }

    static void imprimeLinhaCompleta(int largura, int deslocamento){
        deslocamento(deslocamento);
        for (int i = 0; i < largura; i++) {
            System.out.print("X");
        }
    }

    static void imprimeLinhaIncompleta(int largura, int deslocamento){
        deslocamento(deslocamento);
        imprimeCharX();
        for (int i = 0; i < largura - 2; i++) {
            System.out.print(" ");
        }
        imprimeCharX();
        quebraDeLinha();
    }

    static void deslocamento(int deslocamento){
        for (int i = 0; i < deslocamento; i++) {
            System.out.print(" ");
        }
    }

    static void imprimeCharX(){
        System.out.print("X");
    }

    static void quebraDeLinha(){
        System.out.print("\n");
    }

}
