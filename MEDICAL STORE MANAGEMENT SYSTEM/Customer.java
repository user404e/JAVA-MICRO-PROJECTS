import java.io.FileWriter;
import java.time.LocalDateTime;
class Customer{

	private String nme,mno,medName,pow,medPrice,qnty;
	
	int addData(String name,String mobileNumber,String medicineName,String power,String quantity,String tprice){

		nme = name;
		mno = mobileNumber;
		medName = medicineName;
		pow = power;
		qnty = quantity;
		medPrice = tprice;

		try{
			String cdatetime = "" + LocalDateTime.now();

			String finalString = nme + "," + mno + "," + medName + "," + pow + "," + qnty + "," + medPrice + "," + cdatetime + "\n";

			FileWriter fw = new FileWriter("CustomerData.csv",true);
			
			fw.write(finalString);
			fw.close();
			return 1;
		}
		catch(Exception e){
			return 0;
		}
	}
}