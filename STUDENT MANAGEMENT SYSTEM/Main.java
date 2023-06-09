import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int choice = -1;
        do {
            System.out.println("\n -------- Main Menu --------");
            System.out.println("\n1) Faclty");
            System.out.println("2) Student");
            System.out.println("0) Exit");

            Scanner sc = new Scanner(System.in);
            System.out.print("\nEnter Your Choice : ");
            choice = sc.nextInt();
            
            Login lg = new Login();

            switch (choice) {
                
                case 1:
                    
                        System.out.print("\nEnter UserId : ");
                        String id = sc.next();

                        System.out.print("Enter PassWord : ");
                        String pass = sc.next();

                        if(lg.facultylogin(id, pass)){

                            System.out.println("\nLogin Successfull");
                            int choice1 = -1;

                            do { 
                                // Display Option Of Faculty Menu.
                                System.out.println("\n -------- Faculty Menu --------");
                                System.out.println("\n1 - ADD NEW STUDENT");
                                System.out.println("2 - REMOVE A STUDENT");
                                System.out.println("3 - SHOW STUDENT PROFILE");
                                System.out.println("4 - UPDATE STUDENT PROFILE");
                                System.out.println("0 - Exit");

                                System.out.print("\nEnter Your Choice : ");
                                choice1 = sc.nextInt();

                                Student s = new Student(); // Student Class object to call addNewStudent methods.

                                // Starting Of 'Add New Student' Option.
                                if(choice1 == 1){
                                    System.out.println("\n ---- Add New Student ----");
                                    System.out.print("\nEnter Enrollemt Number : ");
                                    String enrollmentnum = sc.next();                   // Input Enrollment Number Of Student

                                    System.out.print("Enter First Name : ");
                                    String fname = sc.next();                           // Input First Name Of Student

                                    System.out.print("Enter Last Name : ");
                                    String lname = sc.next();                           // Input Last Name Of Student

                                    System.out.print("Enter Father Name : ");
                                    String fathername = sc.next();                      // Input Father Name Of Student

                                    System.out.print("Enter Departemt : ");
                                    String departemnt = sc.next();                      // Input Department Of Student

                                    System.out.print("Enter Sem : ");
                                    String sem = sc.next();                             // Input Sem Of Student

                                    s.addNewStudent(fname, lname, fathername, departemnt, sem, enrollmentnum); // called method to add New Student Details To 'StudentData.csv' file.
                                }
                                // End Of 'Add New Student' Option.
                                else if(choice1 == 2){
                                    System.out.println("\n ---- Remove Student ----");

                                    System.out.print("\nEnter Enrollment NUmber Of Student : ");
                                    String enrollmentno = sc.next();

                                    int rvalue = s.removestudent(enrollmentno);

                                    if(rvalue == 0){
                                        System.out.println("\nStudent Profile Deleted Successfully - ");
                                    }
                                    else if(rvalue == 1){
                                        System.out.println("\nStudent Not Found , Check Enrollment Number And Try Again - ");
                                    }
                                }
                                else if(choice1 == 3){
                                    System.out.println("\n ---- Search Student Profile ----");

                                    System.out.print("\nEnter Student First Name 'or' Enrollment Number : ");
                                    String input = sc.next();

                                    s.searchStudent(input);
                                }
                                else if(choice1 == 4){
                                    int choice14 = -1;
                                    do {
                                        System.out.println("\n ---- Update Student Profile ----");

                                        System.out.println("1 - Change First Name");
                                        System.out.println("2 - Change Last Name");
                                        System.out.println("3 - Change Father Name");
                                        System.out.println("4 - Change Department");
                                        System.out.println("5 - Change Sem");
                                        System.out.println("0 - Exit");

                                        System.out.print("\nEnter Your Choice : ");
                                        choice14 = sc.nextInt();

                                        if(choice14 == 1){
                                            System.out.println("\n\n -- Change First Name -- ");

                                            System.out.print("\nEnter Your Enrollment Number : ");
                                            String enrollmentno = sc.next();

                                            System.out.print("\nEnter Your First Name : ");
                                            String fname = sc.next();
                                   
                                            int rvalue = s.updatestudentdata(enrollmentno,fname,1);

                                            if(rvalue == 0){
                                                System.out.println("\nFirst Name Changed Successfully - ");
                                            }
                                            else if(rvalue == 1){
                                                System.out.println("\nStudent Not Found , Check Enrollment Number And Try Again - ");
                                            }
                                        }
                                        else if(choice14 == 2){
                                            System.out.println("\n -- Change Last Name -- ");

                                            System.out.print("\nEnter Your Enrollment Number : ");
                                            String enrollmentno = sc.next();

                                            System.out.print("\nEnter Your Last Name : ");
                                            String lname = sc.next();

                                            int rvalue = s.updatestudentdata(enrollmentno, lname,2);

                                            if(rvalue == 0){
                                                System.out.println("\nLast Name Changed Successfully - ");
                                            }
                                            else if(rvalue == 1){
                                                System.out.println("\nStudent Not Found , Check Enrollment Number And Try Again - ");
                                            }

                                        }
                                        else if(choice14 == 3){
                                            System.out.println("\n -- Change Father Name -- ");

                                            System.out.print("\nEnter Your Enrollment Number : ");
                                            String enrollmentno = sc.next();

                                            System.out.print("\nEnter Your Father Name : ");
                                            String fathername = sc.next();

                                            int rvalue = s.updatestudentdata(enrollmentno, fathername,3);

                                            if(rvalue == 0){
                                                System.out.println("\nFather Name Changed Successfully - ");
                                            }
                                            else if(rvalue == 1){
                                                System.out.println("\nStudent Not Found , Check Enrollment Number And Try Again - ");
                                            }
                                        }
                                        else if(choice14 == 4){
                                            System.out.println("\n -- Change Department -- ");

                                            System.out.print("\nEnter Your Enrollment Number : ");
                                            String enrollmentno = sc.next();

                                            System.out.print("\nEnter Your Department : ");
                                            String department = sc.next();

                                            int rvalue = s.updatestudentdata(enrollmentno, department,4);

                                            if(rvalue == 0){
                                                System.out.println("\nDepartment Changed Successfully - ");
                                            }
                                            else if(rvalue == 1){
                                                System.out.println("\nStudent Not Found , Check Enrollment Number And Try Again - ");
                                            }
                                        }
                                        else if(choice14 == 5){
                                            System.out.println("\n -- Change Sem -- ");

                                            System.out.print("\nEnter Your Enrollment Number : ");
                                            String enrollmentno = sc.next();

                                            System.out.print("\nEnter Your Semester : ");
                                            String sem = sc.next();

                                            int rvalue = s.updatestudentdata(enrollmentno, sem,5);

                                            if(rvalue == 0){
                                                System.out.println("\nSemester Changed Successfully - ");
                                            }
                                            else if(rvalue == 1){
                                                System.out.println("\nStudent Not Found , Check Enrollment Number And Try Again - ");
                                            }
                                        }
                                        else if(choice14 == 0){
                                            System.out.println("\nStudent Data Update Menu Exited - ");
                                        }
                                        else{
                                            System.out.println("\nInvalid Input - ");
                                        }

                                    }while (choice14!=0);
                                }
                                else if(choice1 == 0){
                                    System.out.println("\nExited Faculty Menu - ");
                                }
                                else{
                                    System.out.println("\nInvalid Input -");
                                }

                            } while (choice1!=0);

                            break;
                        }

                        else{
                            System.out.println("\nIncorrect User Id 'or' Password , try again - ");
                        }
                        break;
                case 2:
                    System.out.println("\n-- Student Login -- ");

                    System.out.print("\nEnter Enrollment Number : ");
                    String enrollmentNumber = sc.next();

                    System.out.print("Enter Password : ");
                    String password = sc.next();

                    if(lg.studentlogin(enrollmentNumber,password)){

                        System.out.println("\nLogin Successfully");
                        int choice2 = -1;
                        do {
                            
                            System.out.println("\n -------- Student Menu --------");
                            System.out.println("\n1 - Search Result");
                            System.out.println("0 - Exit");

                            System.out.print("\nEnter Choice : ");
                            choice2 = sc.nextInt();

                            if(choice2 == 1){

                                Result r = new Result();
                                System.out.println("\n -- Search Result -- ");

                                System.out.print("\nEnter Your Enrollment Number : ");
                                String enrollmentNum = sc.next();

                                System.out.print("\nEnter Sem 'or' Enter 0 To Show All Sems Result : ");
                                String sem = sc.next();
                                int rvalue = r.printdata(enrollmentNum,sem);

                                if(rvalue == 1){
                                    System.out.print("Given Enrollment Number Is Not Found , Check And Try Again - ");
                                }
                                else if(rvalue == -1){
                                    System.out.print("Something Went Wrong - ");
                                }
                                else if(rvalue == 3){
                                    System.out.println("Given Sem Is Not Found , Check And Try Again - ");
                                }
                            }
                            else if(choice2 == 0){
                                System.out.println("\nStudent Menu Exited");
                            }
                            else{
                                System.out.println("\nWrong Input");
                            }

                        } while (choice2!=0);
                        
                    break;

                    }
                    else{
                        System.out.println("\nIncorrect User Id 'or' Password , try again - ");
                    }

                    break;

                case 0:
                    System.out.println("\nExited");
                    break;
                
                default:
                    System.out.println("\nWrong input ");
                    break;
            }    
        }while (choice!=0); 
    }
}