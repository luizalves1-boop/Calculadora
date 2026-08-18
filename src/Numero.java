public class Numero {
    private int valor;

    public Numero() {
        this.valor = 0;
    }

    public Numero(int valor) {
        this.valor = valor;
    }

    public int getValor() {
        return valor;
    }

    public void setValor(int valor) {
        this.valor = valor;
    }

    public int soma(int a, int b){
        return a + b;
    }

    public int subtração(int a, int b){
        return a - b;
    }

    public int multiplicação(int a, int b){
        return a * b;
    }

    public int divisão(int a, int b){
        return a / b;
    }
}
