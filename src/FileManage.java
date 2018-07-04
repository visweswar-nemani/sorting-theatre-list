import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;

public class FileManage {

	private String inputFilePath;
	private String outputFilePath;
	
	
	/**
	 * @param fileName
	 */
	public FileManage(String inputFilePath, String outputPath) {
		this.inputFilePath = inputFilePath;
		this.outputFilePath = outputPath;
	}
	
	/**
	 * Read the File
	 */
	public ArrayList<Audience> readFromFile() {
		
		ArrayList <Audience> inputAudieneList= new ArrayList <Audience>();
		
		try {
			FileReader fileReader = new FileReader(this.inputFilePath);
			@SuppressWarnings("resource")
			BufferedReader bufferedFileReader = new BufferedReader(fileReader);
			
			String eachRcordLine;

			while ((eachRcordLine = bufferedFileReader.readLine()) != null) {
				
				inputAudieneList.add(new Audience(eachRcordLine));
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	
		return null;
	}
	
	/**
	 * Check supportable file
	 * @return
	 */
	public boolean isvalidFileToProcess() {
		
		//Every line in input should contain id, name, tickets
		return true;
	}
	
	/**
	 * 
	 * @return
	 */
	public boolean isValidPath() {
		
		return true;
	}
	
	/**
	 * Write to a file
	 */
	public void writeToFile(ArrayList<Audience> sortedAudienceList) {
		
		// this.outputFilePath
	}
}
