package lab1;

public class Multiples {
    public static void main(String[] args) {
        int count = 0;
        for (int j = 1; j < 1000; j++) {
            if (j % 3 == 1 || j % 5 == 1){
                count++;
            }
        }
        System.out.println(count);
    }
}
