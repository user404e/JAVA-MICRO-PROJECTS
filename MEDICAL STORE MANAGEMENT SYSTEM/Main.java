import java.util.Scanner;

public class Main{
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int choice = -1;

        while(choice!=0){
            System.out.println("1) ADMIN");
            System.out.println("2) STAFF");
            System.out.println("0) Exit\n");

            System.out.print("_ : ");

            choice = scan.nextInt();   
        }
    }
}