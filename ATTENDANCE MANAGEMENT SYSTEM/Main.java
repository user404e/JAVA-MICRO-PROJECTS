import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {
	int validate(int Employeeid){

		File f = new File("EmployeeData.csv");
		try {
			Scanner fileread = new Scanner(f);
			boolean flag = false;
			if(!fileread.hasNextLine()){
				return -1;
			}
			while(fileread.hasNextLine()){
				String EmployeeData = fileread.nextLine();
				String EmpDataArray[] = EmployeeData.split(",");
				int id = Integer.parseInt(EmpDataArray[0]);
				if(id == Employeeid){
					flag = true;
					break;
				}	
			}
			if(flag){
				return 1;
			}
			else{
				return 0;
			}
		} catch (FileNotFoundException e) {
			return -2;
		}
	}
	public static void main(String[] args) {
		int choice = -1;
		Scanner sc = new Scanner(System.in);
		while(choice!=0){
			System.out.print("Enter Employee Id : ");
			choice = sc.nextInt();
			Main m = new Main();
			int rvalue = m.validate(choice);
			if(rvalue == 1){
				System.out.println("Verified");
			}
			else if(rvalue == 0){
				System.out.println("Employeeid Doesnt Match");
			}
			else if(rvalue == -1){
				System.out.println("EmployeeData File Is Empty");
			}
			else{
				System.out.println("File Not Found");
			}
		}
	}
}