// given a number n, find the number of setbits in it

public class Pattern8 {

    public static void main(String[] args) {
        int n = 14;
        // System.out.println(Integer.toBinaryString(n));
        System.out.println(countSetBits(n));

    }

    static int countSetBits(int n) {
        int count = 0;
        // while (n > 0) {
        //     count++;
        //     n-= n & (-n);

        // }
        while(n>0){
            count++;
            n=n & (n-1);
        }

        return count;
    }
}
