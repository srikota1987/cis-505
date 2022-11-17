import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

import com.opencsv.CSVReader;
import com.opencsv.CSVWriter;
import com.opencsv.exceptions.CsvValidationException;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

public class CSVHelper {
	
	private static File file = new File("grades.csv");
	private static CSVReader csvReader = null;
	private static CSVWriter writer = null;
	

	
	public static void writeData(String[] studentData) throws IOException, CsvValidationException {
		

			FileWriter outputfile = new FileWriter(file, true);
			writer = new CSVWriter(outputfile);
			
			csvReader = new CSVReader(new FileReader("grades.csv"));
			
			String[] value;
			
			//Create the header
			if ((value = csvReader.readNext()) == null) {
	
				String[] header = { "firstName", "lastName", "course", "grade" };
                writer.writeNext(header);
			}
			
			
            writer.writeNext(studentData);
            
            // closing writer connection
            writer.close();	
		
	}
	
	public static ObservableList<String> readData() throws FileNotFoundException{
		
		csvReader = new CSVReader(new FileReader("grades.csv"));
		ArrayList<String> students = new ArrayList();
		
		csvReader.forEach(value -> students.add(new Student(value[0], value[1], value[2], value[3]).toString()));
		
		//Remove the header
		
		if(students.size() > 0) {
			students.remove(0);
		}
		
		 ObservableList<String> data = FXCollections.observableArrayList(students);
		 
		 try {
			csvReader.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		 
		 return data;
	}

}
