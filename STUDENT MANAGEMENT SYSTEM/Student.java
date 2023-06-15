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

    int updatestudentdata(String s1,String s2,int choice){

        try {

            Scanner scan = new Scanner(f);
            boolean flag = false;
            String final_s = "";
            
            while(scan.hasNextLine()){
                String line = scan.nextLine();
                
                if(choice == 1){
                    String data[] = line.split(",");
                    if(data[0].equals(s1)){
                        flag = true; 
                        data[1] = s2;
                        line = data[0] + "," + data[1] + "," + data[2] + "," + data[3] + "," + data[4] + "," + data[5] + "," + data[6];   
                    } 
                }
                else if(choice == 2){
                    String data[] = line.split(",");
                    if(data[0].equals(s1)){
                        flag = true; 
                        data[2] = s2;
                        line = data[0] + "," + data[1] + "," + data[2] + "," + data[3] + "," + data[4] + "," + data[5] + "," + data[6];
                    } 
                }
                else if(choice == 3){
                    String data[] = line.split(",");
                    if(data[0].equals(s1)){
                        flag = true; 
                        data[3] = s2;
                        line = data[0] + "," + data[1] + "," + data[2] + "," + data[3] + "," + data[4] + "," + data[5] + "," + data[6];
                    } 
                }
                else if(choice == 4){
                    String data[] = line.split(",");
                    if(data[0].equals(s1)){
                        flag = true; 
                        data[4] = s2;
                        line = data[0] + "," + data[1] + "," + data[2] + "," + data[3] + "," + data[4] + "," + data[5] + "," + data[6];
                    } 
                }
                else if(choice == 5){
                    String data[] = line.split(",");
                    if(data[0].equals(s1)){
                        flag = true; 
                        data[5] = s2;
                        line = data[0] + "," + data[1] + "," + data[2] + "," + data[3] + "," + data[4] + "," + data[5] + "," + data[6];
                    } 
                }
                final_s = final_s + line + "\n";
            }

            FileWriter fw = new FileWriter("StudentData.csv");

            fw.write(final_s);
            fw.close();
            
            if(flag){
                return 0;
            }
            else{
                return 1;
            }
        }
        catch(FileNotFoundException e){
            System.out.println("\nFile Not Found ...."); 
            return -1;
        } 
        catch(IOException d){
            System.out.println("\nIOException ....");
            return -1;
        }   
    }
    int removestudent(String enrollmentno){

        try {
            Scanner scan = new Scanner(f);

            String final_String = "";
            boolean flag = false;

            while(scan.hasNextLine()){
                String line = scan.nextLine();
                String data[] = line.split(",");

                if(data[0].equals(enrollmentno)){
                    flag = true;
                    continue;
                }
                final_String += line + "\n";
            }
            
            FileWriter fw = new FileWriter("StudentData.csv");

            fw.write(final_String);
            fw.close();

            if(flag){
                return 0;
            }
            else{
                return 1;
            }

        } catch (FileNotFoundException e) {
            return -1;

        } catch(IOException io){
            return -1;
        }
    }  
}