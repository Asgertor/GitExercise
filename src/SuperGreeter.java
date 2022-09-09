import java.util.Scanner;

public class SuperGreeter {
    public void start(){
        System.out.println("Det virker!");
    }
    public void greet(){
        Scanner sc = new Scanner(System.in);

        String fh = sc.next();

        System.out.println(fh);
    }

}
