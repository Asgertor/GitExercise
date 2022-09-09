import java.util.Scanner;

public class SuperGreeter {
    public void start(){
        System.out.println("Det virker!");
    }
    public void greet(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Hvad hedder du?");
        String navn = sc.next();
        System.out.printf("Hej %s %n",navn);
    }
    public void askAboutAge(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Hvor gammel er du?");
        int age = sc.nextInt();
        System.out.printf("Du er %d gammel",age);

    }

}
