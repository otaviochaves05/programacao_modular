import java.util.Scanner;

public class Exercicio6 {
    public static void main(String[] args) {
        String data = leData();
        int[] dataDividida = null;
        if (regexData(data)) {
            dataDividida = divideData(data);
            verificaInconsistenciaData(dataDividida);
        } else {
            System.out.println("Formato de data inválido! Utilize: DD/MM/AAAA");
        }
    }

    static boolean regexData(String data) {
        if (data.matches("\\d{2}/\\d{2}/\\d{4}")) {
            return true;
        } else {
            return false;
        }
    }

    static String leData() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite uma data: ");
        return sc.nextLine();
    }

    static int[] divideData(String data) {
        int dia = Integer.parseInt(data.substring(0, 2));
        int mes = Integer.parseInt(data.substring(3, 5));
        int ano = Integer.parseInt(data.substring(6, 10));
        return new int[] { dia, mes, ano };
    }

    static void verificaInconsistenciaData(int[] data) {
        if (data[0] < 0 || data[0] > 31) {
            System.out.println("Erro ao informar o dia.");
        }
        if (data[1] < 0 || data[1] > 12) {
            System.out.println("Erro ao informar o mes.");
        }
        if (data[2] < 0) {
            System.out.println("Erro ao informar o dia.");
        }
    }
}
