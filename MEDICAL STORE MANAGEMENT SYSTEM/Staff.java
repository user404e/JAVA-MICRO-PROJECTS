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
            Scanner scan = new Scanner(f);

            boolean flag = false;

            while(scan.hasNextLine()) {
                
                String stfdata = scan.nextLine();
                String[] stf = stfdata.split(",");
                
                if(fname.equals(stf[0])) {
                    System.out.println("\n!!- Staff Data -!!");

                    System.out.println("\nName = " + stf[0] + " " + stf[1]);
                    System.out.println("Age = " + stf[2]);
                    System.out.println("Mobile Number = " + stf[3]);
                    System.out.println("Address = " + stf[4]);
                    System.out.println("Joining Date = " + stf[5]);
                    System.out.println("Salary = " + stf[6]);
                    flag = true;
                    break;
                }
            }

            if(flag == false) {
                System.out.println("\nSorry Staff Member Not Found 'or' Check Spelling And Try Again -");
            }
        }
        catch (FileNotFoundException e) {
            System.out.println("\nFILE NOT FOUND - ");
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

    int checkstaffmember(String fname){
        try {
            Scanner scan = new Scanner(f);
            int count = 1;
            while(scan.hasNextLine()){
                String stfdata = scan.nextLine();
                String[] stf = stfdata.split(",");
                if(stf[0].equals(fname)){
                    return count;
                }
                count++;
            }
            return 0;
        }
        catch(FileNotFoundException e){
            return -1;   
        } 
    }
}