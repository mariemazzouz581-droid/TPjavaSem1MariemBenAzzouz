import java.util.Scanner;

public class exercice4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x , i, f;
         do{ 
             System.out.println("saisir un nentir positif");
             x=sc.nextInt();
         }while (!(x=>0));
        if(x==0){
            System.out.println("le facteur de 0 est 1");
        }
        else{   
            f=1;
            for(i=1;i<=x;i++){
                
                f=f*i;
                
            }
            System.out.println(x+"!="+f);
        }
    }
    
}
