package chapter4;

public class chapter4to3 {
    public static void main(String[] args) {
        int sum = 0;
        int maxsum = 0;
        for(int i = 1; i <= 10; i++) {
            sum += i;
            maxsum += sum;
        }
        System.out.println("sum="+maxsum);
    }
}
