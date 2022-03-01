import java.math.BigInteger;

public class Factorial {
    public static void main(String[] args) {

        int num = 25;
        BigInteger factorial = BigInteger.ONE;
        for(int i = 1; i <= num; ++i)
        {            
            factorial = factorial.multiply(BigInteger.valueOf(i));
        }
        System.out.printf("Factorial of %d = %d", num, factorial);
    }
}