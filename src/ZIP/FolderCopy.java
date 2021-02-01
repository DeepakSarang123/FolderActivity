package ZIP;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class FolderCopy {

	public Path create(String repFileName, Path refPath) {

		try {

			Path path1 = refPath;
			Path path2 = Paths.get("C:\\Users\\DEEPAK\\Documents\\Files to be converted\\Destination\\" + repFileName);

			Files.copy(path1, path2);
			refPath = path2;

		} catch (Exception e) {
			System.out.println("hiii");
		}
		return refPath;

	}

}
