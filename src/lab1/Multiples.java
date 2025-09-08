package lab1;

public class Multiples {
    public static void main(String[] args) {
        int count = multiples(1000, 3,5);
        System.out.println(count);
    }

    public static int multiples(int n, int a, int b) {
        int count = 0;
        for (int j = 1; j < n; j++) {
            if (j % a == 1 || j % b == 1){
                count++;
            }
        }
        return count;
    }
}
