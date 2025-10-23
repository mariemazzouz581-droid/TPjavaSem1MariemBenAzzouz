import java.util.Scanner;
public class ex1 {
    public static int LectureN(){
        int x;
        Scanner sc =new Scanner (System.in);
    do{
        System.out.println("donner un entier postive");
        x=sc.nextInt();
    }while(x<=0);
    return x;
    }
    public static boolean Estpair(int x){
        if(x%2==0){
            return true;
        }
        else{
            return false;
        }}
        public static void main(String[] args) {
        int n,i;
        for (i=0;i<10;i++){
            n=LectureN();
            if(Estpair(n)){
                System.out.print(n);                                                 
            }
        }
    }
}

