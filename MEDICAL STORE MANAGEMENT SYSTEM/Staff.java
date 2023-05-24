import java.io.File;
import java.util.Scanner;
import java.io.FileNotFoundException;


public class Staff {

    void staffdataall(){
        System.out.println("\n!!- Staff Data -!!");

        try {

            File f = new File("StaffData.csv");
            Scanner scan = new Scanner(f);
            int count = 1;

            while(scan.hasNextLine()){
                
                String stfdata = scan.nextLine();
                String[] stf = stfdata.split(",");

                System.out.println("\n##  Staff Member - " + count + "  ##");
                
                System.out.println("\nName = " + stf[0]);
                System.out.println("Age = " + stf[1]);
                System.out.println("Mobile Number = " + stf[2]);
                System.out.println("Address = " + stf[3]);
                System.out.println("Joining Date = " + stf[4]);
                System.out.println("Salary = " + stf[5]);

                count ++;
            }
        } catch (FileNotFoundException e) {
            System.out.println("\nFILE NOT FOUND - ");
        }
    }
    void staffdataspecific(String fname){
        System.out.println("\n!!- Staff Data -!!");

        try {

            File f = new File("StaffData.csv");
            Scanner scan = new Scanner(f);
            int count = 1;

            while(scan.hasNextLine()){
                
                String stfdata = scan.nextLine();
                String[] stf = stfdata.split(",");

                if(fname.equals(stf[0])){
                    System.out.println("\nName = " + stf[0] + " " + stf[1]);
                    System.out.println("Age = " + stf[2]);
                    System.out.println("Mobile Number = " + stf[3]);
                    System.out.println("Address = " + stf[4]);
                    System.out.println("Joining Date = " + stf[5]);
                    System.out.println("Salary = " + stf[6]);
                    break;
                }
            }
        } catch (FileNotFoundException e) {
            System.out.println("\nFILE NOT FOUND - ");
        }
    }
}
