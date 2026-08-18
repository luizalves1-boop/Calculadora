public class Calculadora {
    char[] vetOp = new char[]{'+', '-', '*', '/'};
    public int calculadora(String expressao) throws Exception {
        Pilha numeros = new Pilha();
        Pilha operadores = new Pilha();
        for (int i = 0; i < expressao.length(); i++) {
            String num = "";
            if(pertence(expressao.charAt(i), vetOp) ){
                operadores.empilha(expressao.charAt(i));
            } else{
                while(i < expressao.length() && !pertence(expressao.charAt(i), vetOp)){
                    num += expressao.charAt(i);
                    i++;
                }
                numeros.empilha(Integer.parseInt(num));
                i--;
            }
            
        }
        int numB = numeros.desempilha();
        int numA = numeros.desempilha();
        char operador = (char) operadores.desempilha();

        Numero numero = new Numero();
        int resultado = 0;
        if(operador == '+'){
            resultado = numero.soma(numA, numB);
        }
        if(operador == '-'){
            resultado = numero.subtração(numA, numB);
        }
        if(operador == '*'){
            resultado = numero.multiplicação(numA, numB);
        }
        if(operador == '/'){
            resultado = numero.divisão(numA, numB);
        }
        return resultado;
    }

    public static boolean pertence(char elemento, char[] vetor) {
        for (char valor : vetor) {
            if (valor == elemento) {
                return true;
            }
        }
        return false;
    }
}
