import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Exercicio4 {
    public static void main(String[] args) {
        String[] mensagemDividida = divideString("mensagem secreta");
        List<char[]> listaChar = converteStringParaCharArray(mensagemDividida);
        String stringEmColunas = converteStringsEmColunas(listaChar);
        System.out.println(Arrays.deepToString(listaChar.toArray()));
        System.out.println(stringEmColunas);
        System.out.println(criptografaString(stringEmColunas));
    }

    static String[] divideString(String msg) {
        return msg.split("(?<=\\G.{5})");
    }

    static List<char[]> converteStringParaCharArray(String[] mensagemDividida) {
        List<char[]> lista = new ArrayList<>();
        for (int i = 0; i < mensagemDividida.length; i++) {
            lista.add(mensagemDividida[i].toCharArray());
        }
        return lista;
    }

    static String converteStringsEmColunas(List<char[]> lista) {
        String resposta = "";
        for (int i = 0; i < 5; i++) {
            for (char[] linha : lista) {
                if (i < linha.length) {
                    resposta += linha[i];
                }
            }
        }

        return resposta;
    }

    static String criptografaString(String string) {
        return string.replaceAll("(.{5})(?=.)", "$1*");
    }

}
