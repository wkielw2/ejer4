package ejer4;

public class Factorial_capsa_negra {

    private static int factorial(int n){
        if(n == 0 || n == 1){
            return 1;
        }
        return n * factorial(n - 1);
    }

    public static void main(String[] args){
        System.out.println(factorial(Integer.parseInt(args[0])));
    }
}
