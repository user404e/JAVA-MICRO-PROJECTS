import java.util.Scanner;
import java.io.File;
import java.util.ArrayList;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;

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
                            System.out.println("\n!- STAFF MENU -!");

                            System.out.println("\n1) Generate Bill");
                            System.out.println("2) Add To Cart");
                            System.out.println("3) Clear Cart");
                            System.out.println("4) Remove Item From Cart");
                            System.out.println("0) Exit");
                            
                            System.out.print("\n_ : ");

                            choice21 = scan.nextInt();

                            if(choice21 == 1){
                                System.out.println("\nGenerate Bill");

                                File f = new File("cartdata.csv");

                                try {
                                    Scanner scf = new Scanner(f);

                                    if(!scf.hasNextLine()){
                                        System.out.println("\nCart Is Empty - ");
                                    }
                                    else{
                                        System.out.println("\nItems In Cart : -\n");
                                        while (scf.hasNextLine()) {
                                            String data = scf.nextLine();
                                            String cartdata[] = data.split(",");
                                           
                                            String formattedOutput = String.format("Name: %-20s | Power: %-10s | Price Per Tablet: %-10s | Quantity: %s",
                                                    cartdata[0], cartdata[1], cartdata[2], cartdata[3]);

                                            System.out.println(formattedOutput);
                                        }

                                        System.out.print("\nGet Final Bil (Y/n): ");
                                        String reply = scan.next();

                                        if (reply.toLowerCase().equals("y")) {

                                            Scanner scf2 = new Scanner(f);
                                            int total = 0;

                                            System.out.print("\nEnter Customer Name: ");
                                            String customerName = scan.nextLine();
                                            customerName += scan.nextLine();

                                            System.out.print("Enter Customer Number: ");
                                            String customerNumber = scan.next();

                                            System.out.println(String.format("\n %45s","ABC MEDICAL STORE"));

                                            System.out.println(String.format("\nName: %-36s Number: %s", customerName, customerNumber));
                                            System.out.println("\n" + String.format("Medicine Name                 | Power         | Quantity      | Price\n"));
                                            
                                            while (scf2.hasNextLine()) {
                                                String data = scf2.nextLine();
                                                String[] cartdata = data.split(",");
                                                int medTotalPrice = Integer.parseInt(cartdata[3]) * Integer.parseInt(cartdata[2]);
                                                total += medTotalPrice;
                                                System.out.println(String.format("%-29s | %-13s | %-13s | %d", cartdata[0], cartdata[1], cartdata[3], medTotalPrice));
                                            }
                                            System.out.println("\n\nTotal = " + total + " rs\n");
                                        }
                                        else if(reply.toLowerCase().equals("n")){
                                            System.out.print("\nExited Generate Bill - \n");
                                        }
                                    }
                                } catch (IOException e) {
                                    System.out.println("\nSomething Went Wrong - ");
                                }
                            }
                            else if(choice21 == 2){

                                ArrayList<String> fulldata = new ArrayList<>();
                                String s = "n";
                                
                                do{
                                System.out.println("\n!! -- Add To Cart (Search Medicine) -- !!");

                                System.out.print("\nEnter Medicine Name : ");
                                String medName = scan.next();

                                System.out.print("\nEnter Power(mg) 'or' Enter 0 To Show All mg : ");
                                String powerMg = scan.next();

                                File f = new File("StockData.csv");
                                
                                int c = 0;
                                try {
                                    
                                    Scanner sc = new Scanner(f);
                                    boolean flag = false;
                                    
                                    while(sc.hasNextLine()){
                                        String medicine = sc.nextLine();
                                        String mdata[] = medicine.split(",");
                                        
                                        if(medName.toLowerCase().equals(mdata[1])){
                                            flag = true;
                                            
                                            if(powerMg.equals(mdata[2])){
                                                c++;
                                                System.out.println("\n!! - Medicine Data - !!");
                                                System.out.println("\nMedicine Number  -  " + c);
                                                System.out.println("Manufacturer     -   " + mdata[0]);
                                                System.out.println("Name             -   " + mdata[1]);
                                                System.out.println("Mg               -   " + mdata[2]);
                                                System.out.println("Quantity         -   " + mdata[3]);
                                                System.out.println("Price Per Tablet -   " + mdata[4]);
                                                fulldata.add(medicine);  
                                                break;
                                            }
                                            else if(powerMg.equals("0")){
                                                c++;
                                                System.out.println("\n!! - Medicine Data - !!" );
                                                System.out.println("\nMedicine Number  -   " + (c));
                                                System.out.println("Manufacturer     -   " + mdata[0]);
                                                System.out.println("Name             -   " + mdata[1]);
                                                System.out.println("Mg               -   " + mdata[2]);
                                                System.out.println("Quantity         -   " + mdata[3]);
                                                System.out.println("Price Per Tablet -   " + mdata[4]);
                                                fulldata.add(medicine); 
                                            }  
                                        }
                                    }

                                    if(flag){
                                        System.out.print("\nEnter Medicine Number : ");
                                        int medchoice = scan.nextInt();

                                        System.out.print("\nEnter Quantity : ");
                                        int Quantity = scan.nextInt();
                                        
                                        int c1 = 1;

                                        for(String data:fulldata){

                                            if (medchoice == c1) {

                                                String[] d = data.split(",");

                                                System.out.println("\nName = " + d[1] + "\nPower = " + d[2] + "\nPrice Per Tablet = " + d[4] + "\nQuantity = " + Quantity);

                                                System.out.print("\nAdd To Cart (Y/n) : ");
                                                String reply = scan.next();

                                                if(reply.toLowerCase().equals("y")){
                                                    FileWriter fw = new FileWriter("cartdata.csv",true);
                                                    fw.append(d[1] + "," + d[2] + "," + d[4] + "," + Quantity + "\n");
                                                    fw.close();
                                                }
                                                else{
                                                    break;
                                                }
                                            }
                                            c1++;
                                        }
                                    }
                                } catch (FileNotFoundException e) {

                                    System.out.println("File Not Found");
                                }
                                catch(IOException io){

                                    System.out.println("IOException Occured");
                                }
                                fulldata.clear();
                                System.out.print("\nSearch Another Medicine (Y/n) : ");
                                s = scan.next();

                                if(s.toLowerCase().equals("n")){
                                    System.out.println("EXITED ADD TO CART MENU");
                                }

                                } while (!s.toLowerCase().equals("n"));
                            }
                            else if(choice21 == 3){
                                System.out.println("\nClear Cart");

                                File f = new File("cartdata.csv");

                                try {
                                    Scanner scf = new Scanner(f);
                                    if(!scf.hasNextLine()){
                                        System.out.println("\nCart Is Already Empty - ");
                                    }
                                    else{
                                        FileWriter fw = new FileWriter("cart.csv");

                                        fw.write("");
                                        fw.close();

                                        System.out.println("\nCart Cleared Successfully");
                                    }

                                } catch (Exception e) {

                                    System.out.println("Something Went Wrong - ");

                                }
                            }
                            else if(choice21 == 4){
                                System.out.println("\nRemove Items From Cart");
                            }
                            else if(choice21 == 0){
                                System.out.println("\nExited Staff Menu - ");
                            }
                            else{
                                System.out.println("\nInvalid Input - ");
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
