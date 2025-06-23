import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;

interface OperacaoMatematica {
    int calcular(int a, int b);
}

interface ManipuladorString{
    String manipular(String str);
}

public class Lambda {
    public static void main(String[] args) {
        //(parametros) -> expressão
        //(parametro) -> {bloco de código}

        OperacaoMatematica soma = new OperacaoMatematica() {
            @Override
            public int calcular(int a, int b) {
                return a + b;
            }
        };

        System.out.println("soma sem função lambda: " + soma.calcular(5, 3));

        OperacaoMatematica somaL = (a, b) -> a + b;
        System.out.println("soma com função lambda: " + somaL.calcular(5, 3));

        OperacaoMatematica multiplicacao = (a, b) -> a * b;
        System.out.println("multiplicação com função lambda: " + multiplicacao.calcular(5,3));

        // Manipulação de String

        ManipuladorString maiuscula = new ManipuladorString() {
            @Override
            public String manipular(String str) {
                return str.toUpperCase();
            }
        };

        System.out.println("manipulação de String sem lambda: " + maiuscula.manipular("Bryan"));

        ManipuladorString maiusculaFL = str -> str.toUpperCase(Locale.ROOT);
        System.out.println("manipulação de String com lambda: " + maiusculaFL.manipular("Bryan"));

        // Usando o filter

        List<String> palavras = Arrays.asList("Java", "Lambda", "Javanautas", "Spring");

        List<String> palavrasFiltradas = new ArrayList<>();
        for(String palavra :palavras){
            if (palavra.length() > 5){
                palavrasFiltradas.add(palavra);
            }
        }

        System.out.println("Palavras com mais de 5 letras sem função lambda: " + palavrasFiltradas);

        List<String> palavrasFiltradasFL = palavras.stream().filter(palavra -> palavra.length() > 5).toList();
        System.out.println("Palavras com mais de 5 letras com função lambda: " + palavrasFiltradasFL);
    }
}















