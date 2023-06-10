import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int choice = -1;
        do {
            System.out.println("\n -------- Main Menu --------");
            System.out.println("\n1) Faclty");
            System.out.println("2) Student");
            System.out.println("0) Exit");

            Scanner sc = new Scanner(System.in);
            System.out.print("\nEnter Your Choice : ");
            choice = sc.nextInt();
            
            switch (choice) {
                case 1:
                    System.out.println("\n -------- Faculty Menu --------");

                    int count = 1;
                    Login lg = new Login();

                    do {
                        System.out.print("\nEnter UserId : ");
                        String id = sc.next();

                        System.out.print("Enter PassWord : ");
                        String pass = sc.next();

                        if(lg.facultylogin(id, pass)){

                            System.out.println("Login Successfull");
                            break;
                        }
                        else{
                            System.out.println("Incorrect UserId Or PassWord , Try Again");
                            System.out.println((3-count) + " Chances Left");
                        }
                        count ++;
                    } while (count<=3);

                    break;
                case 2:
                System.out.println("\n -------- Student Menu --------");
                    break;
                case 0:
                    System.out.println("\nExited");
                    break;
                default:
                    System.out.println("\nWrong input ");
                    break;
            }
            
        }while (choice!=0); 
    } 
}