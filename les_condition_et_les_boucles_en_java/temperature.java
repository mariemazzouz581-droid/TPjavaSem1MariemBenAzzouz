import java.util.Scanner;

public class temperature {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        float t;
        System.out.println("donner température de l'eau");
        t=sc.nextFloat();
        if(t<0)
        {System.out.println("Glace");}
        else if(t<=100)
        {System.out.println("eau");}
        else{System.out.println("vapeur");}
        sc.close();
    }
}