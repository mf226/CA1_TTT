package logic;

public interface ICalculator {

    int add(int n1, int n2);

    int sub(int n1, int n2);

    int mul(int n1, int n2);

    int div(int n1, int n2) throws ArithmeticException;

}
