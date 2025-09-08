package lab1;

public class Reduce {
    public static void main(String[] args) {
        int count = reduce(4);
        System.out.println(count);
    }

    public static int reduce(int a){
        int count = 0;
        while (a > 0) {
            if (a % 2 == 0) {
                a = a / 2;
                count++;
            } else {
                a--;
                count++;
            }
        }
        return count;

    }
}
