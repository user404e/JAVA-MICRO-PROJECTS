import java.io.FileWriter;
import java.io.IOException;
import java.util.Date;
class Student {

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
}
