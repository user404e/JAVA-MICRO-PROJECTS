import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

class Stock {
    
    int searchMedicine(String medicineName,String power){

        File f = new File("StockData.csv");

        try {
            Scanner scan = new Scanner(f);
            boolean flag = false;
            while(scan.hasNextLine()){
                String medicine = scan.nextLine();
                String mdata[] = medicine.split(",");

                if(medicineName.equals(mdata[1])){

                    flag = true;

                    if(power.equals(mdata[2])){

                        System.out.println("\n!! - Medicine Data - !!");
                        System.out.println("\nManufacturer     -   " + mdata[0]);
                        System.out.println("Name             -   " + mdata[1]);
                        System.out.println("Mg               -   " + mdata[2]);
                        System.out.println("Quantity         -   " + mdata[3]);
                        System.out.println("Price Per Tablet   -   " + mdata[4]);
                    }
                    else if(power.equals("0")){

                        System.out.println("\n!! - Medicine Data - !!");
                        System.out.println("\nManufacturer     -   " + mdata[0]);
                        System.out.println("Name             -   " + mdata[1]);
                        System.out.println("Mg               -   " + mdata[2]);
                        System.out.println("Quantity         -   " + mdata[3]);
                        System.out.println("Price Per Tablet -   " + mdata[4]);
                    }
                }
            }
            if(flag){
                return 0;
            }
            else{
                return 1;
            }
        } catch (FileNotFoundException e) {
            return -1;
        }
    }

    void showallmed(){
        File f = new File("StockData.csv");

        try {
            Scanner scan = new Scanner(f);
            int count = 1;

            if(scan.hasNextLine()){

                while(scan.hasNextLine()){

                String medicine = scan.nextLine();
                String mdata[] = medicine.split(",");

                System.out.println("\n## -- Medicine " + count + " -- ##");

                System.out.println("\nManufacturer       -   " + mdata[0]);
                System.out.println("Name               -   " + mdata[1]);
                System.out.println("Mg                 -   " + mdata[2]);
                System.out.println("Quantity           -   " + mdata[3]);
                System.out.println("Price Per Tablet   -   " + mdata[4]);

                count++;
        
                }
            }
            else{
                System.out.println("\nFile Is Empty , No Medicine Data Found - ");
            }

        } catch (FileNotFoundException e) {
            System.out.println("\nFILE NOT FOUND - ");
        }
    }
}