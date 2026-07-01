public class Pattern1{
    public static void main(String[] args) {
       System.out.println(odd(66)); 
    }
    static boolean odd(int n){
     return (n & 1)==1;
    }
}