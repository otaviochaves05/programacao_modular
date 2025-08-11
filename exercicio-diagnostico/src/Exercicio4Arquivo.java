import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Exercicio4Arquivo {
    public static void main(String[] args) throws IOException {
        String nomeArquivo = "exercicio4Arquivo";
        BufferedReader reader = new BufferedReader(new FileReader(nomeArquivo));
        String mensagem = reader.readLine();
        String[] mensagemDividida = divideString(mensagem);
        List<char[]> listaChar = converteStringParaCharArray(mensagemDividida);
        String stringEmColunas = converteStringsEmColunas(listaChar);
        String stringCiptografada = criptografaString(stringEmColunas);
        BufferedWriter writer = new BufferedWriter(new FileWriter(nomeArquivo));
        writer.write(stringCiptografada);
        reader.close();
        writer.close();
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


