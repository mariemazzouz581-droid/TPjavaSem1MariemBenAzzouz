public class operationlogique {
    public static void main(String[] args) {
        int a=6,b=21;
        boolean Res;
        Res=a>b;
        System.out.println("a>b?"+Res);/*false */
        Res=(a<b);
        System.out.println("a<b?"+Res);/*true */
        Res=a==b;
        System.out.println("a==b?"+Res);/*false */
        Res=a!=b;
       System.out.println("a!=b?"+Res);/*true */
        Res=(a<b)&(a==b);
        System.out.println("(a<b)&(a==b)?"+Res);/*false */
        Res=(a<b)|(a==b);
        System.out.println("(a<b)&(a==b)?"+Res);/*true */
        Res=(a<b)^(a==b);
        System.out.println("(a<b)^(a==b)?"+Res);/*true */
        Res=a<b?true:false;
        System.out.println("a<b?true:false?"+Res);/*true */
        
    }
}
