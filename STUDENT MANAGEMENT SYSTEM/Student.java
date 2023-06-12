import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Date;
import java.io.File;
import java.util.Scanner;
class Student {
    File f = new File("StudentData.csv");
    void addNewStudent(String fname, String lname, String fathername, String department, String sem, String enrollmentnum) {
        try {
            Date currentdate = new Date();
            String finalstudentdata = enrollmentnum + "," + fname + "," + lname + "," + fathername + "," + department + "," + sem + "," + currentdate + "\n";
            FileWriter fw = new FileWriter("StudentData.csv", true);

            fw.append(finalstudentdata);
            fw.close();

            System.out.println("\nStudent details added successfully -");

        } catch (IOException e) {
            System.out.println("An error occurred while writing to the file , try again - .");
            e.printStackTrace();
        }
    }
    void searchStudent(String fname) {

        try {
            Double num = Double.parseDouble(fname);
            Scanner scan = new Scanner(f);
            boolean flag = false;

            while(scan.hasNextLine()) {
                    
                String studentdata = scan.nextLine();
                String[] std = studentdata.split(",");
                    
                if(fname.equals(std[0])) {
                    System.out.println("\n!!- Student Data -!!");
    
                    System.out.println("\nEnrollment Number   =    " + std[0]);
                    System.out.println("Name                =    " + std[1] + " " + std[2]);
                    System.out.println("Father Name         =    " + std[3]);
                    System.out.println("Department          =    " + std[4]);
                    System.out.println("Sem                 =    " + std[5]);
                    System.out.println("Admission Date      =    " + std[6]);             
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
                    
                    String studentdata = scan.nextLine();
                    String[] std = studentdata.split(",");
                    
                    if(fname.equals(std[1])) {
                        System.out.println("\n!!- Student Data -!!");
        
                        System.out.println("\nEnrollment Number   =    " + std[0]);
                        System.out.println("Name                =    " + std[1] + " " + std[2]);
                        System.out.println("Father Name         =    " + std[3]);
                        System.out.println("Department          =    " + std[4]);
                        System.out.println("Sem                 =    " + std[5]);
                        System.out.println("Admission Date      =    " + std[6]);             
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
}
