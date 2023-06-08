import java.io.File;
import java.util.Scanner;
import java.io.FileNotFoundException;


public class Staff {

        File f = new File("StaffData.csv");
        
    void staffdataall(){
        
        System.out.println("\n!!- Staff Data -!!");

        try {
            Scanner scan = new Scanner(f);
            int count = 1;

            while(scan.hasNextLine()){
                
                String stfdata = scan.nextLine();
                String[] stf = stfdata.split(",");

                System.out.println("\n##  Staff Member - " + count + "  ##");
                
                System.out.println("\nName = " + stf[0] + " " + stf[1]);
                System.out.println("Age = " + stf[2]);
                System.out.println("Mobile Number = " + stf[3]);
                System.out.println("Address = " + stf[4]);
                System.out.println("Joining Date = " + stf[5]);
                System.out.println("Salary = " + stf[6]);

                count ++;
            }
        } catch (FileNotFoundException e) {
            System.out.println("\nFILE NOT FOUND - ");
        }
    }

    void staffdataspecific(String fname) {

        try {
            Integer num = Integer.parseInt(fname);
            Scanner scan = new Scanner(f);
            boolean flag = false;

            while(scan.hasNextLine()) {
                    
                String stfdata = scan.nextLine();
                String[] stf = stfdata.split(",");
                    
                if(fname.equals(stf[0])) {
                    System.out.println("\n!!- Staff Data -!!");
    
                    System.out.println("\nStaff ID = " + stf[0]);
                    System.out.println("Name = " + stf[1] + " " + stf[2]);
                    System.out.println("Age = " + stf[3]);
                    System.out.println("Mobile Number = " + stf[4]);
                    System.out.println("Address = " + stf[5]);
                    System.out.println("Joining Date = " + stf[6]);                        System.out.println("Salary = " + stf[7]);
                    flag = true;
                    break;
                }
            }
    
            if(flag == false) {
                System.out.println("\nSorry Staff Member Not Found 'or' Check Spelling And Try Again -");
            }
        }    
        catch (NumberFormatException e) {

            try {
                Scanner scan = new Scanner(f);
    
                boolean flag = false;
    
                while(scan.hasNextLine()) {
                    
                    String stfdata = scan.nextLine();
                    String[] stf = stfdata.split(",");
                    
                    if(fname.equals(stf[1])) {
                        System.out.println("\n!!- Staff Data -!!");
    
                        System.out.println("\nEmployee ID = " + stf[0]);
                        System.out.println("\nName = " + stf[1] + " " + stf[2]);
                        System.out.println("Age = " + stf[3]);
                        System.out.println("Mobile Number = " + stf[4]);
                        System.out.println("Address = " + stf[5]);
                        System.out.println("Joining Date = " + stf[6]);
                        System.out.println("Salary = " + stf[7]);
                        flag = true;
                        break;
                    }
                }
    
                if(flag == false) {
                    System.out.println("\nSorry Staff Member Not Found 'or' Check Spelling And Try Again -");
                }
            }
            catch (FileNotFoundException a) {
                System.out.println("\nFILE NOT FOUND - ");
            }
        }
        catch(FileNotFoundException fnotfound){
            System.out.println("FILE NOT FOUND , ERROR (:");
        }
    }
    void updatestaffdata(String s1,String s2,int choice){
        try {
            Scanner scan = new Scanner(f);
        }
        catch(FileNotFoundException e){
            System.out.println("FILE NOT FOUND - ");   
        }    
    }

}