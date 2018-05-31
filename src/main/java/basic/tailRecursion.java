package basic;

/**
 * Created by ypokhrel on 5/31/2018.
 */
public class tailRecursion {
    public static void main(String[] args) {
        System.out.println("recurion of 5 is " + normal_factorial(5));
    }

    public static int normal_factorial(int n){
        if (n <= 1)
            return 1;
        else
            return n * normal_factorial(n - 1);
    }
}
