package ZIP;

import java.io.File;

public class RenameFile {

	public void rename(String repFileName, String name) {

		File inside = new File(
				"C:\\Users\\DEEPAK\\Documents\\Files to be converted\\Destination\\" + repFileName + "\\" + name);
		File reName = new File("C:\\Users\\DEEPAK\\Documents\\Files to be converted\\Destination\\" + repFileName + "\\"
				+ repFileName);
		boolean success = inside.renameTo(reName);
		if (!success) {
			System.out.println("Error trying to rename file");
		}

	}

}
