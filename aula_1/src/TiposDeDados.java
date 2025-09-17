public class TiposDeDados {
    public static void main(String[]args){
        byte idade = 22;
        System.out.println("Idade (tipo byte): " + idade);

        short populacaoCidade = 25000;
        System.out.println("População da cidade (tipo short): " + populacaoCidade);

        int populacaoMundial = 780000000;
        System.out.println("População mundial (tipo int): " + populacaoMundial);

        long distanciaEstrelas = 9460730472580800L;
        System.out.println("Distância entre estrelas (tipo long): " + distanciaEstrelas);

        float peso = 50.0f;
        System.out.println("Peso (tipo float): " + peso);

        double pi = 3.141592653589793;
        System.out.println("Valor de PI (tipo double): " + pi);

        char inicialNome = 'M';
        System.out.println("Inicial do nome (tipo char): " + inicialNome);

        boolean isJavaDivertido = true;
        boolean isChuvaAmanha = false;
        System.out.println("É Java divertido? (tipo boolean): " + isJavaDivertido);
        System.out.println("Vai chover amanhã? (tipo boolean): " + isChuvaAmanha);

        String nomeCompleto = "Milena da Silva Martins";
        System.out.println("Nome completo: (tipo String): " + nomeCompleto);
    }
}
