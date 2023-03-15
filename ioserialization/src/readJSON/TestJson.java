package readJSON;
import java.io.FileWriter;
import java.io.IOException;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
public class TestJson {

	public static void main(String[] args)  {
		JSONObject employeeDetails=new JSONObject();
		employeeDetails.put("Firstname","Anil");
		employeeDetails.put("alstName","Boppuri");
		employeeDetails.put("Website","javaport.in");
		JSONObject employeeObject=new JSONObject();
		employeeObject.put("employee",employeeDetails);
		JSONObject employeeDetails2=new JSONObject();
		employeeDetails2.put("Firstname","AMina");
		employeeDetails2.put("alstName","JA");
		employeeDetails2.put("WEbsite","www.amina,ja");
		JSONObject employeeObject2 = new JSONObject(); 
        employeeObject2.put("employee", employeeDetails2);
        JSONArray employeeList = new JSONArray();
        employeeList.add(employeeObject);
        employeeList.add(employeeObject2);
        try(FileWriter file=new FileWriter("employees.json")){  //new construct introduced in java 7. 
        	file.write(employeeList.toJSONString());
        	file.flush();
        }
        catch(IOException e) {
        	e.printStackTrace();
        }
		
		
		// TODO Auto-generated method stub

	}

}
