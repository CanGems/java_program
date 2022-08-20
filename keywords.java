import java.util.Scanner;

public class keywords {
    

    public static void main(String[] args) throws Exception {
        Scanner sc= new Scanner(System.in);
        int age= sc.nextInt();
        System.out.println(age);
        for (int i=1; i<=5;i++){
            System.out.println(i);
            Thread.sleep(1000);
            System.out.println();
        }
        for (int i=1;i<=4;i++){
            for (int j=1;j<=i;j++){
                System.out.print("*");
                Thread.sleep(1000);
            }
            System.out.println();
        }
        if (age<18){
            throw new ArithmeticException ("cannot eligible for vote");
        }
        else{
            System.out.println("eligible for vote");
        }
    }
}
