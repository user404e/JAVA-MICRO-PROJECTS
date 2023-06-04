import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class login{
    boolean loginadmin(String userid,String pass){
        try{
            File f = new File("AdminLoginId.csv");
            Scanner scan = new Scanner(f);

            String idpass = scan.next();
            String[] idpassarr; 

            idpassarr = idpass.split(",");

            String id = idpassarr[0];
            String pas = idpassarr[1];

            if(id.equals(userid) && pas.equals(pass)){
                return true;
            }
            else{
                return false;
            }
        }
        catch(FileNotFoundException e){
            return false;
        }
    }

    boolean loginstaff(String userid,String pass){
        try{
            File f = new File("StaffLoginId.csv");
            Scanner scan = new Scanner(f);

            String idpass = scan.next();
            String[] idpassarr; 

            idpassarr = idpass.split(",");

            String id = idpassarr[0];
            String pas = idpassarr[1];

            if(id.equals(userid) && pas.equals(pass)){
                return true;
            }
            else{
                return false;
            }
        }
        catch(FileNotFoundException e){
            return false;
        }
    }
}