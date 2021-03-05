package SerDeser;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.*;

public class FinalClass {

	public static void main(String[] args) throws JsonProcessingException {
		IssueType issueType = new IssueType("3");
		Project id = new Project("1000");
		Payload p = new Payload("Demo1_Summary", "Demo1_Description", issueType, id);
		Fields f = new Fields(p);
	ObjectMapper obj = new ObjectMapper();
	String myData = obj.writerWithDefaultPrettyPrinter().writeValueAsString(f);
	System.out.println(myData);
		
		
	}

}
