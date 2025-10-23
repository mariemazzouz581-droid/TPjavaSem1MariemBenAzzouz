import java.util.Scanner;

public class ex3 {
    public static int LectureN(){
        int x;
        Scanner sc =new Scanner (System.in);
    do{
        System.out.println("donner un entier postive");
        x=sc.nextInt();
    }while(x<=0); return x;
}
    public static int calculSomme(int n){
        int s=0;
        int i;
        for(i=1;i<=n;i++){
            s += i*i;
        }return s;
      }

    public static void main(String[] args) {
         int nb=LectureN();
         int b=calculSomme(nb);
       System.out.println("le somme de premier carré de  "+nb+" est "+b);
    }
}
