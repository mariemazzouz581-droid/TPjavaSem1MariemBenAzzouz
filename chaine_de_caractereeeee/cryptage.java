import java.util.Scanner;

public class cryptage {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int i;
        String ch = sc.nextLine();
        do{
            System.out.print("Veuillez saisir une phrase: ");
        }while(!(ch.length()<=30));
         StringBuffer ch1 = new StringBuffer(ch);
         for (i=0;i<=ch.length();i++){
            char l;
            if(ch.charAt(i)>='a' && ch.charAt(i)<='z'){
                
            }
         }

        
        
    }
}
