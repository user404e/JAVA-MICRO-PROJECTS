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
                            System.out.println("3) UPDATE STAFF DATA");
                            System.out.println("4) ADD NEW STAFF MEMBER");
                            System.out.println("5) CHECK CUSTOMER DATA");
                            System.out.println("6) CHECK STOCKS DATA");
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
                            else if(choice1 == 3){

                                int choice13 = -1;
                                System.out.println("\n!- UPDATE STAFF DATA -!");

                                while(choice13!=0){
                                    
                                    System.out.println("\n1) UPDATE FIRST NAME");
                                    System.out.println("2) UPDATE LAST NAME");
                                    System.out.println("3) UPDATE AGE");
                                    System.out.println("4) UPDATE MOBILE NUMBER");
                                    System.out.println("5) UPDATE ADDRESS");
                                    System.out.println("6) UPDATE SALARY");
                                    System.out.println("0) BACK TO ADMIN MENU");

                                    System.out.print("\n_ : ");

                                    choice13 = scan.nextInt(); 

                                    if(choice13==1){
                                        System.out.println("!! - UPDATE FIRST NAME -!!");

                                        System.out.println("Enter Old First Name : ");
                                        String oldfname = scan.next();

                                        Staff s1 = new Staff();
                                        int rvalue = s1.checkstaffmember(oldfname);
                                        System.out.println(rvalue);                                        
                                    }
                                }
                            }
                        }  
                    }
                    else{
                        System.out.println("\nWRONG ID 'or' PASS , TRY AGAIN");
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