import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
/** 
 * Writes output file and appends survey data. 
 */ 
public class FileHandler {

	private String surveyFile; 
	private FileWriter fileOutput; 
	private PrintWriter printWriter; 
	private File outputFile;
	//constructor 
	FileHandler(){

		try 
		{
			surveyFile = "survey_results.csv"; //file name
			outputFile = new File(surveyFile); 
			fileOutput = new FileWriter(outputFile, true);
			printWriter = new PrintWriter(fileOutput);
			printWriter.println("DateTime,FirstName,LastName,PhoneNumber,Email,Sex,Water,Meals,Wheat,Sugar,Dairy,Miles,Weight"); //header

		}
		catch(IOException e)
		{

		}

	}
	/** 
	 * Writes survey data to file.  
	 * @param String containing survey data. 
	 * @return void. 
	 */ 
	public void writeResults(String surveyData) {

		printWriter.println(surveyData);
		printWriter.close(); 
	}	

}
