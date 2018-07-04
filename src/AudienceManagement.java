import java.util.ArrayList;

/**
 * @author viswe
 * 
 */
public class AudienceManagement {

	public  int  i= 10;

	/**
	 * 
	 */
	public AudienceManagement() {
		// TODO Auto-generated constructor stub
	}
	
	/**
	 * 
	 * @param args[0]
	 * @param args[1]
	 * @param args[2]
	 */
	public static void main(String[] args) {
	
		String givenRelativePath	= args[0];
		String outputFilePath		= args[1];
		String typeOfSort			= args[2];
		
		FileManage fileManageObj = new FileManage(givenRelativePath, outputFilePath);
		
		if (fileManageObj.isValidPath() && fileManageObj.isvalidFileToProcess()) {
			
			ArrayList<Audience> unSortedAudienceList, sortedAudienceList;
			unSortedAudienceList = fileManageObj.readFromFile();
			
			CustomSorting myOwnSorting = new CustomSorting(unSortedAudienceList);
			
			sortedAudienceList = myOwnSorting.bubbleSort();
			
			fileManageObj.writeToFile(sortedAudienceList);
			
		} else {
			// Process for invalid files
		}
	}

}
