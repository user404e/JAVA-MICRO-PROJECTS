import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
import java.util.ArrayList;

public class Main {

    int addEntry(String employeeId) {
        File f = new File("EmployeeData.csv");
        try {
            Scanner fileread = new Scanner(f);
            if (!fileread.hasNextLine()) {
                return -1;
            }

            ArrayList<String> empData = new ArrayList<String>();

            while (fileread.hasNextLine()) {
                empData.add(fileread.nextLine());
            }
            
            FileWriter fw = new FileWriter("EmployeeAttendance.csv", true);
            
            for (String empDta : empData) {
                String emp[] = empDta.split(",");
                if (employeeId.equals(emp[0])) {
                    fw.append(empDta + ",present\n");
                    empData.remove(empDta);
                    fw.close();
                    return 1;
                }
            }

            fw.close();

            return 0;

        } catch (FileNotFoundException e) {
            return -2; 
        } catch (IOException e) {
            return -3; 
        }
    }

    public static void main(String[] args) {
        String input = "";
        Scanner sc = new Scanner(System.in);
        while (!input.equals("exit")) {
            System.out.print("\nEnter Employee Id: ");
            input = sc.next();

            Main m = new Main();

            int rvalue = m.addEntry(input);

            if (rvalue == 1) {
                System.out.println("Entry Added Successfully");
            } else if (rvalue == 0) {
                System.out.println("Employee ID Doesn't Match");
            } else if (rvalue == -1) {
                System.out.println("EmployeeData File Is Empty");
            } else {
                System.out.println("File Not Found");
            }
        }
    }
}
