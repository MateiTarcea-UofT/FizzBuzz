package lab1;

public class Multiples {
    public static void main(String[] args) {
        int count = multiples(1000, 4,4);
        System.out.println(count);
    }

    public static int multiples(){
        int count = 0;
        for (int j = 1; j < 1000; j++) {
            if (j % 3 == 1 || j % 5 == 1){
                count++;
            }
        }
        return count;
    }

    public static int multiples(int n, int a, int b) {
        int count = 0;
        for (int j = 1; j < n; j++) {
            if (j % a == 0 || j % b == 0){
                System.out.println(j);
                count++;
            }
        }
        return count;
    }
}
