public class Largest {

    public static void main(String[] args) {

        double n1 = -34.5, n2 = 43.9, n3 = 28.5;

        if( n1 >= n2 && n1 >= n3)
            System.out.println(n1 + " is the largest number.");

        else if (n2 >= n1 && n2 >= n3)
            System.out.println(n2 + " is the largest number.");

        else
            System.out.println(n3 + " is the largest number.");
    }
}