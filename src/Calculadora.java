public class Calculadora {

    /**
     * Soma dois números.
     * @param a Primeiro número
     * @param b Segundo número
     * @return Resultado da soma
     */
    public double somar(double a, double b) {
        return a + b;
    }

    /**
     * Subtrai dois números.
     * @param a Primeiro número
     * @param b Segundo número
     * @return Resultado da subtração
     */
    public double subtrair(double a, double b) {
        return a - b;
    }

    /**
     * Multiplica dois números.
     * @param a Primeiro número
     * @param b Segundo número
     * @return Resultado da multiplicação
     */
    public double multiplicar(double a, double b) {
        return a * b;
    }

    /**
     * Divide dois números.
     * @param a Dividendo
     * @param b Divisor
     * @return Resultado da divisão
     * @throws ArithmeticException se o divisor for zero
     */
    public double dividir(double a, double b) throws ArithmeticException {
        if (b == 0) throw new ArithmeticException("Divisão por zero não é permitida.");
        return a / b;
    }
}
