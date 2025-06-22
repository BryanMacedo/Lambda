interface OperacaoMatematica{
    int calcular(int a, int b);
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

        System.out.println("soma sem função lambda: " + soma.calcular(5,3));

        OperacaoMatematica somaL = (a, b) -> a + b;
        System.out.println("soma com função lambda: " + somaL.calcular(5,3));
    }
}















