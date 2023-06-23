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
                        Staff s1 = new Staff();

                        while(choice1 != 0){
                            System.out.println("\n!- ADMIN MENU -!");

                            System.out.println("\n1) CHECK SUPPLIERS DATA");
                            System.out.println("2) CHECK STAFF DATA");
                            System.out.println("3) UPDATE STAFF DATA");
                            System.out.println("4) ADD NEW STAFF MEMBER");
                            System.out.println("5) REMOVE STAFF MEMBER");
                            System.out.println("6) CHECK CUSTOMER DATA");
                            System.out.println("7) CHECK STOCKS DATA");
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
                                    
                                    if(choice12 == 1){

                                        s1.staffdataall();
                                    }
                                    else if(choice12 == 2){

                                        System.out.print("\nEnter First Name Of StaffMember 'or' StaffId : ");
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

                                        System.out.println("\n!!- UPDATE FIRST NAME -!!");
                                        
                                        System.out.print("\nEnter Your Employee ID : ");
                                        String empid = scan.next();

                                        System.out.print("\nEnter Your New First Name : ");
                                        String fname = scan.next();

                                        int rvalue = s1.updatestaffdata(empid,fname,1); 
                                        if(rvalue==0){
                                            System.out.println("\nUpdated Successfully ....");
                                        }
                                        else if(rvalue == 1){
                                            System.out.println("\nGiven Staff Id Is Wrong ....");
                                        }                 
                                    }
                                    else if(choice13==2){
                                        System.out.println("\n!!- UPDATE LAST NAME -!!");
                                        
                                        System.out.print("\nEnter Your Employee ID : ");
                                        String empid = scan.next();

                                        System.out.print("\nEnter Your New Last Name : ");
                                        String lname = scan.next();

                                        int rvalue = s1.updatestaffdata(empid,lname,2);

                                        if(rvalue==0){
                                            System.out.println("\nUpdated Successfully ....");
                                        }
                                        else if(rvalue == 1){
                                            System.out.println("\nGiven Staff Id Is Wrong ....");
                                        }                 
                                    }
                                    else if(choice13==3){

                                        System.out.println("\n!!- UPDATE AGE -!!");
                                        
                                        System.out.print("\nEnter Your Employee ID : ");
                                        String empid = scan.next();

                                        System.out.print("\nEnter Your New Age : ");
                                        String lname = scan.next();

                                        int rvalue = s1.updatestaffdata(empid,lname,3);

                                        if(rvalue==0){
                                            System.out.println("\nUpdated Successfully ....");
                                        }
                                        else if(rvalue == 1){
                                            System.out.println("\nGiven Staff Id Is Wrong ....");
                                        }                 
                                    }
                                    else if(choice13==4){

                                        System.out.println("\n!!- UPDATE MOBILE NUMBER -!!");
                                        
                                        System.out.print("\nEnter Your Employee ID : ");
                                        String empid = scan.next();

                                        System.out.print("\nEnter Your New Mobile Number : ");
                                        String lname = scan.next();

                                        int rvalue = s1.updatestaffdata(empid,lname,4);

                                        if(rvalue==0){
                                            System.out.println("\nUpdated Successfully ....");
                                        }
                                        else if(rvalue == 1){
                                            System.out.println("\nGiven Staff Id Is Wrong ....");
                                        }                 
                                    }
                                    else if(choice13==5){

                                        System.out.println("\n!!- UPDATE ADDRESS -!!");
                                        
                                        System.out.print("\nEnter Your Employee ID : ");
                                        String empid = scan.next();

                                        System.out.print("\nEnter Your New Address : ");
                                        String address= scan.nextLine();
                                        address+=scan.nextLine();

                                        int rvalue = s1.updatestaffdata(empid,address,5);

                                        if(rvalue==0){
                                            System.out.println("\nUpdated Successfully ....");
                                        }
                                        else if(rvalue == 1){
                                            System.out.println("\nGiven Staff Id Is Wrong ....");
                                        }                 
                                    }
                                    else if(choice13==6){

                                        System.out.println("\n!!- UPDATE SALARY -!!");
                                        
                                        System.out.print("\nEnter Employee ID : ");
                                        String empid = scan.next();

                                        System.out.print("\nEnter New Salary : ");
                                        String lname = scan.next();

                                        int rvalue = s1.updatestaffdata(empid,lname,7);

                                        if(rvalue==0){
                                            System.out.println("\nUpdated Successfully ....");
                                        }
                                        else if(rvalue == 1){
                                            System.out.println("\nGiven Staff Id Is Wrong , Check And Try Again - ");
                                        }                
                                    }
                                    else if(choice13 == 0){
                                        System.out.println("\n- EXITED STAFF DATA UPDATE MENU -");
                                    }
                                    else{
                                        System.out.println("\n- INVALID INPUT -");
                                    }
                                }
                            }
                            else if(choice1 == 5){
                                System.out.println("\n!- REMOVE STAFF MEMBER -!");

                                System.out.print("Enter Staff Id : ");
                                String staffId = scan.next();

                                int rvalue = s1.removestaffmember(staffId);

                                if(rvalue == 0){
                                    System.out.println("\nProfile Deleted Successfully - ");
                                }
                                else if(rvalue == 1){
                                    System.out.println("\nGiven Staff Id Is Wrong , Check And Try Again - ");
                                } 
                            }
                            else if(choice1 == 7){

                                int choice17 = -1;
                                Stock stk = new Stock();

                                do {
                                    System.out.println("\n! - CHECK STOCKS DATA - !");

                                    System.out.println("\n1) - SEARCH SPECIFIC MEDICINE");
                                    System.out.println("2) - SHOW ALL MEDICINE DATA");
                                    System.out.println("0) - Exit");

                                    System.out.print("\n_ : ");

                                    choice17 = scan.nextInt();

                                    if(choice17 == 1){
                                        System.out.println("\n!! -- Search Specific Medicine -- !!");

                                        System.out.print("\nEnter Medicine Name : ");
                                        String medName = scan.next();

                                        System.out.print("\nEnter Power(mg) 'or' Enter 0 To Show All mg : ");
                                        String powerMg = scan.next();

                      
                                        int rvalue = stk.searchMedicine(medName,powerMg);

                                        if(rvalue == 1){
                                            System.out.println("\nMedicine Not Found , Check Spelling And Try Again - ");
                                        }   
                                    }
                                    else if(choice17 == 2){
                                        System.out.println("\n!! -- All Medicine Data -- !!");

                                        stk.showallmed();
                                    }
                                    else if(choice17 == 0){
                                        System.out.println("\nCheck Stock Data Menu Exited - ");
                                    }
                                    else{
                                        System.out.println("\nInvalid Input - ");
                                    }

                                } while (choice17!=0);
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

                        int choice21 = -1;

                        while(choice21!=0){

                            System.out.println("1) BILLING");
                            System.out.println("0) - Exit");
                            
                            System.out.print("\n_ : ");

                            choice21 = scan.nextInt();

                            if(choice21 == 1){
                                System.out.println("\n!! - Billing - !!");

                                
                            }
                            else if(choice21 == 0){
                                System.out.println("\nStaff Menu Exited - ");
                            }
                            else{
                                System.out.println("\nInvalid Input , Check Options And Try Again - ");
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
            else if (choice == 0) {
                System.out.println("\nPROGRAM EXITED -");
            }
            else {
                System.out.println("\nINVALID INPUT , TRY AGAIN - ");
            }
        }
    }
}