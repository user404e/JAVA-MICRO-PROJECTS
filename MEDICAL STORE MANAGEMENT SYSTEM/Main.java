import java.util.Scanner;

public class Main{
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int choice = -1;
        
        while(choice!=0){
            System.out.println("\n!- MAIN MENU -!");

            System.out.println("\n1) ADMIN");
            System.out.println("2) STAFF");
            System.out.println("0) Exit\n");

            System.out.print("_ : ");

            choice = scan.nextInt();   

            if(choice == 1){
                login l = new login();

                int count = 1;

                while(count<=3){
                    

                    System.out.println("\n!- ADMIN LOGIN -!");

                    System.out.print("\nUserID : ");
                    String id = scan.next();

                    System.out.print("Password : ");
                    String pass = scan.next();

                    if(l.loginadmin(id, pass)){
                        count = 4;
                        System.out.println("\nLogin Successful");

                        int choice1 = -1;

                        while(choice1 != 0){
                            System.out.println("\n!- ADMIN MENU -!");

                            System.out.println("\n1) CHECK SUPPLIERS DATA");
                            System.out.println("2) CHECK STAFF DATA");
                            System.out.println("3) ADD NEW STAFF MEMBER");
                            System.out.println("4) CHECK CUSTOMER DATA");
                            System.out.println("5) CHECK STOCKS DATA");

                            System.out.println("0) BACK TO MAIN MENU");

                            System.out.print("\n_ : ");

                            choice1 = scan.nextInt(); 

                            if(choice1 == 2){
                                int choice12 = -1;
                                
                                while(choice12!=0){
                                    System.out.println("\n!- CHECK STAFF DATA -!");

                                    System.out.println("\n1) ALL");
                                    System.out.println("2) SPECIFIC STAFF MEMBER");
                                    System.out.println("0) BACK TO ADMIN MENU");

                                    System.out.print("\n_ : ");

                                    choice12 = scan.nextInt(); 
                                    Staff s1 = new Staff();

                                    if(choice12 == 1){

                                        s1.staffdataall();
                                    }
                                    else if(choice12 == 2){

                                        System.out.print("\nEnter First Name Of StaffMember : ");
                                        String fname = scan.next();

                                        s1.staffdataspecific(fname);
                                    }
                                }    
                            }
                        }  
                    }
                    else{
                        System.out.println("\nWRONG ID PASS , TRY AGAIN");
                        System.out.println((3-count) + " CHANCES LEFT - ");
                        count ++;
                    }
                }
            }

            else if(choice == 2){

                login l = new login();

                int count = 1;

                while(count<=3){
                    System.out.println("\n!- STAFF LOGIN -!");
                    System.out.print("\nUserID : ");
                    String id = scan.next();

                    System.out.print("Password : ");
                    String pass = scan.next();

                    if(l.loginstaff(id, pass)){
                        count = 4;
                        System.out.println("\nLogin Successful");

                        System.out.println("");
                        
                    }
                    else{
                        System.out.println("\nWRONG ID PASS , TRY AGAIN");
                        System.out.println((3-count) + " CHANCES LEFT - ");
                        count ++;
                    }
                }
            }
        }
    }
}