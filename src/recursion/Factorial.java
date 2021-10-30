package recursion;

public class Factorial {
    public static void main(String[] args) {
        System.out.println(factorialProgram(5));
    }

    //java factorial program with recursion
    public static long factorialProgram(long n){
        if (n <= 1) {
            return 1;
        } else {
            return n * factorialProgram(n - 1);
        }
    }

}
