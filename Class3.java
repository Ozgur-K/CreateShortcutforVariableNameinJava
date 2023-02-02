import java.io.File;

public class Class3 {

	final static File folderName = new File("Path\\ToFolder");
	final static String fileNameKeyword = "File.name";
	final static String stringForExecMethod = "cmd.exe /c explorer " + lookFilesForFolderAndReturnTheCorrectOne(folderName, fileNameKeyword);
	
	public Class3() {
		
	}

	public static void main(String[] args) {

		try {
			Runtime.getRuntime().exec(stringForExecMethod);
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	public static String lookFilesForFolderAndReturnTheCorrectOne(final File folder, String fileNameKeyword) {
		String fileFullPath = "";
		for (final File fileEntry : folder.listFiles()) {
			//if (fileEntry.isDirectory()) {
				//listFilesForFolder(fileEntry);
			//} else {
				if(fileEntry.getName().contains(fileNameKeyword)) {

					fileFullPath = "\"" + fileEntry.getAbsoluteFile().toString() + "\"";
					System.out.println(fileFullPath);
				
			}
		}
		return fileFullPath;
	}

}
