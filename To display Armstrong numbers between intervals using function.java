public class Armstrong {

    public static void main(String[] args) {
        int low = 99, high = 9999;
        for(int number = low + 1; number < high; ++number) {
            if (checkArmstrong(number))
                System.out.print(number + " ");
        }
    }
    public static boolean checkArmstrong(int num) {
        int digits = 0;
        int result = 0;
        int originalNumber = num;
        while (originalNumber != 0) {
            originalNumber /= 10;
            ++digits;
        }
        originalNumber = num;
        while (originalNumber != 0) {
            int remainder = originalNumber % 10;
            result += Math.pow(remainder, digits);
            originalNumber /= 10;
        }
        if (result == num)
            return true;
        return false;
    }
}