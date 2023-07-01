import java.io.File;
import java.util.Scanner;

class Result {

   int printdata(String enrolmentNumber,String sem){

        File f = new File("ResultData.csv");

        try {
            
            Scanner scf = new Scanner(f);
            boolean flag1 = false;
            boolean flag2 = false;
            if(!scf.hasNextLine()){

                System.out.println("\nFile Is Empty - ");
            }

            else{

                while(scf.hasNextLine()){
                    String result = scf.nextLine();
                    String rdata[] = result.split(",");
                    if(enrolmentNumber.equals(rdata[0])){
                        flag1 = true;
                        if(sem.equals("0")){
                            flag2 = true;
                            System.out.println("\nName = " + rdata[1] + " " + rdata[2]);
                            System.out.println("Enrollment Number = " + rdata[0]);
                            System.out.println("Semester = " + rdata[3]);
                            System.out.println("\nMarks : ");
                            System.out.println("\nSubject 1 = " + rdata[4]);
                            System.out.println("Subject 2 = " + rdata[5]);
                            System.out.println("Subject 3 = " + rdata[6]);
                            System.out.println("Subject 4 = " + rdata[7]);
                            System.out.println("\nTotal Marks = " + rdata[8]);
                            System.out.println("\nPercentage = " + rdata[9] + " %");
                        }
                        else if(sem.equals(rdata[3])){
                            flag2 = true;
                            System.out.println("\nName = " + rdata[1] + " " + rdata[2]);
                            System.out.println("Enrollment Number = " + rdata[0]);
                            System.out.println("Semester = " + rdata[3]);
                            System.out.println("\nMarks : ");
                            System.out.println("\nSubject 1 = " + rdata[4]);
                            System.out.println("Subject 2 = " + rdata[5]);
                            System.out.println("Subject 3 = " + rdata[6]);
                            System.out.println("Subject 4 = " + rdata[7]);
                            System.out.println("\nTotal Marks = " + rdata[8]);
                            System.out.println("\nPercentage = " + rdata[9] + " %");
                        }
                    }
                }
            }
            
            if(!flag2){
                return 3; // if given sem is not found
            }
            if(flag1){
                return 0; // if match found
            }
            else{
                return 1; // if match not found
            }
        } catch (Exception e) {
            return -1;   
        }
   } 
}
