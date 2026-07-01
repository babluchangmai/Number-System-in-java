// calculate a to the power of b
public class Pattern7 {
    public static void main(String[] args) {
       int base=3;
       int ans=1;
       int power=4;
       while(power>0){
        if((power&1)==1){
            ans=ans*base;
        }
        base=base*base;
        power=power>>1;
       }
       System.out.println(ans);
    }
}
